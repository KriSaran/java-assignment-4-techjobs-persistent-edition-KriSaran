-- Part 1: Test it with SQL
--Table: job
--Columns:
--id int PK
--employer varchar(255)
--name varchar(255)
--skills varchar(255)
-- Part 2: Test it with SQL
-- select name from employer where location='St.Louis';
--SELECT name from employer where location="St.Louis";
-- Part 3: Test it with SQL
DROP TABLE job;
-- Part 4: Test it with SQL
select * from skill left join job_skills on skill.id=job_skills.skills_id  where job_skills.jobs_id is not null order by name ASC;

