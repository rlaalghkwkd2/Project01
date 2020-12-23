CREATE TABLE product_record ( -- 판매된 물품정보 : 판매한순서, 제품ID, 제품이름, 제품가격, 팔린시간
    SALES_NUMBER NUMBER(4),
    shoes_serial_number NUMBER(4),
    SH_NAME VARCHAR2(40),
    SH_SIZE NUMBER(3),
    SH_INFO NUMBER(2),
    SH_PRICE NUMBER(8),
    SALES_TIME DATE,
    MEMBER_CHECK VARCHAR2(2)
);

CREATE SEQUENCE sales_number START WITH 1 INCREMENT BY 1 NOCACHE;

8197762458659322