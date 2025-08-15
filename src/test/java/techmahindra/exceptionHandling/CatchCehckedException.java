package techmahindra.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by user on 8/9/2020.
 */
public class CatchCehckedException {


    public void fileHandling() throws CheckedException{

        File a = new File("FileName");

        try {
            FileOutputStream outputStream = new FileOutputStream(a);
        } catch (FileNotFoundException e) {
            throw new CheckedException("CheckedException: "+e);
        }

    }
}
