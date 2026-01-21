package techmahindra.programs;

/**
 * Created by HP-USER on 05-06-2019.
 */
public class SwapNumbers {

    private static void withThirdVariable(){
        int x=10, y=20, temp;
        System.out.println("Before Swapping: x: " + x +", y: "+ y);
        temp = x;
        x = y; y = temp;
        System.out.println("After Swapping: x: " + x +", y: "+ y);
    }

    private static void swapTwoNumberWithoutThirdVariable(){
        int x=10, y=20;
        System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
    }

    public static void main(String[] args) {
        withThirdVariable();
        swapTwoNumberWithoutThirdVariable();
    }
}
