package Nov.ex_22112024_Map_Collection_Framework;

//import java.util.*; // Import all the modules
//// don't do it, it will slow down the code.


import java.util.HashMap;
import java.util.Map;

public class Lab217_Map_P1 {
    public static void main(String[] args) {

        // Map is key - value
        // name : pramod, rollno : 1
        // phone : 9876543210
        Map m1 = new HashMap();


        // Map<String,Object> m1 = new HashMap();
        // Data Type - Fixed

        m1.put("Name", "Ketan");
        m1.put("RollNo", 123);
        m1.put("Phone", 866262760);
        System.out.println(m1);

        // When to use Map and when to use List?
        // List -> Shopping , single items,
        // name -> pramod, rol : 1

    }
}
