package capgemini.tricks;

import java.util.ArrayList;
import java.util.List;

public class TrickCollections {

    public static void main(String[] args) {

        final List<String> finalList = new ArrayList<>();
        finalList.add("Amit");
        finalList.add("Kondal");

        //adding objects in loop will cause out of memory exception
        for (int i=0; i<finalList.size(); i++){
            finalList.add("Add in loop"); // size will grow and condition will not fail
        }
        // for final list can't assign new object
       // finalList = new ArrayList<>();

    }

}
