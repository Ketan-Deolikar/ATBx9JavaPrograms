package Nov.ex_18112024_Exceptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab193_Try_Catch_P2 {
    // Throws - Checked
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStram = new FileInputStream("C: //a.log");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.out.println(e.getMessage());

            System.out.println("File ni hai");
        } finally {
            System.out.println("Yes");
        }
    }
}

