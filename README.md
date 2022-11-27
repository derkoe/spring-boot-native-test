# Spring Boot Native Test

This repository tests a set of features of Spring Boot 3 with GraalVM Native Image.

## Build

Compile the application to a native binary (GraalVM + native-image required):

```
mvn package -Pnative native:compile -DskipTests
```

Package the application as a native container image (Docker is required):

```
mvn spring-boot:build-image -Pnative -DskipTests
```

## Current Issues

Current open issues with Spring Boot 3:

* Liquibase is not working - see https://github.com/oracle/graalvm-reachability-metadata/pull/118 for the full fix
* Hibernate `@CreationTimestamp` and `@UpdateTimestamp` do not work - see [HibernateNativeHints.java](https://github.com/derkoe/spring-boot-native-test/blob/main/src/main/java/bootnative/HibernateNativeHints.java)
* Actuator does not work in combination with Spring Data JPA - see [ActuatorNativeHints.java](https://github.com/derkoe/spring-boot-native-test/blob/main/src/main/java/bootnative/ActuatorNativeHints.java)

