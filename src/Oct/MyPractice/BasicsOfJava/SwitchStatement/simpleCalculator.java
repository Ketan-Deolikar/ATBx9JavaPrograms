package Oct.MyPractice.BasicsOfJava.SwitchStatement;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        System.out.println("Use Operator");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println((num2 != 0) ? (num1 + " / " + num2 + " = " + (num1 / num2)) : "Error: Division by zero is not allowed.");
                break;
            case '%':
                System.out.println((num2 != 0) ? (num1 + " % " + num2 + " = " + (num1 % num2)) : "Error: Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or %.");
        }

    }
}