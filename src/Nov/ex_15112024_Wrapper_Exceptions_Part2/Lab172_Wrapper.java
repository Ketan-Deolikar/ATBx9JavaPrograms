package Nov.ex_15112024_Wrapper_Exceptions_Part2;

public class Lab172_Wrapper {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // Boxing - int -> Integer

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        b.intValue();


        Integer a2 = 42;
        int Value = a2; // Unboxing - Integer -> Int
        System.out.println(Value);
    }
}
