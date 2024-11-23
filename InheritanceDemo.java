// Parent class
class Person {
    String name;
    int age;

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting from Parent Class
class Student extends Person {
    String studentId;

    public void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Student ID: " + studentId);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Rakesh";
        student.age = 20;
        student.studentId = "005";

        System.out.println("Student Details:");
        student.displayStudentDetails();
    }
}
