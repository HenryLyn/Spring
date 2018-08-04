CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(50) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `color` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO
    `user`
VALUES
    ('1', 'baby', '1'),
    ('2', 'kingboy', '2'),
    ('3', 'boy', '3'),
    ('4', 'kingbaby', '4');

INSERT INTO
    `address`
VALUES
    ('1', '北京', '北京'),
    ('2', '天津', '天津'),
    ('3', '安徽', '宿州'),
    ('4', '广东', '广州');

INSERT INTO
    `car`
VALUES
    ('1', 'green', '路虎', '1'),
    ('2', 'white', '奔驰', '2'),
    ('3', 'blue', '玛莎拉蒂', '4'),
    ('4', 'yellow', '兰博基尼', '4');