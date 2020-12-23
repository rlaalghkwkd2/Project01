-- employees3 ���̺� (���� ����)
CREATE TABLE employees3 (
    emp_id          NUMBER(4)
        CONSTRAINT employee1_id_pk PRIMARY KEY,
    emp_name        VARCHAR2(10)
        CONSTRAINT employee1_name_nn NOT NULL,
    emp_phone       VARCHAR2(13)
        CONSTRAINT employee1_tel_nn NOT NULL
        CONSTRAINT employee1_tel_uk UNIQUE
        CONSTRAINT employee1_tel_reg CHECK ( REGEXP_LIKE ( emp_phone,
                                                       '010-\d{4}-\d{4}' ) ),
    manager_id      NUMBER(4)
        CONSTRAINT manager1_id_nn NOT NULL,
    emp_age         NUMBER(3)
        CONSTRAINT employee1_age_nn NOT NULL,
    hire_date       DATE
        CONSTRAINT hire_date_nn NOT NULL,
    salary          NUMBER(8)
        CONSTRAINT employee1_salary_nn NOT NULL
        CONSTRAINT employee1_salary_min CHECK ( salary > 0 ),
    job_position    VARCHAR2(10)
        CONSTRAINT job_position1_nn NOT NULL,
    department_id   NUMBER(4) 
        CONSTRAINT departmen1t_id_fk REFERENCES departments3 ( department_id ),
    division        VARCHAR2(9)
        CONSTRAINT employee1_division_nn NOT NULL
        CONSTRAINT employee1_division CHECK ( division IN (
            '������',
            '�����'
        ) )
);
SELECT * FROM employees3;
-- departments3 ���̺� (�μ� ����)
CREATE TABLE departments3 (
    department_id     NUMBER(4)
        CONSTRAINT department_id_pk PRIMARY KEY,
    department_name   VARCHAR2(10)
        CONSTRAINT department_name_nn NOT NULL,
    manager_id        NUMBER(4)
        CONSTRAINT manager_id_nn NOT NULL
);
drop table departments3;
-- attendance ���̺� (�⼮ ����)
CREATE TABLE attendance (
    check_date         VARCHAR2(20)
        CONSTRAINT check_date_nn NOT NULL,
    check_in_time      VARCHAR2(15)
        CONSTRAINT check_in_time_nn NOT NULL,
    check_out_time     VARCHAR2(15),
    emp_id             NUMBER(4)
        CONSTRAINT employee_id_fk
            REFERENCES employees3 ( emp_id )
        CONSTRAINT empoyee_id_nn NOT NULL,
    emp_name           VARCHAR2(10)
        CONSTRAINT emp_id_nn NOT NULL,
    attendance_check   VARCHAR2(8)
        CONSTRAINT attendance_check_nn NOT NULL
);

---------------------------------------------- Ȯ�� ������ ----------------------------------------------
-- ���� ������ �߰�
INSERT INTO employees3 (emp_id, emp_name, emp_phone, manager_id, emp_age, hire_date, salary, job_position, division) VALUES (1, '��浿', '010-1234-5678', 1, 30, sysdate, 10000000, '����', '������');
INSERT INTO employees3 VALUES (2, 'ȫ�浿', '010-2345-6789', 1, 29, sysdate, 3000000, '����', 1, '������');
INSERT INTO employees3 VALUES (3, '�ֱ浿', '010-3456-7890', 2, 28, sysdate, 2000000, '���', 1, '������');
INSERT INTO employees3 VALUES (4, '�ڱ浿', '010-4567-8901', 1, 27, sysdate, 3000000, '����', 2, '������');
INSERT INTO employees3 VALUES (5, '�α浿', '010-5678-9012', 4, 26, sysdate, 2000000, '���', 2, '������');
INSERT INTO employees3 VALUES (6, '���浿', '010-6789-0123', 1, 25, sysdate, 3000000, '����', 3, '������');
INSERT INTO employees3 VALUES (7, '��浿', '010-7890-1234', 6, 24, sysdate, 2000000, '���', 3, '������');

-- �μ� ������ �߰�
INSERT INTO departments3 VALUES (1, '�Ǹź�', 2);
INSERT INTO departments3 VALUES (2, 'û�Һ�', 4);
INSERT INTO departments3 VALUES (3, '������', 6);

-- �⼮�� �⼮ ��ɿ��� �����ȣ �Է��ϰ� ���, ��� ������ ������ �߰��˴ϴ�.

SELECT * FROM employees3;
SELECT * FROM departments3;
SELECT * FROM attendance;
