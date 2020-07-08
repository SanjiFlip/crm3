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

 Date: 16/04/2020 23:24:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `upass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `active` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (31, 'admin', '123', '男', 25, '2012-01-07', '1', '1555233184533.jpg');
INSERT INTO `users` VALUES (32, '王五', '123', '男', 15, '2012-06-19', '1', '1555233191295.jpg');
INSERT INTO `users` VALUES (34, '周蕾', '123', '女', 19, '1999-10-02', '0', '1555233196686.jpg');
INSERT INTO `users` VALUES (35, '梓童', '123', '女', 1, '2025-06-12', '0', '1555233169732.jpg');
INSERT INTO `users` VALUES (36, '之周', '666', '男', 55, '2025-06-18', '0', '1555233224660.jpg');
INSERT INTO `users` VALUES (45, 'smsm', '123', '男', 180, '2019-04-16', '1', '1555234273325.jpg');
INSERT INTO `users` VALUES (46, '蕾蕾蕾', '123', '男', 123, '2019-04-01', '0', '1555233468326.jpg');
INSERT INTO `users` VALUES (47, '祝勇', '123', '男', 20, '2018-11-13', '0', '1556419758998.jpg');
INSERT INTO `users` VALUES (48, '思创', '88888', '女', 180, '2019-04-17', '1', '1556421141523.jpg');
INSERT INTO `users` VALUES (49, '哈哈哈哈哈哈', '5858585', '男', 20, '2019-04-02', '1', '1556422076357.jpg');
INSERT INTO `users` VALUES (50, '思创', '1111111', '女', 20, '2019-04-08', '0', '1556423927943.jpg');
INSERT INTO `users` VALUES (51, '王意', '123', '男', 20, '2019-07-16', '1', NULL);

SET FOREIGN_KEY_CHECKS = 1;
