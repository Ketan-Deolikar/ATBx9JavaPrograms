package Nov.ex_12112024_SuperKeyword_Abstraction;

import Nov.ex_08112024_Inheritance.Father;

public class Lab158 {

    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();
    }
}

class Child extends Father1{

    @Override
    public void loan50k() {
        System.out.println("Child is giving the 50K loan");
    }
}

abstract class Father1{
    abstract void loan50k();

    void loan25k(){
        System.out.println("Done by Father!!");
    }
}