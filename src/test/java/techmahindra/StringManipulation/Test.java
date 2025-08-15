package techmahindra.StringManipulation;

public class Test {
    public static void main(String[] args) {
        String s1 = "Javatpoint";
        String s2 = s1.intern();// will not create object in heap, It creates an exact copy of the heap string object in the String Constant Pool.
        String s3 = new String("Javatpoint");
        String s4 = s3.intern(); // will add object into string pool

        System.out.println(s1==s3); // False
        System.out.println(s1==s4); // True
        System.out.println(s2==s3); // False
        System.out.println(s1==s2); // True
        System.out.println(s2==s4); // True
        System.out.println(s3==s4); // False
    }
}
