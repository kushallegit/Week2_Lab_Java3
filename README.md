# Student Model Java Program

This Java program defines a **Student** model class with fields such as `name`, `age`, `studentId`, and `gpa`. The program validates user input through setter methods and ensures the values entered meet the specified requirements. The program will prompt the user to input these values and will throw appropriate error messages if invalid data is entered.

## Features

- **Student ID Validation**: The student ID must start with the letter 'G' followed by 9 digits (e.g., "G123456789").
- **GPA Validation**: The GPA must be between 0.0 and 4.0.
- **Name Validation**: The name cannot be empty or null.
- **Age Validation**: The age must be between 16 and 100.

## Requirements

- Java 8 or later

## How to Run

1. Clone this repository to your local machine.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the Java program:
   ```bash
   javac Student.java
4. Run the program:
   ```bash
   java student
5. The program will prompt you to enter the following details:
- Name (e.g., "John Doe")
- Age (e.g., 20)
- Student ID (e.g., "G123456789")
- GPA (e.g., 3.5)

If you enter invalid data, you will see an error message explaining the issue.

## Error Messages
Student ID: "Student ID must start with 'G' followed by 9 digits."
GPA: "GPA must be between 0.0 and 4.0."
Name: "Name cannot be empty or null."
Age: "Age must be between 16 and 100."
