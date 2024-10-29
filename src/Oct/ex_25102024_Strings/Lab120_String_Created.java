package Oct.ex_25102024_Strings;

public class Lab120_String_Created {
    public static void main(String[] args) {
        String name = "Ketan";
        name = "Deolikar";
        name = "Ketan Deolikar";
        name = "Ketan";

        // String -> data type
        // name -> Ref
        // = -> assignment operator
        // "Pramod" - Literal(String)

        System.out.println(name);

        String name2 = new String("Ketan");
        String name3 = new String("Ketan");
        String name5 = name2;

        System.out.println(name5);
    }
}
