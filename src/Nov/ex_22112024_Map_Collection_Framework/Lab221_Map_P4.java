package Nov.ex_22112024_Map_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab221_Map_P4 {
    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();
        student1.put("Name", "Ketan");
        student1.put("RollNo", "1");
        student1.put("Phone", "5766546547");
        System.out.println(student1);

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("name","amit");
        student2.put("roll","2");
        student2.put("phone","65432356");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
