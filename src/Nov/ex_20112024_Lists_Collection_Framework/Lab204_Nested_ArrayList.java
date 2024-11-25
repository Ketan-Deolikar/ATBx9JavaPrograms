package Nov.ex_20112024_Lists_Collection_Framework;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lab204_Nested_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruits1 = new ArrayList();
        fruits1.add("Orange");
        fruits1.add("Apple");
        fruits1.add("Cherry");
        //fruits1.add(133);
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Papaya");
        System.out.println(fruits2);

        List vegetables = new ArrayList();
        vegetables.add("Tamato");
        vegetables.add("Patato");
        vegetables.add("Onin");
        System.out.println(vegetables);

        fruits2.add("Savita");

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetables);
        System.out.println(all_fruits);
    }
}
