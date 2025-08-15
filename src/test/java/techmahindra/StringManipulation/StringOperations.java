package techmahindra.StringManipulation;

public class StringOperations {

    public static void main(String[] args) {

        String s1 = "Amit";
        String s2 = new String("Amit");
        s2 = s2.intern();
        s2 = s2.substring(1) + s2.charAt(0);
        System.out.println(s2) ;
        s2 = s2.substring(1) + s2.charAt(0);
        System.out.println(s2) ;

    }
}