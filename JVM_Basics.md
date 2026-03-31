# JVM Basics

## 1. What is JDK, JRE, JVM?

### JDK (Java Development Kit)
- Full package used for **developing Java applications**
- Contains:
  - JRE
  - Compiler (`javac`)
  - Tools (debugger, etc.)

👉 Used by developers to write and compile code

---

### JRE (Java Runtime Environment)
- Provides environment to **run Java programs**
- Contains:
  - JVM
  - Libraries
  - Runtime files

👉 Used to execute Java programs

---

### JVM (Java Virtual Machine)
- Responsible for **running Java bytecode**
- Converts bytecode into machine-specific instructions

👉 Acts as a bridge between Java code and OS

---

## 2. What is Bytecode?

- When you compile a Java file:
  ```bash
  javac HelloWorld.java
  ```
- It generates:
  ```
  HelloWorld.class
  ```

This `.class` file is called **bytecode**.

### Key Points:
- Not machine-specific
- Can run on any system with JVM
- Intermediate code between source and machine code

---

## 3. Write Once, Run Anywhere (WORA)

Java follows the principle:

👉 **Write code once, run it on any platform**

### How it works:
1. Developer writes Java code
2. Compiler converts it into bytecode
3. JVM runs this bytecode on any OS

### Example:
- Same `.class` file runs on:
  - Windows
  - Mac
  - Linux

No need to rewrite code for each system.

---

## Summary

| Component | Purpose |
|----------|--------|
| JDK | Development (write + compile) |
| JRE | Runtime environment |
| JVM | Executes bytecode |

---

This architecture is what makes your LearnTrack project platform-independent.
