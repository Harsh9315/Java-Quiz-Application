# Java Quiz Application

A robust, interactive command-line interface (CLI) application built using **Core Java** and **JDBC**. This project demonstrates the integration of a Java-based application with a **MySQL** database to facilitate dynamic question retrieval and real-time score tracking.

## 🚀 Project Overview

The Java Quiz Application is designed to provide an engaging quiz experience. Unlike hardcoded quizzes, this application fetches questions, options, and correct answers directly from a MySQL database, making the system scalable and easy to manage.

## ✨ Key Features

- **Dynamic Database Integration:** Uses JDBC to connect to MySQL, allowing for easy updates to the question bank.
- **Interactive CLI:** A clean, professional command-line interface that provides clear instructions and feedback to the user.
- **Real-time Scoring:** Automatically calculates and displays the final score based on user performance.
- **Error Handling:** Implemented robust exception handling to manage database connection issues and user input errors.
- **Scalable Design:** Follows a modular structure, separating database logic from the application flow.

## 🛠️ Technologies Used

- **Programming Language:** Java (Core)
- **Database:** MySQL
- **Connectivity:** JDBC (Java Database Connectivity)
- **Development Environment:** VS Code

## 📋 Prerequisites

To run this project locally, ensure you have the following installed:
- [Java JDK](https://www.oracle.com/java/technologies/downloads/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [MySQL JDBC Driver (Connector/J)](https://dev.mysql.com/downloads/connector/j/)

## ⚙️ How to Run
Database Setup:
Create a database named quiz_db and import the question table structure.

Compile the Code:
Navigate to the project root and compile the Java files: javac -cp "lib/*" src/DatabaseConnection.java src/QuizRunner.java

Run the Application:  java -cp ".;lib/*;src" QuizRunner
