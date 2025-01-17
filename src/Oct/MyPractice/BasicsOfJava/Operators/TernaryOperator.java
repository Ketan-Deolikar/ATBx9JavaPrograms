package Oct.MyPractice.BasicsOfJava.Operators;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 18;
        String result = (age >= 18 ) ? "Adult" : "Minor";
        System.out.println("Result: " + result);
    }
}
