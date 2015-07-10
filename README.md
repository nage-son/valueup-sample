# ValueUp RESTful 강의 서버 샘플
단말과의 통신을 처리하는 서버 샘플 입니다.

## 요구사항  
- JDK 1.7+
- Maven 3+
- MariaDB(MySQL)

## 실행
### maven tomcat7 plugin을 이용한 실행
```
$ mvn clean tomcat7:run
```

### 미리 설치된 tomcat과 연동
해당 샘플의 war 파일을 $CATALINA_HOME/webapps 폴더에 복사 후 tomcat 재기동

- war 파일 생성  
```
$ mvn clean package
```
- war 파일 복사(yum을 이용하여 tomcat을 설치하였을 경우)  
```
$ sudo cp ./target/project-valueup.war /var/lib/tomcat/webapps
$ sudo service tomcat restart
```
