# Setup Instructions

## 1. JDK Version Used
This project is built using **JDK 17** (any JDK 8+ will also work, but JDK 17 is recommended).

To check your installed version:
```bash
java -version
javac -version
```

---

## 2. Install and Configure Java (JDK)

### Step 1: Download JDK
Download JDK from:
https://www.oracle.com/java/technologies/downloads/

### Step 2: Install JDK
Follow the installation steps based on your OS.

### Step 3: Set Environment Variables

#### For Windows:
- Set `JAVA_HOME`:
  ```
  C:\Program Files\Java\jdk-17
  ```
- Add to `Path`:
  ```
  %JAVA_HOME%\bin
  ```

#### For Mac/Linux:
Add to `.bashrc` or `.zshrc`:
```bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
```

---

## 3. Compile and Run the Project

Navigate to project root:

```bash
javac -d . src/com/airtribe/learntrack/Main.java
java com.airtribe.learntrack.Main
```

---

## 4. Hello World Program

### Example Code:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Steps to Run:
1. Compile:
   ```bash
   javac HelloWorld.java
   ```

2. Run:
   ```bash
   java HelloWorld
   ```

### Output:
```
Hello, World!
```

---

## 5. Explanation

- `javac` converts `.java` file into `.class` (bytecode)
- `java` command runs the bytecode using JVM
- This same bytecode works on any system with JVM installed

This is how your LearnTrack project also runs.
