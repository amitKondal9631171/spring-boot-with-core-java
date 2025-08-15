package techmahindra.exceptionHandling;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Exceptions are coding error introduced by the software developer while developing software.
 */
public class PrateekException {



    static void fileWriter() throws MyExceptionClass {

        FileWriter firstFile = null;

        try {
                firstFile = new FileWriter("g:/myJavaFile.txt");
                System.out.println(firstFile);
                firstFile.append("PLEASE add content in my personal file");
                firstFile.append("PLEASE add content in my personal CCCCCCCCCCCCC");
                firstFile.flush();
                File fileName = new File("d:/secondFile.txt");
                FileWriter fw = new FileWriter(fileName);
                PrintWriter writer = new PrintWriter(fw);
                writer.print("My First print writer line");
                writer.print("My Second print writer line");
                writer.flush();

        } catch (IOException e) {
            throw new MyExceptionClass();
        }finally {
            System.out.println("Going to execute finally");
        }
    }

    public static void main(String x[]) throws IOException{

        PrateekException myObj = null;


        fileWriter();

    }
}
