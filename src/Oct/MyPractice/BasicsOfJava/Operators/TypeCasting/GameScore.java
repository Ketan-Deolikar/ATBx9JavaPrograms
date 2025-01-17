package Oct.MyPractice.BasicsOfJava.Operators.TypeCasting;

public class GameScore {
    public static void main(String[] args) {
        int maxScore = 600;
        int userScore = 450;

        float percentage = ((float) userScore / maxScore) * 100;

        System.out.println("User percentage is " + percentage + "%");
    }
}
