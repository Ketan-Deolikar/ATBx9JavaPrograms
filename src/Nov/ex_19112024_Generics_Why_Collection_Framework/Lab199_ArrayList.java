package Nov.ex_19112024_Generics_Why_Collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab199_ArrayList {
    public static void main(String[] args) {

        //        Collection list = new ArrayList(); // Dynamic Dispatch -
        //        List list1 = new ArrayList(); // Dynamic Dispatch -

        ArrayList studentList = new ArrayList();
        studentList.add("Ketan");
        studentList.add("Deolikar");
        studentList.add("Deolikar"); // Duplicate is allowed.
        studentList.add("Gaurav");
        studentList.add("Deo");
        studentList.add(true); // Different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);

    }
}
