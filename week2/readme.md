# PL/SQL Banking Project – Exercises 1 & 3

This repository contains PL/SQL scripts demonstrating the use of control structures and stored procedures in banking-related scenarios. Designed to be run in [LiveSQL.oracle.com](https://livesql.oracle.com).

---

## 📁 Contents

| Folder | File | Description |
|--------|------|-------------|
| `Exercise 1` | `01_create_insert.sql` | Creates `Customers` and `Loans` tables with sample data |
|            | `02_scenarios.sql`     | Implements PL/SQL control structure logic for 3 scenarios |
| `Exercise 3` | `01_create_and_insert.sql` | Creates `Accounts` and `Employees` tables with sample data |
|            | `02_stored_procedures.sql` | Implements stored procedures for interest, bonuses, and transfers |

---

## 📘 Exercise 1: Control Structures

### ✅ Scenario 1: Senior Loan Discount  
**Logic:** Apply a **1% discount** to loan interest rates for customers over age 60.

### ✅ Scenario 2: Promote VIP Customers  
**Logic:** Set `IsVIP = TRUE` for customers with balance over **$10,000**.

### ✅ Scenario 3: Loan Due Reminder  
**Logic:** Print reminders for loans due in the next **30 days** using `DBMS_OUTPUT`.

📌 **Enable DBMS Output** in LiveSQL to see messages.

---

## 📘 Exercise 3: Stored Procedures

### ✅ Scenario 1: Process Monthly Interest  
**Procedure:** `ProcessMonthlyInterest`  
Applies **1% interest** to all `Savings` accounts.

### ✅ Scenario 2: Employee Bonus by Department  
**Procedure:** `UpdateEmployeeBonus(dept_name IN VARCHAR2, bonus_pct IN NUMBER)`  
Gives a bonus to employees of a selected department.

📌 **Example Call:**
```sql
BEGIN
  UpdateEmployeeBonus('IT', 10);
END;
/
```

### ✅ Scenario 3: Transfer Funds  
**Procedure:** `TransferFunds(from_account IN NUMBER, to_account IN NUMBER, amount IN NUMBER)`  
Transfers money from one account to another after checking balance.

📌 **Example Call:**
```sql
BEGIN
  TransferFunds(101, 102, 2000);
END;
/
```

---

## 🧪 How to Run

1. Go to [LiveSQL.oracle.com](https://livesql.oracle.com)
2. Open **SQL Worksheet**
3. Run creation & insert scripts first:
   - `01_create_insert.sql` for Exercise 1
   - `01_create_and_insert.sql` for Exercise 3
4. Then run the scenario or procedure scripts
5. Enable `DBMS_OUTPUT` for outputs

---

## 🛠 Technologies Used

- Oracle PL/SQL
- Loops, IF conditions
- Stored Procedures & Exception Handling

---

## 📚 License

Free to use for educational and learning purposes.

