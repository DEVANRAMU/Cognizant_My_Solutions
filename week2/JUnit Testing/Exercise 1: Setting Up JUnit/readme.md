# 🧪 Exercise 1: Setting Up JUnit in a Java Project

This exercise walks you through the basic setup of **JUnit 4.13.2** in a Java project using **Maven**. It’s designed to help you get started with unit testing using the JUnit framework.

---

## 📋 Scenario

You need to set up JUnit in your Java project to start writing unit tests.

---

## 🛠 Steps to Set Up

### 1. Create a New Java Project

You can do this in your favorite IDE (e.g., **IntelliJ IDEA**, **Eclipse**, or **VS Code**) or by using Maven from the command line:

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=junit-setup -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd junit-setup

2. Add JUnit Dependency
Open the pom.xml file and add the following inside the <dependencies> section:

<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>

Save and reload the Maven project in your IDE.

3. Create a Test Class
Create a new Java class under the src/test/java directory. Example:

📄 src/test/java/com/example/BasicTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicTest {

    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }
}

Expected Output
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.BasicTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

📂 Project Structure
junit-setup/
├── pom.xml
└── src/
    ├── main/java/com/example/        (optional)
    └── test/java/com/example/BasicTest.java

