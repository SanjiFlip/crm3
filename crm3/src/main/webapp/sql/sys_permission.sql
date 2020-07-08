/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : db1904

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 17/05/2020 20:41:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` bigint(20) NULL DEFAULT NULL COMMENT '父结点id',
  `parentids` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父结点id列表串',
  `sortstring` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '排序号',
  `available` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES (1, '权限', '', '', NULL, 0, '0/', '0', '1');
INSERT INTO `sys_permission` VALUES (11, '试卷管理', 'menu', '/paper_findAllSt.action', NULL, 1, '0/1/', '1.', '1');
INSERT INTO `sys_permission` VALUES (12, '试卷新增', 'menu', '/paper_addSt.action', 'paper:create', 11, '0/1/11/', '', '1');
INSERT INTO `sys_permission` VALUES (13, '试卷修改', 'menu', '/paper_updateSt.action', 'paper:update', 11, '0/1/11/', '', '1');
INSERT INTO `sys_permission` VALUES (14, '试卷删除', 'menu', '/paper_deleteSt.action', 'paper:delete', 11, '0/1/11/', '', '1');
INSERT INTO `sys_permission` VALUES (15, '试卷查询', 'menu', '/paper_findSt.action', 'paper:query', 11, '0/1/15/', NULL, '1');
INSERT INTO `sys_permission` VALUES (16, '试卷增加权限', 'permission', '/paper_addSt.action', 'paper:create', 11, '0/1/11/', NULL, NULL);
INSERT INTO `sys_permission` VALUES (17, '二级级题库操作', 'permission', '/paper_addSt.action', 'papaer:operate2', 11, '0/1/11/', NULL, NULL);
INSERT INTO `sys_permission` VALUES (18, '三级级题库操作', 'permission', '/paper_addSt.action', 'papaer:operate3', 11, '0/1/11', NULL, NULL);
INSERT INTO `sys_permission` VALUES (21, '用户管理', 'menu', '/user_queryAllUser.action', 'user:query', 1, '0/1/', '2.', '1');
INSERT INTO `sys_permission` VALUES (22, '商品新增', 'menu', '/goodsctrl/goadd.do', 'goods:add', 21, '0/1/21/', '', '1');
INSERT INTO `sys_permission` VALUES (23, '商品修改', 'menu', '/goodsctrl/goupdate.do', 'goods:update', 21, '0/1/21/', '', '1');
INSERT INTO `sys_permission` VALUES (24, '商品删除', 'menu', '/goodsctrl/delete.do', 'goods:delete', 21, '0/1/21/', '', '1');
INSERT INTO `sys_permission` VALUES (25, '商品查询', 'menu', '/goodsctrl/listpage.do', 'goods:list', 21, '0/1/21/', NULL, '1');
INSERT INTO `sys_permission` VALUES (26, '用户删除权限', 'permission', '/user_deleteUser.action', 'user:delete', 21, '0/1/21/', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
