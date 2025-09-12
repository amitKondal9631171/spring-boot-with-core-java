package techmahindra.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlockTesting {


    public static void main(String[] args) {

        try {
            System.out.println("Opening resource...");
            int num = 10 / 2;
            System.out.println(num);
        } finally {
            System.out.println("Closing resource...");
        }

/*
        try {
            System.out.println("Start");
            int result = 10 / 0; // ArithmeticException
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("End"); // ❌ Won't execute due to unhandled exception*/

        FileInputStream fis = null;

            try {
                fis = new FileInputStream("data.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }  finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
