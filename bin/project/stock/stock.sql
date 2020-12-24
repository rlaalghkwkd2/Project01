create table brand(
br_name VARCHAR2(40) primary key,--브랜드명
br_event_day VARCHAR2(40),--브랜드별 이벤트 날짜
br_number number(2)CONSTRAINT br_number_uk UNIQUE--브랜드넘버
);
--브랜드 입점 행사 날짜 조회
select br_event_day from brand where br_name='ADIDAS';
create table stock(
sh_serial_number number(5),--신발시리얼넘버
sh_size number(3),--신발사이즈
st_info number(2),--재고수량
br_storage_lct char(1)CONSTRAINT br_storage_lct_ck CHECK(br_storage_lct IN (
            'A','B','C','D','E','F')),--창고위치
sh_price number(8),--신발가격
sh_name varchar(40)primary key
);
select * from stock;
drop table stock;
create table shoes(
sh_name varchar(40),--제품명
sh_serial_number varchar(5)primary key,--신발시리얼넘버
sh_size number(3),--사이즈
st_info number(2),--재고수량
st_sales number(3),--판매량
additional_inventory number(2)--추가 주문가능 수량
);
--재고수량 조회 추가 주문 가능 조회
---------------------------------------------- 확인 절차용 ----------------------------------------------
--브랜드 입점 행사 날짜 조회
select br_event_day from brand where br_name='ADIDAS';
--브랜드 데이터 넣기
insert into brand(br_name,br_event_day,br_number)values('ADIDAS','2020-12-25',1);
insert into brand(br_name,br_event_day,br_number)values('BIRKENSTOCK','2020-12-26',2);
insert into brand(br_name,br_event_day,br_number)values('CONVERSE','2020-12-27',3);
insert into brand(br_name,br_event_day,br_number)values('NEW_BALANCE','2020-12-28',4);
insert into brand(br_name,br_event_day,br_number)values('NIKE','2020-12-29',5);
insert into brand(br_name,br_event_day,br_number)values('VANS','2020-12-30',6);
--제품명 검색하면 재고수량,사이즈,가격,창고위치 조회
select st_info,sh_size,sh_price,br_storage_lct from stock where sh_name='NIKETAILWIND';
insert into stock(sh_name,sh_serial_number,st_info,sh_size,sh_price,br_storage_lct)values('NIKETAILWIND',51230,15,230,69000,'E');
insert into stock(sh_name,sh_serial_number,st_info,sh_size,sh_price,br_storage_lct)values('NIKEREVOLUTION',52240,1,240,46900,'E');
--재고수량 조회 추가 주문 가능 조회
select st_info,additional_inventory from shoes where sh_serial_number=51240;
insert into shoes(sh_name,sh_serial_number,sh_size,st_info,additional_inventory)values('NIKEAIRTAILWIND',51230,230,20,20);
insert into shoes(sh_name,sh_serial_number,sh_size,st_info,additional_inventory)values('NIKEREVOLUTION5',51240,240,0,5);




---------------------------------------


CREATE TABLE shoes(
    shoes_serial_number NUMBER(7), -- 시리얼넘버
    sh_name VARCHAR2(40),		-- 신발이름
    sh_price NUMBER(8),	 -- 가격
    sh_size NUMBER(4), -- 사이즈
    st_info NUMBER(3), -- 재고
    st_sales NUMBER(3) -- 결제번호
);
