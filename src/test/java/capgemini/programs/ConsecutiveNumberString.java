package capgemini.programs;

public class ConsecutiveNumberString {


    static int isConsecutive(String str)
    {
        int start;

        int length = str.length();

        //Iterate till half because after half the next number will be of same length 123 124

            String new_str = str.substring(0, length/2);
            int num = Integer.parseInt(new_str);
            start = num;

            while (new_str.length() < length)
            {

                 num++;
                 new_str = new_str.concat( String.valueOf(num) );

            }
            if (new_str.equals(str))
                return start;
        //}

         return -1;
    }

     public static void main(String[] args)
    {
         String str = "99100";
        System.out.println("String: " + str);
        boolean start = isConsecutive(str) != -1;
        System.out.println("Is consecutive: " + start);

        String str1 = "1213";
        System.out.println("\nString: " + str1);
        start = isConsecutive(str) != -1;
        System.out.println("Is consecutive: " + start);

        str1 = "123124";
        System.out.println("\nString: " + str1);
        start = isConsecutive(str) != -1;
        System.out.println("Is consecutive: " + start);
    }

}
