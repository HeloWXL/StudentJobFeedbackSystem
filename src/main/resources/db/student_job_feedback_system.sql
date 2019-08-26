/*
Navicat MySQL Data Transfer

Source Server         : learn
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : student_job_feedback_system

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-08-27 00:36:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(10) DEFAULT NULL,
  `sage` varchar(20) DEFAULT NULL,
  `ssex` varchar(255) DEFAULT NULL COMMENT '性别',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL,
  `user_picture` varchar(255) DEFAULT NULL,
  `is_login` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '钱电', '1990-12-21', '男', '2019-07-20 01:01:07', '2019-07-21 01:01:11', '/images/boy.png', '1');
INSERT INTO `student` VALUES ('2', '钱电', '1990-12-21', '男', '2019-07-12 01:01:52', '2019-07-21 01:01:57', '/images/boy.png', '1');
INSERT INTO `student` VALUES ('3', '孙风', '1990-05-20', '女', '2019-07-11 01:02:00', '2019-07-10 01:02:36', '/images/girl.png', '0');
INSERT INTO `student` VALUES ('4', '李云', '1990-08-06', '女', '2019-07-10 01:02:03', '2019-07-24 01:02:39', '/images/girl.png', '1');
INSERT INTO `student` VALUES ('5', '周梅', '1991-12-01', '男', '2019-07-10 01:02:06', '2019-07-21 01:02:52', '/images/boy.png', '0');
INSERT INTO `student` VALUES ('6', '吴兰', '1992-03-01', '女', '2019-07-09 01:02:09', '2019-07-21 01:02:54', '/images/girl.png', '0');
INSERT INTO `student` VALUES ('7', '郑竹', '1989-07-01', '男', '2019-07-03 01:02:12', '2019-07-21 01:02:48', '/images/boy.png', '1');
INSERT INTO `student` VALUES ('9', '张三', '2017-12-20', '女', '2019-07-09 01:02:15', '2019-07-21 01:03:00', '/images/girl.png', '1');
INSERT INTO `student` VALUES ('10', '李四', '2017-12-25', '男', '2019-07-10 01:02:21', '2019-07-21 01:02:42', '/images/boy.png', '1');
INSERT INTO `student` VALUES ('11', '李四', '2017-12-30', '女', '2019-06-28 01:02:24', '2019-07-21 01:03:03', '/images/girl.png', '0');
INSERT INTO `student` VALUES ('12', '赵六', '2017-01-01', '男', '2019-07-02 01:02:27', '2019-07-21 01:03:06', '/images/boy.png', '0');
INSERT INTO `student` VALUES ('13', '孙七', '2018-01-01', '女', '2019-07-09 01:02:32', '2019-07-21 01:03:11', '/images/girl.png', '1');
INSERT INTO `student` VALUES ('14', 'a', '2019-07-24', '女', '2019-07-24 11:31:03', '2019-07-24 11:31:05', '/images/girl.png', '0');
