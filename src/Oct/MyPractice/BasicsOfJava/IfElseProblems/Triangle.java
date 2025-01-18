package Oct.MyPractice.BasicsOfJava.IfElseProblems;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side 1");
        int s1 = sc.nextInt();

        System.out.println("Enter the length of side 2");
        int s2 = sc.nextInt();

        System.out.println("Enter the length of side 3");
        int s3 = sc.nextInt();

        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Invalid value");
        } else if (s1 == s2 && s2 == s3 && s3 == s1) {
            System.out.println("The triangle is Equilateral");
        } else if (s1 == s2 || s2 == s3 || s3 == s1) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }

        sc.close();
    }
}
