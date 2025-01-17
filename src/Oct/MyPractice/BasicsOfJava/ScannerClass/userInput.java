package Oct.MyPractice.BasicsOfJava.ScannerClass;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        System.out.println("Enter Your Salary");
        double salary = sc.nextDouble();


        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}
