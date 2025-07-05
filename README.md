# Student Database Manager

## 📘 Project Overview

This project is a **Java console application** that connects to a **PostgreSQL** database and performs **CRUD operations** on student records. It also displays enriched data by joining `Students`, `Courses`, and `Enrollments` tables to show which students are enrolled in which courses along with details.

---

## 🎯 Objectives

- Create and manage a `SchoolDB` PostgreSQL database.
- Perform CRUD operations on `Students` table.
- Display combined data using JOINs between:
  - `Students`
  - `Courses`
  - `Enrollments`
- Implement a clean Java console menu using JDBC.

---

## 🛠️ Technologies Used

| Tool/Tech           | Version        |
|---------------------|----------------|
| Java                | JDK 17+        |
| PostgreSQL          | 15+            |
| pgAdmin             | 4              |
| JDBC Driver         | PostgreSQL JDBC (42.x) |
| Eclipse IDE         | (Optional)     |

---

## 📂 Project Structure

```

StudentDatabaseManager/
├── src/
│   ├── model/
│   │   ├── Student.java
│   │   ├── Course.java
│   │   └── Enrollment.java
│   ├── dao/
│   │   ├── StudentDAO.java (optional)
│   │   └── EnrollmentDAO.java
│   └── StudentManagerApp.java
└── lib/
└── postgresql-<version>.jar

````

---

## 🧱 Database Schema

### `Students`
| Column     | Type    |
|------------|---------|
| StudentID  | INT (PK)|
| Name       | VARCHAR |
| Age        | INT     |
| Major      | VARCHAR |

### `Courses`
| Column     | Type    |
|------------|---------|
| CourseID   | INT (PK)|
| CourseName | VARCHAR |
| Credits    | INT     |
| Teacher    | VARCHAR |

### `Enrollments`
| Column        | Type    |
|---------------|---------|
| EnrollmentID  | INT (PK)|
| StudentID     | INT (FK to Students) |
| CourseID      | INT (FK to Courses)  |
| EnrollmentDate| DATE    |

---

## 🧪 Features & Functionality

- ✅ View all enrolled students with course and enrollment info
- ✅ Uses SQL JOINs in Java via JDBC
- ✅ Console-based interactive menu
- ✅ Secure and efficient PreparedStatement queries

---

## ▶️ How to Run

### Step 1: Set Up PostgreSQL
1. Create database: `SchoolDB`
2. Use pgAdmin or psql to execute `school_database_assignment.sql` (provided)

### Step 2: Setup Java Project
1. Add PostgreSQL JDBC Driver to `lib/`
2. Import all Java files into your Eclipse or IntelliJ project
3. Run `StudentManagerApp.java`

---

## 💻 Sample Console Output

```text
=== School Database Manager ===
1. Display All Student Enrollments
2. Exit
Enter your choice: 1

Student ID   : 1
Name         : Alice Johnson
Age          : 20
Major        : Computer Science
Course ID    : 101
Course Name  : Introduction to Programming
Credits      : 3
Teacher      : Dr. Brown
Enroll Date  : 2025-06-01
-------------------------
...
````

---

## 📎 Notes

* This project strictly uses **JDBC** for database interaction.
* All queries use **PreparedStatements** to prevent SQL injection.
* The project can be extended to support **Add, Update, Delete** features.

---

## 👤 Developed By

**M Mohammed Nayeem**
[GitHub Profile](https://github.com/mmdnayeem4705)
[LinkedIn](https://www.linkedin.com/in/mulla-mohammed-nayeem-09b33a361/)

---

## 📜 License

This project is for academic and learning use only.

```

---

Let me know if you want:
- The **transcript file** (console input/output)
- A sample `.sql` output screenshot
- Or help zipping everything for submission

You’re submission-ready now, champ 🚀🔥
```
![WhatsApp Image 2025-07-05 at 12 31 13_e473afa1](https://github.com/user-attachments/assets/96797a58-866f-4baf-b8e7-4d97a1d88ee9)


