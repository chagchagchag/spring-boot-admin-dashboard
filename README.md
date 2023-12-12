그라파나, 프로메테우스 등을 사용하는 것도 좋다. 다만 이번 글의 주제는 Spring Boot Admin Dashboard 다.<br>

<br>



### 주요 기술 의존성

- [spring boot admin - codecentric](https://github.com/codecentric/spring-boot-admin/)
- spring boot starter actuator
  - [maven - Spring Boot Starter Actuator](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator)
  - [docs.spring.io - Spring Boot Starter Actuator](https://docs.spring.io/spring-boot/docs/current/actuator-api/htmlsingle/)

<br>



### modules

- foobar-admin-server 
  - 어드민 대시보드
  - Port : 8080
- foobar-admin-client1
  - 어드민 클라이언트 1
  - Port : 8081
- foobar-admin-client2
  - 어드민 클라이언트 2
  - Port : 8082

<br>



### Screenshot

#### 대시보드

<img src="./img/SCREENSHOT1.png"/>

<br>



#### 상세페이지

##### 상세페이지 메인

<img src="./img/SCREENSHOT2.png"/>

<br>



##### Bean 선언된 내용들 확인

<img src="./img/SCREENSHOT3.png"/>

<br>



##### Configuration Properties

<img src="./img/SCREENSHOT4.png"/>

<br>



##### 스레드 덤프

<img src="./img/SCREENSHOT5.png"/>

<br>

##### Dispatcher Servet \> Handler Mapping

<img src="./img/SCREENSHOT6.png"/>