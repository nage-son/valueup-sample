create database valueup_test CHARACTER SET utf8 COLLATE utf8_general_ci;

grant all privileges on valueup_test.* to valueup@localhost identified by '1111' with grant option;

use valueup_test;

CREATE TABLE `post` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '시퀀스',
  `title` varchar(200) NOT NULL DEFAULT '' COMMENT '제목',
  `content` text NOT NULL COMMENT '내용',
  `created_at` datetime NOT NULL COMMENT '작성일',
  `updated_at` datetime DEFAULT NULL COMMENT '수정일 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `comment` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '시퀀스',
  `post_id` int(11) NOT NULL COMMENT '포스트 일련번호',
  `content` varchar(200) NOT NULL DEFAULT '' COMMENT '코멘트 내용',
  `created_at` datetime NOT NULL COMMENT '작성일',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;