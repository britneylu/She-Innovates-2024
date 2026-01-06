# Student Expense Tracker

A budgeting application designed to help students track and manage their semester expenses.  
This project was developed in **two versions**:
1. A **Java console-based application** focusing on object-oriented design
2. A **web-based application** emphasizing usability and user experience

The goal of this project was to solve a real-world problem while demonstrating clean logic, modular design, and adaptability across platforms.

**Check out the Web version here:** [https://britneylu.github.io/She-Innovates-2024/](https://britneylu.github.io/She-Innovates-2024/)

---

## Project Overview

Many students struggle to manage loan or allowance money across a semester. This project helps users:
- Set a total budget
- Log expenses by category
- Track remaining balance
- View spending summaries and breakdowns

I originally built this project as part of a four-person hackathon team using a **Java console application**, then independently redesigned it as a **web app using HTML, CSS, and JavaScript**, preserving the core logic while improving usability and visual clarity.

---

## Java Console Application

### Technologies
- Java
- Object-Oriented Programming (OOP)
- HashMap and ArrayList
- Console-based user interaction

### Key Features
- Semester budget setup
- Expense tracking with categories
  - Food
  - Transportation
  - Entertainment
  - School Supplies
  - Other
- Input validation to prevent overspending
- Category-based expense breakdown
- Expense statistics (total spent, average expense)
- Looping menu for continuous interaction

### Design Highlights
- **`Student` class**: Handles data storage and expense calculations
- **`Interface` class**: Manages all user-facing menu output
- **`ExpenseTracker` class**: Controls program flow and user input

This version emphasizes clean separation of responsibilities and strong object-oriented design.

**Terminal Commands**
`cd src`
`javac Student.java Interface.java ExpenseTracker.java`
`java ExpenseTracker`

---

## Web Application

### Technologies
- HTML
- CSS
- JavaScript (Vanilla)

### Key Features
- Clean, minimal user interface
- Budget initialization
- Expense input with category selection
- Real-time balance updates
- Dynamic category breakdown
- Client-side validation for invalid or excessive expenses

### UX/UI Focus
- Card-based layout for clarity
- Immediate visual feedback after each expense
- Simplified flow compared to the console version
- Mobile-friendly structure

The web version mirrors the logic of the Java application but presents it in a more user-centered, accessible format.

---

## Why Two Versions?

Building the same application in two environments demonstrates:
- Ability to translate logic across languages and platforms
- Understanding of both backend-style logic (Java) and frontend interaction (JavaScript)
- Focus on usability and user experience, not just functionality

---

## Future Improvements
- Persistent storage (files or LocalStorage)
- Monthly budgeting and analytics
- Data visualizations (charts)
- Authentication and multi-user support
- React or backend-integrated version