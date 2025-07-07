
# Spring Data JPA Hands-On Projects

This repository contains a hands-on project demonstrating the use of **Spring Data JPA** in a Spring Boot application for managing a `Country` entity with MySQL database integration.

## 📁 Project Structure

```
orm-learn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cognizant/
│   │   │           └── ormlearn/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               │   └── exception/
│   │   │               └── OrmLearnApplication.java
│   └── resources/
│       └── application.properties
├── pom.xml
```

## ⚙️ Tech Stack

- Java 8
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## 📦 Dependencies (pom.xml)

Make sure your `pom.xml` includes:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
</dependencies>
```

## 🛠️ Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=validate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

logging.level.org.hibernate.SQL=debug
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=trace
```

## 🚀 How to Run in Eclipse

1. Clone or import the project into Eclipse as a Maven project.
2. Ensure your MySQL database is running and a schema `ormlearn` is created.
3. Update DB credentials in `application.properties`.
4. Right-click the project → Run As → Java Application.
5. Watch the console log for CRUD method outputs.

## ✅ Features Implemented

- Fetch all countries from DB
- Find a country by country code
- Add a new country
- Update existing country details
- Delete a country

## 📄 Class Overview

- `Country` - JPA entity
- `CountryRepository` - JPA repository
- `CountryService` - Service layer with business logic and transaction handling
- `CountryNotFoundException` - Custom exception
- `OrmLearnApplication` - Main class with test methods using Spring context

## 📬 Sample Test Methods in Main Class

```java
testGetAllCountries();
testFindCountryByCode();
testAddCountry();
testUpdateCountry();
testDeleteCountry();
```

## 📌 Note

Ensure that the `country` table already exists in your MySQL database before running the application.

## 📚 References

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate ORM](https://hibernate.org/orm/)

---

Happy Learning! ☕🚀
