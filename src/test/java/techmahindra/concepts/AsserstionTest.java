package techmahindra.concepts;

/**
 * Created by vkondal on 8/12/2020.
 */
public class AsserstionTest {


    static int squareOFValue(int a){

        assert a>20 : false;

        return a*a;
    }

    public static void main(String[] args) {
        System.out.println("Square of number: "+squareOFValue(27));
    }

}
