package Nov.ex_22112024_Map_Collection_Framework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab222_Map_P5 {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class
        // T1, T2 - they will use one by one.
        Hashtable<Integer, String> HT1 = new Hashtable<>();
        HT1.put(1, "One");
        HT1.put(2, "two");
        HT1.put(3, "three");
        System.out.println(HT1);
        System.out.println(" -- ");
        //  ht1.put(3, null); // java.lang.NullPointerException
        // ht1.put(null, "four"); // java.lang.NullPointerException

        HashMap<Integer, String> HT2 = new HashMap<>();
        HT2.put(1, "One");
        HT2.put(2, "two");
        HT2.put(3, "three");
        HT2.put(3, null);
        HT2.put(null, null);
        System.out.println(HT2);

        Enumeration<Integer> e = HT1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
