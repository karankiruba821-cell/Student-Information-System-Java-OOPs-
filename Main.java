package hello;

import java.util.Scanner;

class Miniproject {
    String student;
    int id;
    static String college = "Prince";
    String dep;
    int age;

    Miniproject() {}

    Miniproject(String student, int id, String dep, int age) {
        this.student = student;
        this.id = id;
        this.dep = dep;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + student);
        System.out.println("ID: " + id);
        System.out.println("College: " + Miniproject.college);
        System.out.println("Department: " + dep);
        System.out.println("Age: " + age);
        System.out.println("Next Student");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Miniproject[] arr = new Miniproject[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String student = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department: ");
            String dep = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            arr[i] = new Miniproject(student, id, dep, age);
        }

        System.out.println("--- Student Details ---");

        for (int i = 0; i < n; i++) {
            arr[i].display();
        }
    }
}