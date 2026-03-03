# JAVA CLASSES
### My path to backend Java Developer 

This repository contains mini-projects developed to practice and solidify my Java skills, evolving from basic Object-Oriented Programming (OOP) to more advanced architectural concepts.

---

#### sistema-smart-tv
My first touch with Java after the 2nd semester. This project simulates a Smart TV and focuses on building a solid foundation in OOP and code maintainability.

**Core Concepts Applied:**
- **Basic OOP:** Abstraction, Encapsulation, Constructors, and Getters/Setters.
- **State Management:** Volume limits (using private constants), Channel setting, and Power (On/Off) controls.

**Refactoring & Architectural Evolution:**
- **The Problem:** Initially, the `SmartTv` class required an `if(isOn())` verification inside every method, violating the DRY (Don't Repeat Yourself) principle.
- **The Solution:** Refactored the code by extracting an `ISmartTv` interface and implementing the **Java Dynamic Proxy (JDP)** pattern (`InvocationHandler`). Now, a Proxy intercepts all user commands, centralizing the power state validation and keeping the main business logic perfectly clean.

---

#### ContaBanco
A simple banking application focused on basic terminal I/O operations to create a user account.

**Core Concepts Applied:**
- **User Input:** Handling dynamic input data using the `Scanner` class.
- **String Manipulation:** Utilizing formatted strings (`System.out.printf`) to generate customized user output.
- **Variables and Data Types:** Working with `int`, `double`, and `String` to store and output account information.

---

#### ControleDeCandidatos
A project that simulates a candidate selection and hiring process. It evaluates a list of candidates, compares their expected salaries with a base salary, and selects the approved ones to proceed.

**Core Concepts Applied:**
- **Control Flow:** Extensive use of `if/else` statements, `while` loops, and `for` loops to iterate through candidates and apply business rules.
- **Arrays:** Storing and manipulating collections of data, such as the candidate lists.
- **Randomization:** Using `ThreadLocalRandom` to simulate dynamic expected salaries for the candidates.
- **Static Methods:** Structuring the application logic into separated, reusable static methods.

---

#### Iphone
An Object-Oriented modeling challenge based on the first iPhone's presentation. It unifies a music player, a phone, and an internet browser into a single device.

**Core Concepts Applied:**
- **Interfaces & Abstraction:** Creating strict contracts (`ReprodutorMusical`, `AparelhoTelefonico`, `Navegador`) that extend a base `Aplicativo` interface.
- **Multiple Implementation:** Demonstrating how a single concrete class (`Iphone`) can implement multiple interfaces simultaneously to aggregate behaviors.
- **Polymorphism:** Showcasing how the same `Iphone` object in memory can be referenced dynamically by its different modular interfaces.
- **UML Modeling:** Translating a visual class diagram into clean, decoupled Java code following best practices.
