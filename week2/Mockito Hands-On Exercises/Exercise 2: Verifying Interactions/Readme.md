# ✅ Exercise 2: Verifying Interactions with Mockito

This exercise demonstrates how to use **Mockito** to verify that a specific method is called on a mock object with expected arguments. It's useful for ensuring interactions between objects occur as designed, especially when dealing with side effects or service calls.

---

## 📘 Scenario

You need to ensure that the `getData()` method of an external API is actually called by your service. Mockito allows you to **verify interactions** with mock objects during unit testing.

---

## ✅ Objectives

- Create a **mock object** using Mockito.
- Inject the mock into a service class.
- Call the service method that triggers the dependency.
- Use `verify()` to ensure the expected method is invoked.

---

## 🛠 Prerequisites

Make sure your project includes these dependencies in `pom.xml`:

```xml
<dependencies>
  <dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-core</artifactId>
    <version>5.11.0</version>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
  </dependency>
</dependencies>

🧪 What the Test Does
1.Mocks the ExternalApi interface.
2.Passes the mock to the MyService constructor.
3.Calls MyService.fetchData().
4.Verifies that mockApi.getData() was called.

🧰 Technologies Used
Java 8+
JUnit 5
Mockito 5.x
Maven
