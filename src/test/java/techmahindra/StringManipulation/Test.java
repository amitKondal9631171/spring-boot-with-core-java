package techmahindra.StringManipulation;

public class Test {
    public static void main(String[] args) {
        String s1 = "Javatpoint";    // Literal → automatically goes to the string pool
        String s2 = s1.intern();     // Returns reference from the pool, also points to the same pooled string.
        String s3 = new String("Javatpoint");// Creates a new object in heap
        String s4 = s3.intern();  // Returns reference from string pool

        System.out.println(s1==s3); // False
        System.out.println(s1==s4); // True
        System.out.println(s2==s3); // False

        System.out.println(s1==s2); // True
        System.out.println(s2==s4); // True


        System.out.println(s1.equals(s2));    // true, values are same
        System.out.println(s3==s4); // False
    }
}
