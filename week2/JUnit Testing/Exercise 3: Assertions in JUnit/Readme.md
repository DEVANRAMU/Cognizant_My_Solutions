# 🧪 Exercise 3: Assertions in JUnit

This exercise demonstrates how to use various **JUnit assertions** to validate test results and ensure that your Java application behaves as expected.

---

## 📘 Scenario

You need to write unit tests using different types of assertions provided by **JUnit 4**, such as:

- `assertEquals()`
- `assertTrue()`
- `assertFalse()`
- `assertNull()`
- `assertNotNull()`

---

## ✅ Objectives

- Learn how to use different JUnit assertions.
- Understand when and why to use each type of assertion.
- Practice writing test methods for simple expressions.

---

## 🛠️ Setup Instructions

1. **Ensure your project has JUnit dependency**  
   If you are using Maven, add the following to your `pom.xml`:

   ```xml
   <dependency>
     <groupId>junit</groupId>
     <artifactId>junit</artifactId>
     <version>4.13.2</version>
     <scope>test</scope>
   </dependency>

2.Create the test class
File: src/test/java/com/example/AssertionsTest.java

 Test Class Code

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}

 How to Run the Test
Run the test class in your IDE or from the terminal using Maven:
mvn test

Expected Output
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.AssertionsTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

🧰 Tools & Technologies
Java 8+
JUnit 4.13.2
Maven
IntelliJ IDEA / Eclipse / VS Code (optional)


Folder Structure
exercise3-assertions/
├── pom.xml
└── src/
    └── test/
        └── java/
            └── com/example/AssertionsTest.java
