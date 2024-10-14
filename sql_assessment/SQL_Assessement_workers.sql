CREATE TABLE WORKERS(WOKERID INT PRIMARY KEY NOT NULL,FIRSTNAME VARCHAR(50),LASTNAME VARCHAR(50),SALARY BIGINT,JOINGDATE DATE,DEPARTMENT VARCHAR(50));
INSERT INTO WorkerS VALUES 
(1,'Monika', 'Arora',100000,'2020-02-14','HR'),
(2,'Niharika', 'Verma',80000,'2011-02-14','Admin'),
(3,'Vishal', 'Singhal',300000,'2020-02-14','HR'),
(4,'Amitabh', 'Singh',500000,'2020-02-14','Admin'),
(5,'Vivek', 'Bhati',500000,'2011-06-14','Admin'),
(6,'Vipul', 'Diwan',200000,'2011-06-14','Account'),
(7,'Satish', 'Kumar',75000,'2020-01-14','Account'),
(8,'Geetika', 'Chauhan',90000,'2011-04-14','Admin');
 
SELECT * FROM WORKERS;

CREATE TABLE Bonus(
	worker_ref_id INT REFERENCES WorkerS(wokerid),
	bonus_amount BIGINT,
	bonus_date DATE
);
 
INSERT INTO Bonus(worker_ref_id, bonus_amount,bonus_date) VALUES
(1,5000,'2020-02-16'),
(2,3000,'2011-06-16'),
(3,4000,'2020-02-16'),
(1,4500,'2020-02-16'),
(2,3500,'2011-02-16'),
(4,4500,'2020-02-16'),
(5,3500,'2011-02-16');
 
SELECT * FROM Bonus;
 
CREATE TABLE Title(
	worker_ref_id INT REFERENCES WorkerS(wokerid),
	worker_title VARCHAR(20),
	affected_from DATE
);
 
INSERT INTO Title(worker_ref_id,worker_title,affected_from) VALUES
(1,'Manager','2016-02-20'),
(2,'Executive','2016-02-20'),
(8,'Executive','2016-02-20'),
(5,'Manager','2016-02-20'),
(4,'Asst. Manager','2016-02-20'),
(7,'Executive','2016-02-20'),
(6,'Lead','2016-02-20'),
(3,'Lead','2016-02-20');
 
SELECT * FROM Title;
 
SELECT 
    w.firstname, 
    w.salary, 
    t.worker_title 
FROM 
    WorkerS w
LEFT JOIN 
    Title t ON w.wokerid = t.worker_ref_id;

CREATE OR REPLACE FUNCTION count_workers_nth_highest_salary(n INT)
RETURNS INT AS $$
DECLARE
    nth_salary BIGINT;
    worker_count INT;
BEGIN
    SELECT DISTINCT salary 
    INTO nth_salary
    FROM Workers
    ORDER BY salary DESC
    OFFSET n - 1 LIMIT 1;
    SELECT COUNT(*)
    INTO worker_count
    FROM Workers
    WHERE salary = nth_salary;
 
    RETURN worker_count;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 0;
END;
$$ LANGUAGE plpgsql;
 
SELECT count_workers_nth_highest_salary(1);
 
