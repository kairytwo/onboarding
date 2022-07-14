
## Run
##### mvn spring-boot:run

## On develop swagger and h2 url
##### http://localhost:8081/swagger-ui.html
##### http://localhost:8081/h2/login.jsp

## Health check
##### http://localhost:8081/actuator

## Build
##### mvn clean package 

# Contribute

##### https://spring.io/projects/spring-boot
##### https://projectlombok.org/
##### https://github.com/jwtk/jjwt

## Container Build
```shell
## Build from jar 
$ mvn clean package
$ docker build -t backend:v1 -f Dockerfile-openjdk .

## Build from source
$ docker build -t backend:v1-src -f Dockerfile-maven .

## Run 
$ docker run -d -p 8080:8080 backend:v1

## Run with environment 
$ docker run -d -p 8080:8080 \
  -e SERVER_PORT=8080 \
  backend:v1

```

Navigate to [https://nexus.tbb-lab.k8s.tw:8443/#browse/welcome](https://nexus.tbb-lab.k8s.tw:8443/#browse/welcome) to view the result