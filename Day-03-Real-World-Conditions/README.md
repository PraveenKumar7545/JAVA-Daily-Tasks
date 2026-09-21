# Day 03 - Real-World Conditions

## 📌 Introduction

Day 03 focuses on applying Java conditional statements to real-world problems.

In this day, practical scenarios such as ATM withdrawal, e-commerce delivery, water usage, ticket pricing, salary bonus, shopping discounts, parking fees, and mobile recharge plans are implemented using Java.

The main goal is to improve logical thinking and understand how conditional statements are used in real-world applications.

---

## 🎯 Topics Covered

- `if` statement
- `if-else` statement
- `else-if` ladder
- Nested `if`
- Comparison operators
- Logical operators
- Arithmetic operators
- User input using `Scanner`
- Real-world condition-based problems
- Decision making
- Basic calculations

---

## 📁 Folder Structure

```text
Day-03-Real-World-Conditions/
│
├── README.md
│
├── Questions/
│   └── Questions.txt
│
├── Solutions/
│   ├── Q01_ATM_Withdrawal.java
│   ├── Q02_ECommerce_Delivery.java
│   ├── Q03_Water_Usage_Charge.java
│   ├── Q04_Water_Park_Ticket.java
│   ├── Q05_Simple_Interest.java
│   ├── Q06_Movie_Ticket.java
│   ├── Q07_Employee_Bonus.java
│   ├── Q08_Shopping_Discount.java
│   ├── Q09_Parking_Fee.java
│   └── Q10_Mobile_Recharge.java
│
└── Screenshots/
    ├── Q01_ATM_Withdrawal.png
    ├── Q02_ECommerce_Delivery.png
    ├── Q03_Water_Usage_Charge.png
    ├── Q04_Water_Park_Ticket.png
    ├── Q05_Simple_Interest.png
    ├── Q06_Movie_Ticket.png
    ├── Q07_Employee_Bonus.png
    ├── Q08_Shopping_Discount.png
    ├── Q09_Parking_Fee.png
    └── Q10_Mobile_Recharge.png
```

---

## 📝 Practice Questions

### Q01 - ATM Withdrawal

Get the account balance and withdrawal amount from the user.

**Conditions:**

- Withdrawal amount must be greater than 0
- Withdrawal amount must be less than or equal to the balance
- Minimum balance after withdrawal should be Rs.500

**Display:**

- Withdrawal Successful
- Insufficient Balance
- Invalid Withdrawal Amount

---

### Q02 - E-Commerce Delivery Charge

Get the order amount from the user.

**Conditions:**

- Amount ≥ Rs.2000 → Free Delivery
- Amount ≥ Rs.1000 → Rs.50 Delivery Charge
- Amount < Rs.1000 → Rs.100 Delivery Charge

Display the order amount, delivery charge, and final amount.

---

### Q03 - Water Usage Charge

Get the number of water units used.

**Conditions:**

- 0 – 100 units → Rs.5 per unit
- 101 – 200 units → Rs.7 per unit
- Above 200 units → Rs.10 per unit

Calculate and display the total water bill.

---

### Q04 - Water Park Ticket

Get the age of the customer.

**Conditions:**

- Age below 5 → Free
- Age 5 – 12 → Rs.100
- Age 13 – 59 → Rs.250
- Age 60 and above → Rs.150

Display the ticket price.

---

### Q05 - Simple Interest

Get the principal amount, time in years, and customer type.

**Customer types:**

- Student
- General

**Interest rates:**

- Student → 5%
- General → 7%

**Formula:**

```text
Simple Interest = (Principal × Rate × Time) / 100
```

Display the simple interest and total amount.

---

### Q06 - Movie Ticket Price

Get the customer's age and show type.

**Age conditions:**

- Below 12 → Child Ticket
- 12 – 59 → Adult Ticket
- 60 and above → Senior Citizen Ticket

**Base ticket price:**

- Child → Rs.120
- Adult → Rs.200
- Senior Citizen → Rs.150

If the show type is **IMAX**, add Rs.100.

Display the final ticket price.

---

### Q07 - Employee Bonus

Get the employee salary and years of experience.

**Conditions:**

- Experience ≥ 10 years → 20% bonus
- Experience ≥ 5 years → 15% bonus
- Experience ≥ 2 years → 10% bonus
- Below 2 years → 5% bonus

**Display:**

- Salary
- Bonus
- Final Salary

---

### Q08 - Shopping Discount

Get the shopping amount and customer membership type.

**Membership types:**

- Premium
- Regular
- Non-Member

**Discount rules:**

| Membership   | Amount ≥ Rs.5000 | Otherwise   |
|--------------|------------------|-------------|
| Premium      | 25%              | 20%         |
| Regular      | 15%              | 10%         |
| Non-Member   | 5%               | No Discount |

Display the discount and final amount.

---

### Q09 - Parking Fee

Get the number of hours a vehicle is parked.

**Conditions:**

- First 2 hours → Rs.30 per hour
- Next 3 hours → Rs.20 per hour
- Above 5 hours → Rs.10 per hour

Calculate and display the total parking fee.

---

### Q10 - Mobile Recharge Plan

Get the recharge amount.

**Conditions:**

- Rs.599 and above → Unlimited Data + Calls
- Rs.399 and above → 2GB Data per Day + Calls
- Rs.199 and above → 1GB Data per Day + Calls
- Below Rs.199 → Basic Plan

Display the selected recharge plan.

---

## 💻 Solutions

| Question | Description | File |
|----------|-------------|------|
| Q01 | Checks whether the user can withdraw money while maintaining the required minimum account balance | `Q01_ATM_Withdrawal.java` |
| Q02 | Calculates the delivery charge based on the order amount and displays the final amount | `Q02_ECommerce_Delivery.java` |
| Q03 | Calculates the water bill based on the number of units consumed | `Q03_Water_Usage_Charge.java` |
| Q04 | Calculates the ticket price based on the customer's age | `Q04_Water_Park_Ticket.java` |
| Q05 | Calculates simple interest using different interest rates for student and general customers | `Q05_Simple_Interest.java` |
| Q06 | Calculates the movie ticket price based on age and show type | `Q06_Movie_Ticket.java` |
| Q07 | Calculates the employee bonus based on years of experience | `Q07_Employee_Bonus.java` |
| Q08 | Calculates the shopping discount based on the purchase amount and membership type | `Q08_Shopping_Discount.java` |
| Q09 | Calculates the parking fee based on the number of hours the vehicle is parked | `Q09_Parking_Fee.java` |
| Q10 | Displays the appropriate mobile recharge plan based on the recharge amount | `Q10_Mobile_Recharge.java` |

---

## 🛠️ Technologies Used

- Java
- Java `Scanner`
- Conditional Statements (`if`, `if-else`, `else-if`, nested `if`)
- Comparison Operators
- Logical Operators
- Arithmetic Operators
- User Input

---

## ▶️ How to Run

### Step 1 – Open the Project

Open the `Day-03-Real-World-Conditions` folder in VS Code, Eclipse, or another Java-supported IDE.

### Step 2 – Open the Solutions Folder

Navigate to:

```text
Day-03-Real-World-Conditions/Solutions/
```

### Step 3 – Compile a Java Program

Example:

```bash
javac Q01_ATM_Withdrawal.java
```

### Step 4 – Run the Program

```bash
java Q01_ATM_Withdrawal
```

For other programs, replace the filename and class name with the required solution.

---

## 📸 Screenshots

Screenshots of the program outputs can be added to the `Screenshots/` folder.

```text
Screenshots/
├── Q01_ATM_Withdrawal.png
├── Q02_ECommerce_Delivery.png
├── Q03_Water_Usage_Charge.png
├── Q04_Water_Park_Ticket.png
├── Q05_Simple_Interest.png
├── Q06_Movie_Ticket.png
├── Q07_Employee_Bonus.png
├── Q08_Shopping_Discount.png
├── Q09_Parking_Fee.png
└── Q10_Mobile_Recharge.png
```

---

## 🎯 Learning Goals

By completing Day 03, you will:

- Understand real-world conditional problems
- Improve Java logical thinking
- Practice `if`, `if-else`, and `else-if` statements
- Practice nested conditions
- Use comparison operators correctly
- Use logical operators correctly
- Perform calculations based on conditions
- Handle user input using `Scanner`
- Improve problem-solving skills
- Build confidence in Java programming

---

## 📌 Status

**Day 03 – Completed**

- ✅ Practice Questions
- ✅ Java Solutions
- ✅ README
- ✅ Folder Structure
- ⬜ Screenshots
