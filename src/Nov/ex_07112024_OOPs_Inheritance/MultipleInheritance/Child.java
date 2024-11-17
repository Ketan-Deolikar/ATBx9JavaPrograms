package Nov.ex_07112024_OOPs_Inheritance.MultipleInheritance;

public class Child extends Father{ ////extends Father,Mother

    public static void main(String[] args) {

        Father f = new Father();
        int i = f.gold_f;
        System.out.println(i);
        f.home();


    }


    void CanIUse(){
        //money(); // Father, Mother. - JVM
    }
}
