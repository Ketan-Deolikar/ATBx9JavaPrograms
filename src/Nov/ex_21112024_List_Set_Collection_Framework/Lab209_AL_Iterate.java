package Nov.ex_21112024_List_Set_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab209_AL_Iterate {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Ketan");
        myList.add("Deolikar");
        myList.add("Gaurav");

        System.out.println(" - To Print ArrayList - 1");

        for (String krt : myList){
            System.out.println(krt);
        }

        System.out.println(" - To print ArrayList - 2");

        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        System.out.println(" - To Print ArrayList - 3");

        //Iterator
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
