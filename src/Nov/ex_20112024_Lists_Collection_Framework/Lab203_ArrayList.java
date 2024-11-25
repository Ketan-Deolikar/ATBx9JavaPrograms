package Nov.ex_20112024_Lists_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("bread"); // 0
        list.add("milk");  // 1
        list.add("butter"); // 2
        list.add("paneer");  //3
        list.add("jam");  //4
        list.add("cheeze");  //5
        list.add(123);  //6
        list.add(true);  //7

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));

        System.out.println("_______default for loop");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("_______fro each loop");

        for(Object o : list){
            System.out.println(o);
        }

        System.out.println(" - To print ArrayList Iterator");

        // Iterator - Anchor - go one by one forward -> get access them
        // HasNext() -> true - If we have a next element
        // Next -> element

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}