# ELK JDBC 연동 실습

## Team🏃‍♂️

| <img src="https://avatars.githubusercontent.com/u/22585023?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/64997345?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/102151689?v=4" width="150" height="150"/> |
| :----------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------: |
|                           [@recoild](https://github.com/recoild)                           |                       [@ChoiYoungHa](https://github.com/ChoiYoungHa)                       |                            [@0lYUMA](https://github.com/0lYUMA)                             |

## 프로젝트 개요😮

타이타닉 탑승자 그룹군을 순차적으로 입력하여 시각화
JDBC 자바 코드를 작성하여 MySQL DB에 데이터를 입력
logstash가 MySQL DB에 질의하여 얻은 데이터를 elasticsearch에 입력하고
kibana에 시각화 한다.

## 실습 목표🚘

JDBC 연동, ELK 스택 활용하여 실시간 데이터 파이프라인 구축 및 시각화 실습

## 작업 과정🛫

### 1. DBeaver에서 테이블 스키마 생성, SQL 작성👍

<div align="center">
    <img src="github_images/erd.png" alt="작업 과정">
</div>

![image](https://github.com/user-attachments/assets/5d9f62f9-3663-458f-9026-3b9de8d3ddc5)

### 2. JDBC 연동하는 서비스 코드 작성🍕<br><br>

<div align="center">
    <img src="github_images/서비스_코드_작성.png" alt="작업 과정">
</div>

<div align="center">
    <img src="github_images/테스트_코드.png" alt="작업 과정">
</div>

### 3. ELK 파이프라인 구축🥩

 <div align="center">
     <img src="github_images/elk실행장면.png" alt="작업 과정">
 </div>

### 4. logstash config 작성👓

#### 🧧<a href="logstash/conf/titanic.conf">Link</a>

![image](https://github.com/user-attachments/assets/4220db2f-370a-494d-9623-592bf2a220f6)

![image](https://github.com/user-attachments/assets/fecd6e64-79df-4dd5-b108-72fe3b921fa9)

### 5. kibana 시각화 수행✨

<div align="center">
    <img src="github_images/kibana_dashboard.png" alt="작업 과정">
</div>

<br>

## 시연 화면

<div align="center">
    <img src="github_images/video.gif" alt="작업 과정">
</div>
