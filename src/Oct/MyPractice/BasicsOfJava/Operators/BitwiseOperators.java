package Oct.MyPractice.BasicsOfJava.Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int m = 5, n = 3;
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("m << 1: " + (m << 1));
        System.out.println("m >> 1: " + (m >> 1));
    }
}
