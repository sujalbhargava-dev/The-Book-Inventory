Book Class – Constructor Overloading

A simple Java program demonstrating constructor overloading using a Book class.

🚀 Features
Default constructor
Constructor with title and author
Constructor with title, author, and price
Displays book details
Demonstrates Java constructor overloading
🛠️ Technologies Used
Java
Object-Oriented Programming (OOP)
📖 Constructors
Constructor	Description
Book()	Sets title and author to Unknown and price to 0.0
Book(String title, String author)	Sets title and author, price defaults to 0.0
Book(String title, String author, double price)	Sets all book details
💻 Example
Book book1 = new Book();
Book book2 = new Book("Java Programming", "James Gosling");
Book book3 = new Book("Clean Code", "Robert C. Martin", 599.99);
📤 Sample Output
Title: Unknown
Author: Unknown
Price: 0.0


Title: Java Programming
Author: James Gosling
Price: 0.0


Title: Clean Code
Author: Robert C. Martin
Price: 599.99
▶️ How to Run
javac Book.java
java Book
🎯 Learning Objective

This project is created to understand classes, objects, constructors, and constructor overloading in Java.

👨‍💻 Author

Sujal Bhargava
