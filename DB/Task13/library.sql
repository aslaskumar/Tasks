CREATE DATABASE Library_MS;
USE Library_MS ;
show tables;

Create table L_std
(
std_id Varchar(10),
std_name Varchar(30) NOT NULL,
city Varchar(20),
date_register Date NOT NULL,
date_expire Date ,
std_status Varchar(15)NOT NULL,
Constraint Library_1 PRIMARY KEY(std_id)
);


Create table L_suplier_dtls
(
sup_id Varchar(3),
sup_name Varchar(30) NOT NULL,
address Varchar(50),
phn bigint(10) NOT NULL,
mail Varchar(15) NOT NULL,
Constraint Library_2 PRIMARY KEY(sup_id)
);



Create table L_fine_dtls
(
fine_range Varchar(3),
fine_amount decimal(10,2) NOT NULL,
Constraint Library_3 PRIMARY KEY(fine_range)
);

drop table L_suplier_dtls ;

Create table L_book_dtls
(
code Varchar(10), 
title Varchar(50) NOT NULL,
category Varchar(15) NOT NULL,
author Varchar(30) NOT NULL,
publication Varchar(30),
publish_date Date,
edition int(2),
price decimal(8,2) NOT NULL, 
table_row Varchar(10),
arrival_date Date NOT NULL,  
sup_id Varchar(3) NOT NULL,
Constraint Library_4 PRIMARY KEY(code), 
Constraint Library_4a FOREIGN KEY(sup_id) References L_suplier_dtls(sup_id)
);

drop table L_book_dtls ;

Create table L_book_issue
(
issue_no int,
std_id Varchar(10) NOT NULL,
code Varchar(10) NOT NULL,
issue_date Date NOT NULL,
return_date Date NOT NULL,
returned_date Date NULL,
fine_range Varchar(3),
Constraint Library_5 PRIMARY KEY(issue_no),
Constraint Library_Mem FOREIGN KEY(std_id) References L_std(std_id),
Constraint Library_BookDetail FOREIGN KEY(code) References L_book_dtls(code),
Constraint Library_FineDetail FOREIGN KEY(fine_range) References L_fine_dtls(fine_range)
);



Insert into L_std 
Values('1', 'aslas', 'hyderabad', '2021-02-12', '2022-02-11','Temporary');

Insert into L_std
Values('2', 'manu', 'secundrabad', '2021-04-10', '2022-04-09','Temporary');

Insert into L_std
Values('3', 'rohith', 'karnataka', '2021-05-13','2022-05-12', 'Permanent');

Insert into L_std
Values('4', 'prem', 'hyderabad', '2021-04-22', '2022-04-21', 'Temporary');

Insert into L_std
Values('5', 'sai', 'hyderabad', '2021-03-30', '2022-05-16','Temporary');

select * from L_std ls ;


Insert into L_suplier_dtls 
Values ('1','bookstore1', 'india', 212135,'dsvsd@gmail.com');

Insert into L_suplier_dtls 
Values ('2','bookstore2', 'madhapur', 4263255 ,'sfhg@gmail.com');

Insert into L_suplier_dtls 
Values ('3','bookstore3', 'secundrabad', 573463,'dvsgd@gmail.com');

Insert into L_suplier_dtls 
Values ('4','hyderabadstore', 'hyderabad', 547363,'fsbh@gmail.com');

Insert into L_suplier_dtls 
Values ('5','indianstore', 'india', 53523523,'eidsf@gmail.com');


select * from L_suplier_dtls;


Insert into L_fine_dtls Values('0', 0);

Insert into L_fine_dtls Values('1', 20);

insert into L_fine_dtls Values('2', 50);

Insert into L_fine_dtls Values('3', 75);

Insert into L_fine_dtls Values('4', 100);

Insert into L_fine_dtls Values('5', 150);


select * from L_fine_dtls;


Insert into L_book_dtls
Values('ABC123', 'frontend', 'html,css', 'author1', 'person1', '2021-03-17', 1, 500, 'table1', '2022-05-1', '1');

Insert into L_book_dtls
Values('ABC124', 'frontend', 'javascript', 'author2', 'person2', '2021-04-1', 2, 600, 'table2', '2022-05-2', '2');

Insert into L_book_dtls
Values('ABC125', 'frontend', 'java', 'author3', 'person3', '2021-04-1', 3, 700, 'table3', '2022-05-3', '3');

Insert into L_book_dtls
Values('ABC126', 'backend', 'DBMS', 'author4', 'person4', '2021-04-1', 4, 800, 'table4', '2022-05-4', '4');

Insert into L_book_dtls 
Values('ABC127', 'frontend', 'angular', 'author5', 'person5', '2021-04-1', 5, 900, 'table5', '2022-05-5', '5');



select * from L_book_dtls;


Insert into L_book_issue 
Values (01, '1', 'ABC123', '2021-05-01', '2022-05-16', '2022-05-10', '0');

Insert into L_book_issue 
Values (02, '2', 'ABC124', '2021-05-01', '2022-05-06','2022-05-11', '1');

Insert into L_book_issue
Values (03, '3', 'ABC125', '2021-04-01', '2022-04-16', '2022-05-12','2');

Insert into L_book_issue 
Values (04, '4', 'ABC126', '2021-04-01', '2022-04-16','2022-05-13', '3');

Insert into L_book_issue 
Values (05, '5', 'ABC127', '2021-03-30', '2022-04-15','2022-05-14' , '4');


select * from L_book_issue;




delete from L_book_issue  where std_id=1; 









