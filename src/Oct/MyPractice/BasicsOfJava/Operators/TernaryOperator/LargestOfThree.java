package Oct.MyPractice.BasicsOfJava.Operators.TernaryOperator;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 45, b = 78, c = 32;

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The largest number is: " + largest);
    }
}
