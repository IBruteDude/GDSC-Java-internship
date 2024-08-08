DROP DATABASE IF EXISTS jdbctask;
CREATE DATABASE IF NOT EXISTS jdbctask;
USE jdbctask;

CREATE TABLE IF NOT EXISTS Employee (
    Id INT, F_Name VARCHAR(20), L_Name VARCHAR(20),
    Sex ENUM('Male', 'Female'), Age INT, Address VARCHAR(50),
    Phone_Number CHAR(13), Vacation_Balance INT DEFAULT 30
);

-- INSERT INTO Employee (
--     Id, F_Name, L_Name, Sex, Age, Address, Phone_Number
-- ) VALUES (1, 'John', 'Doe', 'Male', 29, '123 Maple St, Springfield', '123-456-7890'),
--          (2, 'Jane', 'Smith', 'Female', 34, '456 Oak St, Metropolis', '987-654-3210');

-- INSERT INTO Employee (
--     Id, F_Name, L_Name, Sex, Age, Address, Phone_Number, Vacation_Balance
-- ) VALUES (3, 'Alice', 'Johnson', 'Female', 27, '789 Pine St, Gotham', '555-123-4567', 20),
--          (4, 'Bob', 'Brown', 'Male', 45, '101 Elm St, Star City', '555-987-6543', 15),
--          (5, 'Charlie', 'Davis', 'Male', 32, '202 Cedar St, Central City', '555-555-5555', 30);
--          (6, "Oldman", "Wong", "Male", 55, "123 Elm St, Star City", "555-123-0000", 25),
--          (7, "Elder", "Lee", "Female", 65, "456 Pine St, Metropolis", "555-456-1111", 40)

-- UPDATE Employee SET Vacation_Balance=45 WHERE Age > 45;
-- UPDATE Employee SET F_Name=CONCAT('Mr.', F_Name) WHERE Age > 45 AND Sex = 'Male';
-- UPDATE Employee SET F_Name=CONCAT('Mrs.', F_Name) WHERE Age > 45 AND Sex = 'Female';
