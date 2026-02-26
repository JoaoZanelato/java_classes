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
A simple banking application focused on basic I/O operations:
- Formatted strings output.
- Input data handling using the `Scanner` class.
