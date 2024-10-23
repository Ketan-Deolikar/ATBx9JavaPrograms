package Oct.ex_21102024_ForLoop;

public class Lab100 {
    public static void main(String[] args) {
        // Congrats - 100
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
