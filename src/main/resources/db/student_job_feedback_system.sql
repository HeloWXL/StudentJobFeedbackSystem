/*
Navicat MySQL Data Transfer

Source Server         : learn
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : student_job_feedback_system

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-08-27 22:54:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `couser_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) DEFAULT NULL,
  `course_picture` varchar(255) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`couser_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for rank
-- ----------------------------
DROP TABLE IF EXISTS `rank`;
CREATE TABLE `rank` (
  `rank_id` int(11) NOT NULL AUTO_INCREMENT,
  `socre_id` int(11) DEFAULT NULL,
  `rank_score` int(11) DEFAULT NULL,
  PRIMARY KEY (`rank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rank
-- ----------------------------

-- ----------------------------
-- Table structure for rank_sum_score
-- ----------------------------
DROP TABLE IF EXISTS `rank_sum_score`;
CREATE TABLE `rank_sum_score` (
  `rank_sum_score_id` int(11) NOT NULL AUTO_INCREMENT,
  `sum_score_id` int(11) DEFAULT NULL,
  `rank_sum_score` int(11) DEFAULT NULL,
  PRIMARY KEY (`rank_sum_score_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rank_sum_score
-- ----------------------------

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `work_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`score_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_sno` varchar(255) DEFAULT NULL,
  `student_name` varchar(255) DEFAULT NULL,
  `student_password` varchar(255) DEFAULT NULL,
  `student_profession` varchar(255) DEFAULT NULL,
  `student_apartment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for sum_score
-- ----------------------------
DROP TABLE IF EXISTS `sum_score`;
CREATE TABLE `sum_score` (
  `sum_score_id` int(11) NOT NULL AUTO_INCREMENT,
  `score_id` int(11) DEFAULT NULL,
  `sum_score` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sum_score_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sum_score
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(255) DEFAULT NULL,
  `teacher_tno` varchar(255) DEFAULT NULL,
  `teacher_password` varchar(255) DEFAULT NULL,
  `teacher_job_title` varchar(255) DEFAULT NULL,
  `teacher_profession` varchar(255) DEFAULT NULL,
  `teacher_apartment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `work_id` int(11) NOT NULL AUTO_INCREMENT,
  `work_name` varchar(255) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `word_url` varchar(255) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work
-- ----------------------------
