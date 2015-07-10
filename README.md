# ValueUp RESTful 강의 서버 샘플
단말과의 통신을 처리하는 서버 샘플 입니다.

## 요구사항  
- JDK 1.7+
- Maven 3+
- MariaDB(MySQL)

## Google compute engine
VM Instance 생성은 강의시간에 설명합니다.

## DB 생성
`git clone`을 이용하여 clone한 후 프로젝트 폴더에서 다음의 명령어로 DB 생성, 권한 부여 및 테이블을 생성합니다.

```
$ mysql -uroot < ddl.sql
```
root 계정에 비밀번호가 부여되었을 경우에는 -p 옵션을 추가합니다.

```
$ mysql -uroot -p < ddl.sql
```
생성이 완료된 후 접속 여부를 확인합니다. **ddl.sql** 파일에 명시된 것처럼 비밀번호는 **1111** 입니다.

```
$ mysql -uvalueup -p valueup_test
Enter password:
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 97
Server version: 5.5.41-MariaDB MariaDB Server

Copyright (c) 2000, 2014, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [valueup_test]>
```

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
