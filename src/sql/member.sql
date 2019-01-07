system/password   -> system 이라는 디폴트 ID값 / password 는 최초 설정한 비밀번호 
--계정생성
CREAT USER oracle IDENTIFIED BY password;   -> 새로운 계정생성 

oracle/password
--권한부여 
GRANT RESOURCE, CONNECT, DBA TO oracle;

--나가기 
EXIT;

-- 현재 사용자  정보
SHOW USER; 

-- 테이블 정보 
SELECT * FROM TAB; 

-- 테이블 생성
CREATE TABLE member(
    id VARCHAR2(10), 
    name VARCHAR2(10), 
    pass VARCHAR2(10), 
    ssn VARCHAR2(14)
);

-- 테이블삭제
DROP TABLE member;

--인스턴스 생성== DB에서 한 row를 추가 하는 것 (DB에서는 문자 값 ' ' 으로 표기 ) (1978년 제작으로 많이 안바뀜.) 
INSERT INTO member(id, name, pass, ssn)
VALUES('hong', '홍길동', '1', '900101-1234567')