CREATE TABLE product_record ( -- �Ǹŵ� ��ǰ���� : �Ǹ��Ѽ���, ��ǰID, ��ǰ�̸�, ��ǰ����, �ȸ��ð�
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