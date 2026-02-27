# ☕ Java 8 Practice Repository

Welcome to **Java_8** 🚀
This repository contains practical programs explaining the features introduced in **Java 8**.
It is designed for beginners, students, and interview preparation candidates who want to *learn by coding* instead of only reading theory.

---

## 📖 Project Purpose

Java 8 is one of the biggest updates in Java.
It introduced **Functional Programming** concepts and changed the way developers write Java code.

This repository provides:

* Simple examples
* Clear logic
* Easy-to-understand programs
* Interview-oriented concepts

You can run every program and understand how Java 8 actually works 🔥

---

## 🧠 Topics Covered

### 🔹 Lambda Expressions

Lambda expressions reduce the need for anonymous classes and make code shorter.

**Before Java 8**

```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Hello Java");
    }
};
```

**Java 8**

```java
Runnable r = () -> System.out.println("Hello Java");
```

✔ Cleaner
✔ Faster to write
✔ More readable

---

### 🔹 Functional Interfaces

A functional interface contains **only one abstract method**.

Example:

```java
@FunctionalInterface
interface MyInterface {
    void display();
}
```

Common functional interfaces used:

* Predicate
* Function
* Consumer
* Supplier

---

### 🔹 Method Reference (::)

Instead of writing a lambda expression, we can directly refer to a method.

```java
list.forEach(System.out::println);
```

This replaces:

```java
list.forEach(x -> System.out.println(x));
```

---

### 🔹 Stream API 🌊

Stream API processes collections (List, Set) in a functional style.

Operations included in this repo:

* filter()
* map()
* sorted()
* forEach()
* collect()

Example:

```java
List<Integer> list = Arrays.asList(1,2,3,4,5,6);

list.stream()
    .filter(x -> x % 2 == 0)
    .forEach(System.out::println);
```

Output:

```
2
4
6
```

---

### 🔹 Default Methods in Interface

Interfaces can now contain implemented methods.

```java
interface Demo {
    default void show() {
        System.out.println("Default Method");
    }
}
```

---

### 🔹 Static Methods in Interface

Interfaces can also define static methods.

```java
interface Demo {
    static void display() {
        System.out.println("Static method");
    }
}
```

Call:

```java
Demo.display();
```

---

### 🔹 Optional Class

Helps prevent **NullPointerException**.

```java
Optional<String> name = Optional.ofNullable(null);
System.out.println(name.orElse("Value not present"));
```

---

### 🔹 Date & Time API ⏰

Modern date handling introduced in Java 8.

Classes used:

* LocalDate
* LocalTime
* LocalDateTime

```java
LocalDate today = LocalDate.now();
System.out.println(today);
```

---

## 💻 How to Run

### 1️⃣ Check Java Installation

```bash
java -version
```

(Install Java 8 or above if not installed)

---

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/Lakshay-1126/Java_8.git
```

---

### 3️⃣ Open Folder

```bash
cd Java_8
```

---

### 4️⃣ Compile Program

```bash
javac FileName.java
```

---

### 5️⃣ Run Program

```bash
java FileName
```

---

## 🎯 Who Is This For?

✔ BCA / BSc / BTech Students
✔ Java Beginners
✔ Placement Preparation Students
✔ Anyone preparing for Java Interviews

---

## 📌 What You Will Learn

After completing these programs you will:

* Understand Lambda Expressions
* Work with Stream API
* Use Functional Interfaces
* Avoid NullPointerException using Optional
* Answer Java 8 interview questions confidently

---

## ⭐ Interview Importance

Many companies (TCS, Infosys, Wipro, Accenture, Capgemini) frequently ask **Java 8** questions:

* What is Lambda Expression?
* What is Functional Interface?
* What is Stream API?
* Difference between map() and filter()
* What is Optional?

This repository directly prepares you for them.

---

## 🤝 Contribution

You are welcome to:

* Improve code
* Add examples
* Fix errors

Pull requests are appreciated ❤️

---

## 📜 License

Free to use for educational and learning purposes.

---

## 🙌 Support

If this project helped you:

⭐ Star the repository
🍴 Fork it
📤 Share with friends

**Happy Coding! ☕💻**
