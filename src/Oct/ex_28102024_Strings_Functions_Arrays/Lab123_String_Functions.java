package Oct.ex_28102024_Strings_Functions_Arrays;

public class Lab123_String_Functions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s1 = "Ketan";
        String s2 = s1.concat("Deolikar");
        System.out.println(s2);


        String fruits = "apple, banana, cherry"; // delimeter
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);


        String fruits2 = "ABC-XYZ-QWE"; //delimeter
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        String s4 = "Ketan";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

       // String s5 = "Ketan";
       // System.out.println(s5.trim());

        String s6 = "Ketan";
        System.out.println(s6.indexOf("e"));
        System.out.println(s6.indexOf("n"));

        String s7 = "Ketan";
        System.out.println(s7.contains("Ke"));
        System.out.println(s7.contains("zy"));

        String s8 = "KetanDeolikar";
        System.out.println(s8.lastIndexOf("D"));

        String s9 = "KetanDeolikar";
        System.out.println(s9.replace("D", "z"));
        System.out.println(s9.replaceAll("D", "z"));

        String s10 = "KetanDeolikarJi";
        System.out.println(s10.startsWith("Ketu"));
        System.out.println(s10.endsWith("Gi"));
        System.out.println(s10.endsWith("ji"));


        String original = "Banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original2 = "Ketan19 Deolikar95!";
        String result2 = original2.replaceAll("\\d+", "-");
        System.out.println(result2);

        String result3 = original2.replaceAll("o", "O");
        System.out.println(result3);
    }
}
