
package capgemini.programs.sample;

public class PrePostIncrement {



    public static void main(String[] args) {

        int i = 0;

        //In pre increment, first value is incremented and then used
        System.out.println("Pre Increment: "+ ++i);

        //In post increment, first value is used then incremented.
        i = 0;
        System.out.println("Post Increment: "+ i++); // First it will show then increment.
        //As value of i is incremented in previous statement then will get the incremented one. here
        System.out.println(i);

        i = 0;
        int j = i;
        j = i++ + j; //after giving i = 0 , i is incremented to 1 for next use of i

        System.out.println(i + " - " + j);

        System.out.println("--------pre increment----------");
        for (int k = 1 ; k <= 10 ; ++k ){
            System.out.println(k);
        }

    }

}