# JAVA CLASSES
### My path to backend Java Developer 

This repository contains mini-projects developed to practice and solidify my Java skills, evolving from basic Object-Oriented Programming (OOP) to more advanced architectural concepts.

---

## Study Roadmap

### 1. Java Language Fundamentals
- [x] **Object-Oriented Programming (OOP):** Classes, Interfaces, Inheritance, Polymorphism, and Encapsulation.
- [ ] **Collections Framework:** Mastery of List, Set, Map and their main implementations (ArrayList, HashSet, HashMap).
- [x] **Exception Handling:** Exception hierarchy, try-catch blocks, and custom exceptions.
- [ ] **Streams API & Lambdas:** Functional manipulation and operation chaining in collections.

### 2. Software Engineering & Quality
- [x] **Clean Code:** Clear naming, cohesive functions, and proper error handling.
- [ ] **SOLID Principles:** Practical application of the five principles for scalable software.
- [ ] **Design Patterns:** Creational (Singleton, Builder, Factory Method) and Behavioral (Strategy) patterns.

### 3. Database & Persistence
- [x] **Relational Databases (SQL):** Data modeling, normalization, complex queries (JOINs, GROUP BY), and transactions (ACID).
- [ ] **JPA & Hibernate:** Object-Relational Mapping (ORM), relationships (OneToMany, ManyToOne), and entity lifecycle.

### 4. Framework (Spring Boot)
- [ ] **IoC & DI:** Inversion of Control and Dependency Injection.
- [ ] **Spring Web:** Building RESTful APIs, HTTP verbs, and MVC pattern (Controllers, Services, Repositories).
- [ ] **Spring Data JPA:** Dynamic repositories and derived queries.
- [ ] **Spring Security:** Filters, authentication, and authorization (JWT token implementation).

### 5. Automated Testing
- [ ] **Unit Testing:** Isolated business rule validation using **JUnit**.
- [ ] **Mocking:** Simulating dependencies and behaviors using **Mockito**.

### 6. Tools & Infrastructure
- [ ] **Build Management:** Mastery of Maven or Gradle.
- [x] **Git & GitHub:** Version control, semantic commits, branches, and Pull Request workflows.
- [ ] **Basic Docker:** Application packaging (`Dockerfile`) and local database setup (`docker-compose`).

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

---

#### BancoDigitalOO
A digital bank modeling simulation focusing on Object-Oriented principles and transaction history.

**Core Concepts Applied:**
- **Inheritance & Abstraction:** Abstract `Conta` class extended by concrete `ContaCorrente` and `ContaPoupanca` classes.
- **Interfaces:** `IConta` defining the standard contract for banking operations like deposits, withdrawals, and transfers.
- **Encapsulation & Composition:** `Banco` managing a list of accounts (`Conta`), and each account being associated with a `Cliente`.
- **Collections & Date Handling:** Using `List` to store transaction history and `LocalDateTime` for formatting operation timestamps.

---

#### Node
A foundational project demonstrating the basic structure of a linked node used in custom data structures.

**Core Concepts Applied:**
- **Generics:** Utilizing `<T>` to create a type-safe, reusable node structure (`Node<T>`).
- **Self-referencing Objects:** Implementing a `next_node` pointer to link instances in memory, building the base logic for a Linked List.

---

#### Pile (Stack)
A custom implementation of a Stack (LIFO - Last In, First Out) data structure from scratch, utilizing linked nodes.

**Core Concepts Applied:**
- **Data Structures (LIFO):** Implementing core stack operations: `push` (add to top), `pop` (remove from top), and `top` (view top element).
- **Object Referencing:** Managing pointers (`ref`) between `Node` objects to dynamically update the stack's top position without losing data.
- **State Verification:** Safe operations using an `isEmpty()` validation to avoid null pointer exceptions during `pop` calls.
- **String Manipulation & Loops:** Overriding the `toString()` method with a `while` loop to traverse the linked nodes and visually format the entire stack in the console.
