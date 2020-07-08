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

 Date: 17/05/2020 20:41:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission`  (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `sys_role_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `sys_permission_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES (1, '1', '11');
INSERT INTO `sys_role_permission` VALUES (2, '1', '12');
INSERT INTO `sys_role_permission` VALUES (3, '1', '13');
INSERT INTO `sys_role_permission` VALUES (4, '1', '14');
INSERT INTO `sys_role_permission` VALUES (5, '1', '15');
INSERT INTO `sys_role_permission` VALUES (6, '2', '11');
INSERT INTO `sys_role_permission` VALUES (7, '2', '12');
INSERT INTO `sys_role_permission` VALUES (8, '2', '13');
INSERT INTO `sys_role_permission` VALUES (9, '2', '14');
INSERT INTO `sys_role_permission` VALUES (10, '2', '15');
INSERT INTO `sys_role_permission` VALUES (11, '4', '11');
INSERT INTO `sys_role_permission` VALUES (12, '4', '12');
INSERT INTO `sys_role_permission` VALUES (13, '4', '13');
INSERT INTO `sys_role_permission` VALUES (14, '4', '14');
INSERT INTO `sys_role_permission` VALUES (15, '4', '15');
INSERT INTO `sys_role_permission` VALUES (16, '4', '21');
INSERT INTO `sys_role_permission` VALUES (17, '4', '22');
INSERT INTO `sys_role_permission` VALUES (18, '4', '23');
INSERT INTO `sys_role_permission` VALUES (19, '4', '24');
INSERT INTO `sys_role_permission` VALUES (20, '4', '25');
INSERT INTO `sys_role_permission` VALUES (21, '1', '16');
INSERT INTO `sys_role_permission` VALUES (22, '1', '17');
INSERT INTO `sys_role_permission` VALUES (23, '1', '18');
INSERT INTO `sys_role_permission` VALUES (24, '2', '18');
INSERT INTO `sys_role_permission` VALUES (25, '3', '11');
INSERT INTO `sys_role_permission` VALUES (26, '3', '12');
INSERT INTO `sys_role_permission` VALUES (27, '3', '13');
INSERT INTO `sys_role_permission` VALUES (28, '3', '14');
INSERT INTO `sys_role_permission` VALUES (29, '3', '15');

SET FOREIGN_KEY_CHECKS = 1;
