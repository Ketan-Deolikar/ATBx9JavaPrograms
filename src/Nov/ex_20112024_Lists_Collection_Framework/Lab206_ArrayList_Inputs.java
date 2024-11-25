package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab206_ArrayList_Inputs {
    public static void main(String[] args) {

        // Multiple inputs from the user and store them in separate
        // ArrayLists based on user-defined categories.

        // names, ages - store them

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y"; //Control for input loop

        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            ages.add(age); // Add age to ages list

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = sc.nextLine();
        }

        System.out.println("\nNames: " + names);
        System.out.println("Ages: " + ages);

        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }

        sc.close();
    }
}
