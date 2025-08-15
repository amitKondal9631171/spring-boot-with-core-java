package techmahindra.CollectionsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Advantages of generics:
 *  * 1) Code reuse ability
 *  * 2) Type Safety: if we want to store String in ArrayList without define the type of object list going to add then it will
 *  *                  or can add integer value also it will compile the code but during run time it will throw exception
 *  *                  where we type cast the object to string.
 *  * 3) When to use Upper bound and when to use lower bound:
 *  *    --> For this to happened Get-Put principal  is used, which defines as follow:
 *  *         --> generics are used to make generic functions which takes parameters and gives values for that we have in and out parameter:
 *  *         --> Upper bound: if we want to use variable as in variable and provide data to code then use Upper bound. So that In variable can act as parent class.
 *  *             --> upperBound( ? extends Number){}
 *  *         --> Lower bound: if variable is OUT category than use lower bound.
 *  *             --> lowerBound(? super Number){}
 *
 */


class Test extends Number{

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

public class GetPutPrincipleGenerics {


    /**
     * lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.
     * In the defined list we can pass Integer or Number because we defined the lower boundary
     */
    private void lowerBoundGenerics(List<? super Integer> lowerBoundList){
        lowerBoundList.get(1);
        lowerBoundList.add(1);
        lowerBoundList.forEach( p -> System.out.println(p));
    }

    /**
     * The Upper Bounded Wildcards section shows that an upper bounded wildcard restricts the
     * unknown type to be a specific type or a subtype of that type and is represented using
     * the extends keyword.
     */
    private <T extends Number> void upperBoundGenerics(List<T> upperBoundList){
       // upperBoundList.add(1);
        upperBoundList.forEach( p -> System.out.println(p));
    }
    //list will take any type of element
    private void unboundedTypeGenerics(List<?> unboundedGeneric){
        unboundedGeneric.forEach( p -> System.out.println(p));
    }

    public static void main(String[] args) {

        List<GetPutPrincipleGenerics> getPutPrincipleGenericss = new ArrayList<>();
        getPutPrincipleGenericss.add(new GetPutPrincipleGenerics());
        List<Integer> integerList = new ArrayList<>();//Arrays.asList(1,2,3,2,1,43); List created by using Arrays.asList is not suppported for structural changes
        integerList.add(1);
        integerList.add(2);
        List<Double> doubleList = Arrays.asList(1.1,2.1,.3,2.1);
        List<Float> floatList = Arrays.asList(1F);
        List<Number> numberList = new ArrayList<>();

        Float f = 1F;
        Double d = 1D;
        System.out.println(f + " : " + d);

        GetPutPrincipleGenerics obj = new GetPutPrincipleGenerics();
        obj.lowerBoundGenerics(integerList);
        obj.lowerBoundGenerics(numberList);

        obj.upperBoundGenerics(integerList);
        obj.upperBoundGenerics(doubleList);
        obj.upperBoundGenerics(floatList);
        obj.upperBoundGenerics(numberList);


        obj.unboundedTypeGenerics(integerList);
        obj.unboundedTypeGenerics(numberList);
        obj.unboundedTypeGenerics(integerList);
        obj.unboundedTypeGenerics(doubleList);
        obj.unboundedTypeGenerics(floatList);
        obj.unboundedTypeGenerics(numberList);
    }
}
