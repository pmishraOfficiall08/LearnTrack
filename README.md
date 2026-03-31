# LearnTrack - Student & Course Management System

## 📌 Project Description
LearnTrack is a **console-based Java application** designed to manage:
- Students
- Courses
- Enrollments

It demonstrates strong understanding of:
- Core Java (OOP, Collections)
- Clean Code principles
- Basic system design

---

## ⚙️ How to Compile and Run

### Step 1: Navigate to Project Directory
```bash
cd LearnTrack
```

### Step 2: Compile
```bash
javac -d . src/com/airtribe/learntrack/Main.java
```

### Step 3: Run
```bash
java com.airtribe.learntrack.Main
```

---

## 📐 Class Diagram

```
+------------------+
|     Student      |
+------------------+
| id               |
| name             |
+------------------+

+------------------+
|     Course       |
+------------------+
| id               |
| title            |
+------------------+

+------------------+
|   Enrollment     |
+------------------+
| student          |
| course           |
+------------------+

        Student 1..* -------- 1 Course
```

---

## 🧠 Design Notes

### 1. Why ArrayList instead of Array?
- Arrays are fixed in size, but the number of students/courses can grow dynamically
- ArrayList provides:
  - Dynamic resizing
  - Built-in methods (add, remove, search)
- Hence, ArrayList improves flexibility and reduces manual effort

---

### 2. Use of Static Members
- Static members are used where **shared behavior or data** is required
- Example:
  - ID generation counters
- Benefit:
  - Ensures unique values across all objects
  - Avoids duplication of logic

---

### 3. Use of Inheritance
- Inheritance is used to represent relationships between classes
- Example:
  - A base class (like Person/Entity) can be extended by Student
- Benefits:
  - Code reuse
  - Cleaner structure
  - Easier maintenance

---

## 🧹 Clean Code Practices Followed

### ✔ Small Methods
- Methods are kept short and focused on a single responsibility

### ✔ Meaningful Naming
- Examples:
  - addStudent()
  - findCourseById()
  - enrollStudent()

### ✔ Readable Structure
- Proper indentation and formatting
- Logical separation of responsibilities

---

## 🚀 Summary
This project showcases:
- Strong fundamentals of Java
- Good coding practices
- Clean and maintainable structure

It is designed to be simple, scalable, and easy to understand.
