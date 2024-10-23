package Oct.ex_17102024_IfCondition;

public class Lab073_HackerrankQ {
    public static void main(String[] args) {

        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        // Logic Building - Java

        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) -> data type -> int
        // Output | grade -> data type -> char


        // 2. Basic Logic |  Rough Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or print grade - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,E
        //  // else -> grade -> F


        // 3. Write the code

        int score = 85;
        char grade;

        if(score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
    }
}