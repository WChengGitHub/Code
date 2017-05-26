create database find_meal_card;
use	find_meal_card;
create table tb_canteen_worker(
	cwid     VARCHAR(50) not null PRIMARY key,
	phone    VARCHAR(50) not null,
	password VARCHAR(50) not null,
	address  varchar(100) not null
);
create table tb_student_card(
 cid VARCHAR(50) not null PRIMARY key,
 studentNumber VARCHAR(50) not null,
 status bit(1) not null default 0,
 cwid VARCHAR(50) not null,
 FOREIGN key(cwid) REFERENCES tb_canteen_worker(cwid)
);
use find_meal_card;
use find_meal_card;
CREATE PROCEDURE query(studentNumber VARCHAR(50))
BEGIN
  select DISTINCT address  from tb_canteen_worker where tb_canteen_worker.cwid in(select cwid from tb_student_card where tb_student_card.studentNumber=studentNumber and tb_student_card.`status`=false);
END

