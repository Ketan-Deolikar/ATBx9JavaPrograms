package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab201_Lists {
    public static void main(String[] args) {
        List myList = new ArrayList(); // Arrays Format - Continuous
        List myList2 = new LinkedList(); // Doubly Linked List.


        List fruits = List.of("Orange", "Apple");
        fruits.add("WaterMelon"); // java.lang.UnsupportedOperationException
    }
}
