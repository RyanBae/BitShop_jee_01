-- 계정생성
CREAT USER oracle IDENTIFIED BY password;

oracle/password

-- 권한부여
GRANT RESOURCE, CONNECT, DBA TO oracle;

-- 현재 사용자 정보
SHOW USER;

SELECT * FROM TAB;

-- 테이블 생성
CREATE TABLE account(
  accnum VARCHAR2(10), 
  today VARCHAR2(10), 
  money VARCHAR2(10), 
);

DROP TABLE account;

-- 인스턴스 생성 == DB에서 한 row 를 추가하는것
INSERT INTO account(accnum, today, money)
VALUES('hong', '홍길동', '1')

SELECT * FROM account;
