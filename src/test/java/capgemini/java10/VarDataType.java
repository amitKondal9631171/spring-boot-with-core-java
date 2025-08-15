package capgemini.java10;

import java.util.HashMap;

public class VarDataType {
    public static void main(String[] args) {

        var inputInteger = 20;
        System.out.println(inputInteger);
        //inputInteger = "Amit"; as we assigned this var a integer value so, it can't take other data type.

        var inputString = "Amit Kondal";
        System.out.println(inputString);
        //inputString = 20; as we assigned this var a String value so, it can't take other data type.

        //extensively used to write simple code while working with collections
        //As in this case in left side don't need to define the map details
        var mapCollection = new HashMap<String,Integer>();

    }
}
