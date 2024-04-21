create table user (
                      id int(8) NOT NULL AUTO_INCREMENT COMMENT '学号',
                      username varchar(25) COMMENT '姓名',
                      mima varchar(25) COMMENT '密码',
                      sex int(2) COMMENT '性别',
                      email varchar(20)  COMMENT '邮箱',
                      hobby varchar(50)   COMMENT '爱好',
                      hobby2 varchar(50)   COMMENT '爱好2',
                      hobby3 varchar(50)   COMMENT '爱好3',
                      PRIMARY KEY(`id`)
)


create table Gathering(
                          id int(8) NOT NULL AUTO_INCREMENT ,
                          uid int(8) NOT NULL,
                          pid int(8) NOT NULL,
                          pName varchar(50) NOT NULL,
                          PRIMARY KEY(`id`)
)


create table Good(
                     id int(8) PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '产品编号',
                     catId int(8)  NOT NULL ,
                     tim varchar(25),
                     sim1 varchar(25),
                     sim2 varchar(25),
                     sim3 varchar(25),
                     sim4 varchar(25),
                     sim5 varchar(25),
                     alt varchar(25),
                     price int(5),
                     trFee int(3),
                     claim varchar(255),
                     remainTime  varchar(255),
                     latterNum int(6),
                     totalNum int(6),
                     tag varchar(80),
                     origin varchar(100),
                     remain int(6),
                     observeTimes int(7)
)


create table shopper(
                        id int(8) NOT NULL AUTO_INCREMENT ,
                        sname varchar(25) COMMENT '姓名',
                        phone varchar(25) ,
                        des varchar(25),
                        credit int(5),
                        cmp int(5),
                        PRIMARY KEY(`id`)
)
create table CartRec(
                        id int(8) NOT NULL AUTO_INCREMENT ,
                        cid int(8) NOT NULL ,
                        pid int(8) NOT NULL ,
                        num int(8) NOT NULL ,
                        uid int(8) NOT NULL ,
                        pName varchar(30) NOT NULL,
                        pri float NOT NULL,
                        discount float NOT NULL,
                        date  DATETIME  NOT NULL,
                        PRIMARY KEY(`id`)
)

create table `orderItem`(
                            id int(8) NOT NULL AUTO_INCREMENT ,
                            uid int(8) NOT NULL,
                            pid int(8) NOT NULL,
                            per int(6) NOT NULL,
                            statusOfOrder int(8) NOT NULL ,
                            num int(8) NOT NULL ,
                            discount float NOT NULL,
                            total int(8) NOT NULL,
                            codeOfOrder varchar(5)  NOT NULL,
                            telNumber varchar(20) NOT NULL,
                            branchNumber varchar(20) NOT NULL,
                            receiver varchar(20) NOT NULL,
                            address varchar(50) NOT NULL,
                            PRIMARY KEY(`id`)
)




CREATE TABLE `cart` (
                        `id` int(8) NOT NULL AUTO_INCREMENT,
                        `oid` int(8) NOT NULL,
                        `pid` int(8) NOT NULL,
                        PRIMARY KEY (`id`) USING BTREE
)

CREATE TABLE `classification`  (
                                   `id` int(8) NOT NULL AUTO_INCREMENT,
                                   `catName` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
                                   PRIMARY KEY (`id`) USING BTREE
)


CREATE TABLE `customer`  (
                             `cid` int(8) NOT NULL,
                             PRIMARY KEY (`cid`) USING BTREE
)

CREATE TABLE `order`  (
                          `id` int(8) NOT NULL AUTO_INCREMENT,
                          `uid` int(8) NOT NULL,
                          `num` int(8) NOT NULL,
                          `total` float NOT NULL,
                          `youhui` float NOT NULL,
                          PRIMARY KEY (`id`) USING BTREE
)



CREATE TABLE `ProductIncart`  (
                                  `pName` int(8) NOT NULL AUTO_INCREMENT,
                                  `pri` int(8) NOT NULL,
                                  `discount` float NOT NULL,
                                  `num` int(8) NOT NULL,
                                  PRIMARY KEY (`pName`) USING BTREE
)


    INSERT INTO `ProductIncart` (`pName`, `pri`, `discount`, `num`) VALUES (1, 100, 0.1, 2);
INSERT INTO `ProductIncart` (`pName`, `pri`, `discount`, `num`) VALUES (2, 150, 0.05, 3);
INSERT INTO `ProductIncart` (`pName`, `pri`, `discount`, `num`) VALUES (3, 200, 0.2, 1);
INSERT INTO `ProductIncart` (`pName`, `pri`, `discount`, `num`) VALUES (4, 75, 0.15, 5);
INSERT INTO `ProductIncart` (`pName`, `pri`, `discount`, `num`) VALUES (5, 50, 0.0, 4);


INSERT INTO `cart` (`oid`, `pid`) VALUES (1001, 1);
INSERT INTO `cart` (`oid`, `pid`) VALUES (1001, 2);
INSERT INTO `cart` (`oid`, `pid`) VALUES (1002, 3);
INSERT INTO `cart` (`oid`, `pid`) VALUES (1002, 4);
INSERT INTO `cart` (`oid`, `pid`) VALUES (1003, 5);



INSERT INTO `classification` (`catName`) VALUES ('电子产品');
INSERT INTO `classification` (`catName`) VALUES ('服装鞋包');
INSERT INTO `classification` (`catName`) VALUES ('家居生活');
INSERT INTO `classification` (`catName`) VALUES ('图书音像');
INSERT INTO `classification` (`catName`) VALUES ('食品饮料');


INSERT INTO `customer`  VALUES
                            (1001),
                            (1002),
                            (1003),
                            (1004),
                            (1005),
                            (1006),
                            (1007),
                            (1008),
                            (1009),
                            (1010);


INSERT INTO `order` (`uid`, `num`, `total`, `youhui`) VALUES
                                                          (1001, 2, 150.00, 10.00),
                                                          (1002, 3, 225.00, 15.00),
                                                          (1003, 1, 100.00, 5.00),
                                                          (1004, 4, 400.00, 30.00),
                                                          (1005, 2, 120.00, 8.00),
                                                          (1006, 1, 50.00, 2.50),
                                                          (1007, 3, 210.00, 14.00),
                                                          (1008, 2, 160.00, 11.00),
                                                          (1009, 1, 75.00, 3.75),
                                                          (1010, 2, 180.00, 12.00);



INSERT INTO `user` (`username`, `mima`, `sex`, `email`, `hobby`, `hobby2`, `hobby3`) VALUES
                                                                                         ('张三', 'password123', 1, 'zhangsan@example.com', '读书', '旅行', '音乐'),
                                                                                         ('李四', 'li4pass', 0, 'lisi@example.com', '篮球', '游泳', '看电影'),
                                                                                         ('王五', 'wangwu123', 1, 'wangwu@example.com', '编程', '摄影', '烹饪'),
                                                                                         ('赵六', 'zhaoliupass', 0, 'zhaoliu@example.com', '画画', '跑步', '钓鱼'),
                                                                                         ('孙七', 'sunqi777', 1, 'sunqi@example.com', '跳舞', '登山', '看电影');




INSERT INTO `Gathering` (`uid`, `pid`, `pName`) VALUES
                                                    (1, 1001, '聚会1'),
                                                    (2, 1002, '聚会2'),
                                                    (1, 1003, '再次聚会'),
                                                    (3, 1004, '新朋友的聚会'),
                                                    (2, 1005, '家庭聚会');

INSERT INTO Good (catId, tim, sim1, sim2, sim3, sim4, sim5, alt, price, trFee, claim, remainTime, latterNum, totalNum, tag, origin, remain, observeTimes) VALUES
                                                                                                                                                              (1, '2023-01-01', 'sim1_1.jpg', 'sim2_1.jpg', 'sim3_1.jpg', 'sim4_1.jpg', 'sim5_1.jpg', '产品A描述', 199, 10, '全新正品', '30天', 5, 100, '热门', '中国', 95, 50),

                                                                                                                                                              (2, '2023-02-01', 'sim1_2.jpg', 'sim2_2.jpg', 'sim3_2.jpg', NULL, NULL, '产品B描述', 399, 20, '官方直供', '60天', 15, 200, '促销', '进口', 180, 120);


INSERT INTO shopper (sname, phone, des, credit, cmp) VALUES
                                                         ('张三', '13800138000', '诚信经营', 95, 10),
                                                         ('李四', '13912345678', '优质服务', 90, 8),
                                                         ('王五', '15923456789', '新品上市', 92, 9),
                                                         ('赵六', '18678901234', '质量保证', 88, 7),
                                                         ('孙七', '13745678901', '快速发货', 93, 11);


INSERT INTO CartRec (cid, pid, num, uid, pName, pri, discount, date) VALUES
                                                                         (1, 1, 2, 1, '产品A', 199.00, 0.95, '2023-04-01 10:00:00'),
                                                                         (2, 2, 1, 2, '产品B', 399.00, 0.90, '2023-04-02 15:30:00'),
                                                                         (3, 3, 3, 3, '产品C', 249.00, 0.85, '2023-04-03 08:45:00'),
                                                                         (4, 4, 1, 4, '产品D', 149.00, 1.00, '2023-04-04 12:15:00'),
                                                                         (5, 5, 2, 5, '产品E', 349.00, 0.92, '2023-04-05 20:30:00');


INSERT INTO orderItem (uid, pid, per, statusOfOrder, num, discount, total, codeOfOrder, telNumber, branchNumber, receiver, address) VALUES
                                                                                                                                        (1, 1, 1, 1, 2, 0.95, 398.00, '12345', '13800138000', '001', '张三', '北京市海淀区某路1号'),
                                                                                                                                        (2, 2, 1, 2, 1, 0.90, 359.10, '67890', '13912345678', '002', '李四', '上海市黄浦区某路2号'),
                                                                                                                                        (3, 3, 1, 3, 3, 0.85, 747.00, '23456', '15923456789', '003', '王五', '广州市天河区某路3号'),
                                                                                                                                        (4, 4, 1, 1, 1, 1.00, 149.00, '78901', '18678901234', '004', '赵六', '深圳市南山区某路4号'),
                                                                                                                                        (5, 5, 1, 2, 2, 0.92, 642.24, '34567', '13745678901', '005', '孙七', '成都市武侯区某路5号');                                                                                                                                        (5, 5, 1, 2, 2, 0.92, 642.24, '34567', '13745678901', '005', '孙七', '成都市武侯区某路5号');