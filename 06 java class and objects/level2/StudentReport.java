// Student.java
class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Student Name   : " + name);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Grade          : " + calculateGrade());
        System.out.println("----------------------------------");
    }
}

public class StudentReport {
    public static void main(String[] args) {
       
        Student s1 = new Student("Navroop", 101, 92);
        Student s2 = new Student("Esha", 102, 76.5);
       
        s1.displayDetails();
        s2.displayDetails();
    }
}
