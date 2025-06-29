# 🧪 Exercise 4: Arrange-Act-Assert (AAA) Pattern, Setup and Teardown in JUnit

This exercise focuses on structuring JUnit tests using the **Arrange-Act-Assert (AAA)** pattern and implementing **test fixtures** using `@Before` and `@After` annotations in JUnit 4.

---

## 📘 Scenario

You are required to:

- Structure your tests clearly using the AAA approach.
- Reuse setup logic to initialize common test data before each test.
- Clean up or reset resources after each test.

---

## ✅ Objectives

- Understand and apply the Arrange-Act-Assert (AAA) testing pattern.
- Use `@Before` to set up test environments before each test case.
- Use `@After` to tear down or reset the state after each test.
- Improve test readability and maintainability using fixtures.

---

## 🛠 Requirements

- Java 8 or higher
- JUnit 4.13.2
- Maven (or another build tool)
- IDE such as IntelliJ IDEA, Eclipse, or VS Code

Make sure to include the JUnit dependency in your project setup.

---

## ▶️ Steps to Complete the Exercise

1. Set up a Java test class to verify logic (e.g., a calculator).
2. Use the `@Before` method to initialize shared objects before each test.
3. Use the `@After` method to clean up resources after each test.
4. Write multiple test methods using the AAA pattern:
   - **Arrange**: Set up necessary data.
   - **Act**: Call the method being tested.
   - **Assert**: Verify the result using assertions.

---

## 📌 Best Practices

- Keep each test method focused on a single behavior.
- Reuse setup logic to avoid duplication.
- Use descriptive method names to make tests self-explanatory.

---

## 🧰 Tools & Technologies

- **JUnit 4.13.2**: Java testing framework
- **Maven**: Build and dependency management
- **Java IDE**: For writing and executing tests

---

## 📂 Suggested Folder Structure

project-root/
├── pom.xml
└── src/
├── main/java/... # Production code
└── test/java/... # Test code
