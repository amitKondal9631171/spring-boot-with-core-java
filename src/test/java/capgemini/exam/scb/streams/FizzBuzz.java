package capgemini.exam.scb.streams;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        StringBuffer responStringBuilder = new StringBuffer();
        for(int i=1; i<=n; i++){
            if(i%3==0)
                responStringBuilder.append("Fizz");

            if(i%5==0)
                responStringBuilder.append("Buzz");

            String outPut = responStringBuilder.length() == 0 ? String.valueOf(i) : responStringBuilder.toString();
            System.out.println(outPut);
            responStringBuilder.delete(0, responStringBuilder.length());
        }
    }
    public static void main(String[] args) {

        int n = 20;
        IntStream.range(1, n) // range will not inclued 20
                .forEach(v ->{

                    String output="";

                    if(v%3==0) { output += "Fizz";}
                    if(v%5==0) { output += "Buzz";}

                    output = output.isEmpty() ? String.valueOf(v) : output;
                    System.out.println(output);

                });
    }

}
