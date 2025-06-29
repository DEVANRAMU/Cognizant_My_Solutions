# 🔍 Exercise 1: Mocking and Stubbing with Mockito

This exercise demonstrates how to use **Mockito** to mock and stub dependencies in unit tests. Specifically, we mock an external API that a service class depends on, and test the service in isolation.

---

## 📘 Scenario

You need to test a service (`MyService`) that depends on an external API (`ExternalApi`). To avoid calling the real API during unit testing, you'll:

- Create a **mock** of the `ExternalApi`.
- **Stub** its method to return a predefined response.
- Inject the mock into `MyService` and assert the expected behavior.

---

## ✅ Objectives

- Understand how to mock dependencies using Mockito.
- Stub methods to return test values.
- Write unit tests that verify behavior independently of external systems.

---

## 🛠 Prerequisites

Make sure your project uses **JUnit 5** and includes **Mockito** dependencies. If you're using Maven, add this to your `pom.xml`:

```xml
<dependencies>
  <!-- JUnit 5 -->
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
  </dependency>

  <!-- Mockito -->
  <dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
  </dependency>
</dependencies>

Project Structure
mocking-stubbing-mockito/
├── pom.xml
└── src/
    ├── main/java/com/example/ExternalApi.java
    ├── main/java/com/example/MyService.java
    └── test/java/com/example/MyServiceTest.java


 What This Test Does
Mocks the ExternalApi interface.

Stubs the getData() method to return "Mock Data".

Asserts that MyService.fetchData() returns the stubbed value.

✅ Expected Output
If implemented correctly, the test will pass:
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

🧰 Technologies Used
Java 8+
JUnit 5
Mockito 5
Maven
