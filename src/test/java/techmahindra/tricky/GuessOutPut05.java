package techmahindra.tricky;

import java.util.HashSet;

/**
 * Created by HP-USER on 11-06-2019.
 */
public class GuessOutPut05 {

    String name;
    int age;

    GuessOutPut05(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public int hashCode(){
        return this.age;
    }
    @Override
    public boolean equals(Object var1){
        return ((GuessOutPut05) var1).age == this.age;
    }

    public static void main(String[] args) {

        GuessOutPut05 c1= new GuessOutPut05("John",20);
        GuessOutPut05 c2= new GuessOutPut05("John",20);

        HashSet<GuessOutPut05> customerSet=new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);

        //If we will not override hashcode and equals method of thread class then the size will be 2
        // reason being they will be equal as per the standard without the same hashcode and equals method.
        // As hashset internally uses the hashmap.
        System.out.println(customerSet.size());
    }

}
