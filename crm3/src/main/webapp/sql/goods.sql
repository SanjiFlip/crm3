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

 Date: 16/04/2020 23:24:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gprice` float(10, 2) NULL DEFAULT NULL,
  `buynum` int(11) NULL DEFAULT NULL,
  `gnum` int(11) NULL DEFAULT NULL,
  `gpic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`gid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (5, '爆米花', 33.20, NULL, 80, '1587049001553.jpg');
INSERT INTO `goods` VALUES (6, '九九', 56.20, NULL, 55, NULL);
INSERT INTO `goods` VALUES (7, '爆米花', 29.00, 1, 20, NULL);
INSERT INTO `goods` VALUES (8, '士力架', 22.00, 2, 50, NULL);

SET FOREIGN_KEY_CHECKS = 1;
