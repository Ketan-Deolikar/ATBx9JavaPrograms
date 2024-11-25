package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab211_ArrayList_Class {
    public static void main(String[] args) {
        Student s1 = new Student("Ketan", "29");
        Student s2 = new Student("kiran", "28");
        Student s3 = new Student("Nikunj", "27");

        List<Student> myList = new ArrayList<>();
        myList.add(s1);
        myList.add(s2);
        myList.add(s3);

        s1.printDetails();
        s2.printDetails();
        s2.printDetails();

        System.out.println(myList);

    }
}
