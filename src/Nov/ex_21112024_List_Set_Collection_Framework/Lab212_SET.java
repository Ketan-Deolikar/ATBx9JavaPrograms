package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab212_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ts = new TreeSet();

        hs.add("ketan");
        hs.add("India");
        hs.add("India");
        hs.add("India");
        System.out.println(hs);
    }
}