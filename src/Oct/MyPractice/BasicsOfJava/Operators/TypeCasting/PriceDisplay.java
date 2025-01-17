package Oct.MyPractice.BasicsOfJava.Operators.TypeCasting;

public class PriceDisplay {
    public static void main(String[] args) {
        double price = 49.99;


        int displayPrice = (int) price;

        System.out.println("The discount price is $" + displayPrice);
    }
}
