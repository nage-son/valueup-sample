# ValueUp RESTful 강의 서버 샘플
단말과의 통신을 처리하는 서버 샘플 입니다.

## 요구사항  
- JDK 1.6+
- Maven 3+
- MariaDB(MySQL)

## 환경설정
### JDK 설치
[Oracle JDK 다운르도 페이지](http://www.oracle.com/technetwork/java/javase/downloads/index.html)에서 JDK 다운로드 및 설치.  
1.6 버전의 경우는 지원 중단되었으므로 OS 환경에 따라 1.7 이상의 버전을 설치 합니다.  
아래에 사용된 이미지의 JDK 버전은 1.4.x 입니다.

#### Windows
##### JAVA_HOME 변수 등록
![설정3](https://docs.google.com/uc?id=0B02RRVY3KrmeLVRjaEItSFBUbnc)

##### PATH 반영
![PATH 설정](https://docs.google.com/uc?id=0B02RRVY3KrmebWRrYmp0cHpRZ1U)

위의 설정이 완료된 후 cmd.exe를 이용하여 설치된 자바 버전을 확인 합니다.

![버전 확인](https://docs.google.com/uc?id=0B02RRVY3KrmeU010OFBoRkJJekk)

#### Linux
CentOS 기준 입니다.

```
$ sudo yum update
$ sudo yum install java-1.7.0-openjdk.x86_64
$ java -version
java version "1.7.0_79"
OpenJDK Runtime Environment (rhel-2.5.5.3.el6_6-x86_64 u79-b14)
OpenJDK 64-Bit Server VM (build 24.79-b02, mixed mode)
```

### Maven 설치
[Apache Maven](https://maven.apache.org/download.cgi)에서 다운로드 및 설치.  
3.3 이상의 버전일 경우 **JDK 1.7** 이상의 버전이 필요합니다.

```
$ wget http://apache.tt.co.kr/maven/maven-3/3.3.3/binaries/apache-maven-3.3.3-bin.tar.gz
$ tar xvf apache-maven-3.3.3-bin.tar.gz
$ sudo mkdir -p /opt/dev/maven
$ sudo cp -R ./apache-maven-3.3.3/* /opt/dev/maven
```

기타 배포본의 패키지 관리자에서 maven을 지원할 경우 해당 패키지 관리자를 이용하여 설치하여도 무방합니다.

#### Windows
##### M2_HOME 변수 등록
![압축해제](https://docs.google.com/uc?id=0B02RRVY3KrmeRUtXYV9mcTNYWlk)

##### PATH 반영
![PATH 설정](https://docs.google.com/uc?id=0B02RRVY3KrmedEdiUXhaMlJvak0)

위의 설정이 완료된 후 cmd.exe를 이용하여 설치된 mavne 버전을 확인합니다.

![버전 확인](https://docs.google.com/uc?id=0B02RRVY3KrmeRUdwaXFyU1p6U2s)

#### Linux
CentOS 기준 입니다. 다음의 내용을 `~/.profile` 혹은 `~/.bash_profile`에 추가합니다.

```
$ vi ~/.profile

M2_HOME=/opt/dev/maven

export M2_HOME
export PATH=$JAVA_HOME/bin:$M2_HOME/bin:...
```

위의 내용을 저장한 후 다음의 명령으로 설치된 maven 버전을 확인합니다.  
아래의 결과와 다를 수 있습니다.

```
$ source ~/.profile
$ mvn -version
Apache Maven 3.2.1 (ea8b2b07643dbb1b84b6d16e1f08391b666bc1e9; 2014-02-15T02:37:52+09:00)
Maven home: /Users/joonho/maven
Java version: 1.6.0_65, vendor: Apple Inc.
Java home: /Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
Default locale: ko_KR, platform encoding: UTF-8
OS name: "mac os x", version: "10.11", arch: "x86_64", family: "mac"
```