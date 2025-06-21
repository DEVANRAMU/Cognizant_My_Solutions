# Exercise 7: Financial Forecasting

## 🔍 Scenario
You are developing a financial forecasting tool that predicts future values based on past data using a recursive algorithm.

---

## 🧠 1. Understanding Recursive Algorithms

- **Recursion** is a programming technique where a function calls itself to solve smaller subproblems.
- It simplifies problems like calculating future values where each year's value depends on the previous year.
- Example: Calculating future value of an investment using compound interest.

---

## 🛠 2. Setup

- A recursive method is implemented to compute the **future value** of an investment based on:
  - **Principal amount**
  - **Annual growth rate**
  - **Number of years**
- The base case is when the number of years is 0 (i.e., future value = present value).

---

## 🔁 3. Implementation

### ✅ Recursive Formula

FV(n) = FV(n-1) × (1 + r)
Where:

FV(n): Future value after n years

r: Growth rate

FV(0) = Principal


### ✅ Java Code Overview

- `futureValueRecursive()` – computes the value recursively.
- `futureValueMemo()` – optimized using memoization (to store and reuse previously computed results).
- `main()` – tests both methods with sample inputs.

---

## 📊 4. Analysis

### ⏱ Time Complexity

| Method              | Time Complexity | Space Complexity | Notes                                 |
|---------------------|------------------|------------------|----------------------------------------|
| Recursive           | O(n)             | O(n)             | Due to call stack                     |
| Memoized Recursive  | O(n)             | O(n)             | Faster due to memoization             |
| Iterative (optional)| O(n)             | O(1)             | Efficient for very large inputs       |

### ⚙️ Optimization Techniques

- Use **memoization** to avoid redundant calculations in recursion.
- Convert to an **iterative approach** for better performance and memory usage.

---

## 💡 Sample Output

Future Value (Recursive): 1469.328
Future Value (With Memoization): 1469.328

