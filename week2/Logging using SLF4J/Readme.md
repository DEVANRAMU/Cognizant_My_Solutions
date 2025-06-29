# 🪵 Logging with SLF4J – Exercise 1: Error and Warning Messages

This exercise demonstrates how to use **SLF4J** with **Logback** to log error and warning messages in a simple Java application.

---

## 📘 Task

Write a Java application that logs messages at the **error** and **warning** levels using SLF4J.

---

## ✅ Objectives

- Set up SLF4J and Logback in a Maven project.
- Use the SLF4J `Logger` to log error and warning messages.
- Understand basic log levels and output formatting.

---

## 🛠 Prerequisites

Ensure your project uses **Maven** and has the following dependencies in `pom.xml`:

```xml
<dependencies>
  <!-- SLF4J API -->
  <dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>1.7.30</version>
  </dependency>

  <!-- Logback Implementation -->
  <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
  </dependency>
</dependencies>

📂 Project Structure
slf4j-logging-example/
└── src/
    └── main/java/com/example/
        └── LoggingExample.java

Example Output
12:00:00.000 [main] ERROR com.example.LoggingExample - This is an error message
12:00:00.001 [main] WARN  com.example.LoggingExample - This is a warning message

🚀 How to Run
1.Build the project with Maven:
mvn clean compile
2.Run the main class:
mvn exec:java -Dexec.mainClass="com.example.LoggingExample"


🧰 Technologies Used
Java 8+
SLF4J (v1.7.30)
Logback (v1.2.3)
Maven
