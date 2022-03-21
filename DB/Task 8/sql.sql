SHOW DATABASES;
show 
-- 
-- 

-- EVENTPOOL

use eventpool;
show tables;

select * from contribution;
select * from event;
select * from event_type;
select * from `group`; 
select * from refused;
select * from `user`;
select * from user_group;

-- eventpool database



select * from event 
where id in (select event_id from contribution c where user_id=9);




select * from event 
where id not in (select event_id from contribution c where user_id=11);




select u.id,COUNT(c.event_id)as paid,COUNT(r.event_id)as refused 
from `user` u 
left join contribution c 
on u.id =c.user_id  
left join refused r 
on r.user_id =u.id 
GROUP by u.id;



SELECT u.id,sum(c.amount) 
from `user` u 
left join contribution c 
on u.id =c.user_id 
GROUP BY u.id  ;



SELECT g.id ,COUNT(ug.user_id),g.name ,g.created_on,u.name as created_by 
from user_group ug 
join `group` g 
on g.id =ug.group_id 
join `user` u 
on g.created_by =u.id 
group by ug.group_id;  


-- PROCESSFLOW

use processflow;
show tables;

select * from checklist;
select * from process;
select * from process_stage_mapping;
select * from stage;
select * from stage_task_mapping;
select * from task;
select * from task_checklist_mapping;


-- Processflow database

 SELECT p.name as process_name, s.name as stage_name, t.name as task_name, group_concat(c.name) as checklist_name
 from process p inner join process_stage_mapping psm 
 on p.id =psm.process_id 
inner join stage s
on psm.stage_id =s.id
inner join stage_task_mapping stm 
on s.id =stm .stage_id 
inner join task t 
on stm.task_id =t.id
inner join task_checklist_mapping tcm 
on t.id =tcm.task_id 
inner join checklist c 
on tcm.checklist_id =c.id 
where p.id =1 group by s.name,t.name;



-- EMPLOYEE


use employee;
show tables;

select * from employee e;
select * from project_employee_mapping pem;
select * from department d;
SELECT * FROM projects p;


-- Employee database 

SELECT *FROM employee e 
inner join project_employee_mapping pem 
ON e .id = pem.employee_id 
inner join projects p 
on p .id = pem.employee_id ;

SELECT *FROM employee e 
left join project_employee_mapping pem 
ON e .id = pem.employee_id 
left  join projects p 
on p .id = pem.project_id ;


SELECT *FROM employee e 
right join project_employee_mapping pem 
ON e .id = pem.employee_id 
right  join projects p 
on p .id = pem.project_id ;

select id,
name from projects union select id,
name from department;


