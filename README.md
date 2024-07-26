# ELK MySQL 연동 실습
## titanic 데이터를 활용한 시각화
### 팀원: 최영하, 안재형, 이유나

환경 구축
Ubuntu - ElasticSearch, Logstash, Kibana, MySQL

DB
Table1 - titanic
-> 이 테이블을 logstash가 주시하고 있음
-> titanic_raw 테이블로부터 데이터 받아와서 삽입
Table2 - titanic_raw : 원본 데이터

흐름 (?
Java 파일
-> MySQL 연동하고 insert문을 통해 객실등급에 따른 데이터를 순차적으로 삽입
MySQL
-> 입력 받은 데이터에 한하여 삽입
Logstash
-> 데이터 전처리
ElasticSearch

Kibana
(주제별 시각화 사진 및 분석)
