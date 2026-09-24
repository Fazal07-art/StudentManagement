import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n===== Student Details =====");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);

        if (marks >= 90) {
            System.out.println("Grade : A");
        } else if (marks >= 75) {
            System.out.println("Grade : B");
        } else if (marks >= 60) {
            System.out.println("Grade : C");
        } else if (marks >= 50) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }

        sc.close();
    }
}