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

        String test = "a,b,c,d,e,f,g,h,i";
        List<String> stringList = Stream.of(test.split(","))
                .map (String::new)
                .collect(Collectors.toList());
        //System.out.println(stringList);
        String testStringPool = "Amit";
        String testString = new String("Amit");
        System.out.println(testStringPool + ": Canonical representation: "+ testString.intern());
    }
}
