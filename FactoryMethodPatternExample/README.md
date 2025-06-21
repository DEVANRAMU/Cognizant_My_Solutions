# 🏭 Factory Method Pattern Example

This Java project demonstrates the **Factory Method Design Pattern**, where the object creation logic is abstracted into separate factory classes.  
It simulates a document generation system that can produce Word, PDF, and Excel documents using factory classes.

---

## 🚀 What is the Factory Method Pattern?

> The **Factory Method Pattern** defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.

It’s commonly used when:
- The exact type of object isn't known until runtime
- Object creation logic is complex and should be encapsulated

---

## 📁 Project Structure
FactoryMethodPatternExample/
├── src/
│ └── com/
│ └── factory/
│ └── example/
│ ├── Document.java
│ ├── WordDocument.java
│ ├── PdfDocument.java
│ ├── ExcelDocument.java
│ ├── DocumentFactory.java
│ ├── WordDocumentFactory.java
│ ├── PdfDocumentFactory.java
│ ├── ExcelDocumentFactory.java
│ └── TestDocumentFactory.java
├── README.md
└── .gitignore



---

## 📄 Class Overview

| Class/File              | Description |
|-------------------------|-------------|
| `Document`              | Interface for all document types |
| `WordDocument`, `PdfDocument`, `ExcelDocument` | Concrete implementations of `Document` |
| `DocumentFactory`       | Abstract factory with method `createDocument()` |
| `WordDocumentFactory`, etc. | Concrete factories that override `createDocument()` |
| `TestDocumentFactory`   | Test class to demonstrate creation of documents |

---

## 🧪 How to Run

1. Open the project in **Eclipse** or any Java IDE.
2. Run `TestDocumentFactory.java` as a Java Application.

---

## ✅ Expected Output

Opening Word document...
Opening PDF document...
Opening Excel document...


---

## 📎 Related Design Patterns

- **Abstract Factory**
- **Builder**
- **Prototype**
- **Simple Factory** (not a true GoF pattern, but similar)

---

## 🧠 Author & Credits

Developed by **DEVAN RAMU**  
Submitted as part of **Cognizant Java Design Pattern Practice Tasks**
