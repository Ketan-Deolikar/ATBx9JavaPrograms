package Oct.MyPractice.BasicsOfJava.ScannerClass;

public class MaxNumber {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
