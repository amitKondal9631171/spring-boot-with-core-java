package techmahindra.CollectionsTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by HP-USER on 29-11-2018.
 */
public class StringOpreations {

    public static void main(String x[]){
        List<String> mobileNos= new ArrayList<>();
        mobileNos.add("11234");
        mobileNos.add("0986");
        mobileNos.add("64836438");

        String test = "My name is Amit. I belong to Samela";
        List<String> stringList = Stream.of(test.split(" "))
                .map (String::new) // map is used to transform the stream into a list or array or any other collection. same here it is transforming the stream into a object stream.
                .collect(Collectors.toList());
        System.out.println(stringList);

        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = s2.intern(); // check in pool. If present return the reference else create and return.

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // true
    }
}
