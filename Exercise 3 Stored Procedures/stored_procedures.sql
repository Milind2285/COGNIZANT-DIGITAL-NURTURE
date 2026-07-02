SET SERVEROUTPUT ON;

-- Create Employees Table
CREATE TABLE Employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    salary NUMBER
);

-- Insert Sample Data
INSERT INTO Employees VALUES (101, 'Alice', 50000);
INSERT INTO Employees VALUES (102, 'Bob', 60000);
INSERT INTO Employees VALUES (103, 'Charlie', 70000);

COMMIT;

-- Create Stored Procedure
CREATE OR REPLACE PROCEDURE GetEmployeeSalary(
    p_emp_id IN NUMBER
)
AS
    v_salary Employees.salary%TYPE;
BEGIN
    SELECT salary
    INTO v_salary
    FROM Employees
    WHERE emp_id = p_emp_id;

    DBMS_OUTPUT.PUT_LINE('Salary: ' || v_salary);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Employee not found.');
END;
/

-- Execute Procedure
BEGIN
    GetEmployeeSalary(102);
END;
/