create table brand(
br_name VARCHAR2(40) primary key,--�귣���
br_event_day VARCHAR2(40),--�귣�庰 �̺�Ʈ ��¥
br_number number(2)CONSTRAINT br_number_uk UNIQUE--�귣��ѹ�
);
--�귣�� ���� ��� ��¥ ��ȸ
select br_event_day from brand where br_name='ADIDAS';
create table stock(
sh_serial_number number(5),--�Ź߽ø���ѹ�
sh_size number(3),--�Ź߻�����
st_info number(2),--������
br_storage_lct char(1)CONSTRAINT br_storage_lct_ck CHECK(br_storage_lct IN (
            'A','B','C','D','E','F')),--â����ġ
sh_price number(8),--�Ź߰���
sh_name varchar(40)primary key
);
select * from stock;
drop table stock;
create table shoes(
sh_name varchar(40),--��ǰ��
sh_serial_number varchar(5)primary key,--�Ź߽ø���ѹ�
sh_size number(3),--������
st_info number(2),--������
st_sales number(3),--�Ǹŷ�
additional_inventory number(2)--�߰� �ֹ����� ����
);
--������ ��ȸ �߰� �ֹ� ���� ��ȸ
---------------------------------------------- Ȯ�� ������ ----------------------------------------------
--�귣�� ���� ��� ��¥ ��ȸ
select br_event_day from brand where br_name='ADIDAS';
--�귣�� ������ �ֱ�
insert into brand(br_name,br_event_day,br_number)values('ADIDAS','2020-12-25',1);
insert into brand(br_name,br_event_day,br_number)values('BIRKENSTOCK','2020-12-26',2);
insert into brand(br_name,br_event_day,br_number)values('CONVERSE','2020-12-27',3);
insert into brand(br_name,br_event_day,br_number)values('NEW_BALANCE','2020-12-28',4);
insert into brand(br_name,br_event_day,br_number)values('NIKE','2020-12-29',5);
insert into brand(br_name,br_event_day,br_number)values('VANS','2020-12-30',6);
--��ǰ�� �˻��ϸ� ������,������,����,â����ġ ��ȸ
select st_info,sh_size,sh_price,br_storage_lct from stock where sh_name='NIKETAILWIND';
insert into stock(sh_name,sh_serial_number,st_info,sh_size,sh_price,br_storage_lct)values('NIKETAILWIND',51230,15,230,69000,'E');
insert into stock(sh_name,sh_serial_number,st_info,sh_size,sh_price,br_storage_lct)values('NIKEREVOLUTION',52240,1,240,46900,'E');
--������ ��ȸ �߰� �ֹ� ���� ��ȸ
select st_info,additional_inventory from shoes where sh_serial_number=51240;
insert into shoes(sh_name,sh_serial_number,sh_size,st_info,additional_inventory)values('NIKEAIRTAILWIND',51230,230,20,20);
insert into shoes(sh_name,sh_serial_number,sh_size,st_info,additional_inventory)values('NIKEREVOLUTION5',51240,240,0,5);




---------------------------------------


CREATE TABLE shoes(
    shoes_serial_number NUMBER(7), -- �ø���ѹ�
    sh_name VARCHAR2(40),		-- �Ź��̸�
    sh_price NUMBER(8),	 -- ����
    sh_size NUMBER(4), -- ������
    st_info NUMBER(3), -- ���
    st_sales NUMBER(3) -- ������ȣ
);
