package Oct.MyPractice.BasicsOfJava.SwitchStatement;

import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {



        System.out.println("Select a conversion: ");
        System.out.println("1 - Kilometer to Miles");
        System.out.println("2 - Fahrenheit to celsius");
        System.out.println("Enter your choice");


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 :
                System.out.print("Enter distance in kilometer");
                int kilometers = sc.nextInt();
                int miles = kilometers * 45782;
                System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
                break;

            case 2 :
                System.out.print("Enter temperature in Fahrenheit: ");
                int fahrenheit = sc.nextInt();
                int celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius. ");
                break;

            default:
                System.out.println("Invalid choice. Please choose either 1 or 2. ");
        }

        sc.close();

    }
}
