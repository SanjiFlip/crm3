package com.sc.aop;

import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sc.annotation.MyLog;
import com.sc.entity.XtLog;
import com.sc.entity.XtUserAccount;
import com.sc.service.XtLogService;
import com.sc.service.XtUserAccountService;
import com.sc.utils.IpUtils;
/**
 * 
 * @author Sanji
 * @function 系统日志：切面类处理
 */
@Aspect
@Component
public class XtLogAspect {
	
	@Autowired
	XtLogService xtLogService;
	
	@Autowired
	XtUserAccountService xtUserAccountService;
	
	//定义切点 @Pointcut
    //在注解的位置切入代码
    @Pointcut("@annotation( com.sc.annotation.MyLog)")
    public void logPoinCut() {
    }
    
    //切面 配置通知
    @AfterReturning("logPoinCut()")
    public void saveSysLog(JoinPoint joinPoint) {
        System.out.println("切面。。。。。");
        //获取登陆用户信息
        XtUserAccount account = (XtUserAccount) SecurityUtils.getSubject().getPrincipal();
        XtUserAccount login = xtUserAccountService.login(account.getUserName());
        //System.out.println("登陆用户的信息是:"+account);
        //从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //保存日志
        XtLog xtLog = new XtLog();
        //获取切入点所在的方法
        Method method = signature.getMethod();
        //获取操作
        MyLog myLog = method.getAnnotation(MyLog.class);
        if (myLog != null) {
            String value = myLog.value();
            xtLog.setPermission(value);//保存获取的操作
        }
        //操作时间
        xtLog.setVisitTime(new Date());
        xtLog.setUserId(login.getUserId());
        xtLog.setCompanyId(account.getCompanyId());
        //获取用户ip地址
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String ip = IpUtils.getIpAddress(request);
        xtLog.setVisitIp(ip);
 
        //调用service保存XtLog实体类到数据库
        xtLogService.addXtLog(xtLog);;
    }
}
