package capgemini.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Hashcode {
    public static void main(String[] args) {


        System.out.println("Aa hash code: " + "Aa".hashCode()); //2112
        System.out.println("BB hash code: " + "BB".hashCode()); //2112


        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 100);       // int -> Integer (autobox)
        int v = map.get(1);    // Integer -> int (unbox)

        int a   = 10;
        Object b = a;    // Autoboxing

        System.out.println(b);

        int[] numbers = {1, 5, 9, 16, 17, 31, 32, 65537, 131073};
        int tableSize = 16; // Change this to 32 to see different bucket distributions

        System.out.printf("%-10s %-20s %-20s %-20s %-20s%n",
                "Number", "Original Hash", "Spread Hash", "Bucket Index", "Table Size");
        System.out.println("------------------------------------------------------------------------------------------");

        for (int num : numbers) {
            int h = Integer.hashCode(num);        // Step 1: Get original hash
            int spread = h ^ (h >>> 16);          // Step 2: For small hash values (like 1, 5, 9, 16, 17, etc.), the upper 16 bits of the number are all 0.
                                                //   So the XOR ^ operation basically does:
                                                //   hash ^ 0 = hash
            //When the original hash is larger than 65536 (2^16), shifting by 16 bits yields a non-zero value
            int bucketIndex = (tableSize - 1) & spread;  // Step 3: Map to bucket
            /**
             * The & operator is bitwise AND in Java (and most programming languages).
             * 31 in binary → 11111
             * 5 in binary → 00101
                 *   11111   (31)
                 * & 00101   (5)
                 * ---------
                     00101   (5)
                 * --------
             *
             */


            System.out.printf("%-10d %-20d %-20d %-20d %-20d%n",
                    num, h, spread, bucketIndex, tableSize);
        }

        System.out.println("Test: "+ (31 & 131075));
    }
}
