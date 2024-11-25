package Nov.ex_21112024_List_Set_Collection_Framework;

import java.sql.SQLOutput;
import java.util.Stack;

public class Lab210_Stack {
    public static void main(String[] args) {
        // Stack
        // List In -> First Out

        // Stack s = new Stack();
        // s.add("Pramod");
        //s.add("Dutta");
        //System.out.println(s);

        Stack s = new Stack();
        s.push("Ketan");
        s.push("Gaurav");
        s.push("Pankaj");
        s.push("Swapnil");
        System.out.println(s.size());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);

        s.add("Pavan");
        s.push("Atul");
        System.out.println(s);

        s.add(0, "Keshav");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
