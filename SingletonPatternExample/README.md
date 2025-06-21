# 🔒 Singleton Pattern Example

This Java project demonstrates the **Singleton Design Pattern**, which ensures that a class has only one instance throughout the application lifecycle.  
It uses a simple `Logger` utility class to show how consistent logging can be managed via a Singleton instance.

---

## 🎯 What is the Singleton Pattern?

> The **Singleton Pattern** ensures that a class has only one instance and provides a global point of access to it.

It is used when:
- Exactly one object is needed to coordinate actions across the system.
- Shared resources (like logging, configuration, or database connections) must be accessed consistently.

---

## 📁 Project Structure
SingletonPatternExample/
├── src/
│ └── com/
│ └── singleton/
│ └── example/
│ ├── Logger.java
│ └── TestLogger.java
├── README.md
└── .gitignore


---

## 📄 Class Overview

| Class         | Description |
|---------------|-------------|
| `Logger`      | Singleton class with a private static instance and a global access method |
| `TestLogger`  | Test class that verifies the singleton behavior of `Logger` |

---

## 🧪 How to Run

1. Open the project in **Eclipse** or any Java IDE.
2. Run `TestLogger.java` as a Java Application.

---

## ✅ Expected Output

Logger initialized.
Log: This is the first log message.
Log: This is the second log message.
Both logger instances are the same (Singleton works!).


---

## 🚫 Why Singleton?

- Prevents multiple instantiations of a class
- Saves memory in resource-heavy utilities
- Guarantees consistent behavior (e.g., log messages always go to the same file or console)

---

## 🧠 Author & Credits

Developed by **DEVAN RAMU**  
Submitted as part of **Cognizant Java Design Pattern Practice Tasks**
