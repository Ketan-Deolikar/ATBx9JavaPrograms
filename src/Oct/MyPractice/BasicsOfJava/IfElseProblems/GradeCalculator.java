package Oct.MyPractice.BasicsOfJava.IfElseProblems;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter score student gets in exam");
        int score = sc.nextInt();

        String grade;
        if(score >= 90){
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70){
            grade = "C";
            System.out.println("I am passed with 70%");
        } else if (score >= 60){
            grade = "D";
        } else if (score >= 50){
            grade = "E";
        } else if (score >= 40){
            grade = "F";
            System.out.println("Maley 48% bhetle hote");
        } else {
            grade = "G";
            System.out.println("Fail zala ha potta");
        }

        System.out.println("The letter grade is: " + grade);
    }
}
