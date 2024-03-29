CREATE TABLE employees(
	id INT GENERATED ALWAYS AS IDENTITY,
	first_name VARCHAR(40) NOT NULL,
	last_name VARCHAR(40) NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE employee_audits (
	id INT GENERATED ALWAYS AS IDENTITY,
	employee_id INT NOT NULL,
	last_name VARCHAR(40) NOT NULL,
	changed_on TIMESTAMP(6) NOT NULL
);

CREATE OR REPLACE FUNCTION log_last_name_changes()
RETURNS TRIGGER
LANGUAGE PLPGSQL
AS	
$$
BEGIN
	IF NEW.last_name <> OLD.last_name THEN
		INSERT INTO employee_audits(employee_id,last_name,changed_on)
		VALUES(OLD.ID,OLD.last_name,now());
		
	END IF;
	RETURN NEW;
END;
$$

CREATE TRIGGER last_name_changes
BEFORE UPDATE
ON employees
FOR EACH ROW
EXECUTE PROCEDURE log_last_name_changes();

INSERT INTO employees(first_name,last_name) VALUES ('John', 'doe');
INSERT INTO employees(first_name,last_name) VALUES ('Nicolas', 'rosca')

UPDATE employees SET last_name = 'Brown' WHERE id =2;

SELECT*FROM employees

SELECT*FROM employee_audits