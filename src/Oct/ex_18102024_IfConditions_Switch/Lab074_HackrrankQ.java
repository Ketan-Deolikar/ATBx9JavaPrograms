package Oct.ex_18102024_IfConditions_Switch;

import java.util.Scanner;

public class Lab074_HackrrankQ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score <= 0 || score >= 100) {
            System.out.println("LOL!!, Tu bhagwan se upper hai kya");
            grade = '0';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is -> " + grade);

    }
}
