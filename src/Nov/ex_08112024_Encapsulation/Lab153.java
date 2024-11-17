package Nov.ex_08112024_Encapsulation;

import Nov.ex_05102024_OOPs.Person;

public class Lab153 {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("P", "123");
        p1.getName();
        p1.setName("Ketan");
        // p1.name
        // p1.phone_no
    }
}

class Persoon{
    private String name;
    private String phone_no;

    public Persoon(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

}