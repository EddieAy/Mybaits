create table t_car(
    id bigint auto_increment primary key,
    carNum varchar(255),
    brand varchar(255),
    guidePrice decimal(10,2),
    produceTime char(10),
    carType varchar(255)
);