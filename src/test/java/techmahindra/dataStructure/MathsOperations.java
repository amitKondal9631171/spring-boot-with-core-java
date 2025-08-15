package techmahindra.dataStructure;

/**
 * Created by HP-USER on 26-06-2019.
 */
public class MathsOperations {


    public static void main(String[] args) {

        int a = 17 , b = 4;

        System.out.println( a/b ); // 4
        System.out.println( a/10 ); // 1

        System.out.println( a%b ); // 1
        System.out.println( a%10 ); // 7

        int value = 98767485;

        while(value != 0){

            value = value / 10;
            System.out.println("After divide:" + value);

        }

        value = 98767485;

        while(value != 0){

            int temp = value % 10;
            System.out.println("Div :" + temp);
            value = value / 10;

        }
        value = 98767485;
        int reverserValue = 0;
        while(value != 0){

            int temp = value % 10;
            reverserValue = reverserValue * 10 + temp;
            value = value / 10;

        }

        System.out.println("Reverse is: " + reverserValue);
    }

}
