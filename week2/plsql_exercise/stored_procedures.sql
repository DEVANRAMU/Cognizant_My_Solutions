-- Scenario 1: Apply 1% Discount to Seniors' Loan Interest
BEGIN
  FOR rec IN (SELECT CustomerID, Age, LoanInterest FROM Customers) LOOP
    IF rec.Age > 60 THEN
      UPDATE Customers
      SET LoanInterest = LoanInterest - 1
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: Promote VIP Customers
BEGIN
  FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF rec.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Print Loan Due Reminders (Next 30 Days)
BEGIN
  FOR rec IN (
    SELECT c.CustomerName, l.DueDate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || rec.CustomerName || ' has a loan due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/

-- View updated customer data
SELECT * FROM Customers;
