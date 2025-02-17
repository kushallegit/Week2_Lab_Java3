package com.student.model.studentmodel;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;

    // Constructor calling setter methods for validation
    public Student(String name, int age, String studentId, double gpa) {
        setName(name);
        setAge(age);
        setStudentId(studentId);
        setGpa(gpa);
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 16 and 100.");
        }
    }

    // Getter and Setter for Student ID
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.matches("G\\d{9}")) {
            this.studentId = studentId;
        } else {
            throw new IllegalArgumentException("Student ID must start with 'G' followed by 5 digits (e.g., G12345).");
        }
    }

    // Getter and Setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
    }

    // Main method to test user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left by nextInt()

            System.out.print("Enter student ID (e.g., G12345): ");
            String studentId = scanner.nextLine();

            System.out.print("Enter GPA (0.0 to 4.0): ");
            double gpa = scanner.nextDouble();

            Student student = new Student(name, age, studentId, gpa);
            student.displayStudentInfo();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
