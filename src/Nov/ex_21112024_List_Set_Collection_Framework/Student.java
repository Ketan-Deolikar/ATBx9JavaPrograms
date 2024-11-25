package Nov.ex_21112024_List_Set_Collection_Framework;

public class Student {
    private String name;
    private String rollNo;

    public Student(String name, String roolNo) {
        this.name = name;
        this.rollNo = roolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoolNo() {
        return rollNo;
    }

    public void setRoolNo(String roolNo) {
        this.rollNo = roolNo;
    }

    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No :" + this.rollNo);
    }

}
