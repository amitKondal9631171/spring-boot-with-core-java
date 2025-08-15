package capgemini.programs.arrayz;

import java.util.Arrays;

public class ArraySizeExtraZeros {

    public static void main(String[] args) {

        int[] x = new int[20];

        System.out.println("Array size: "+x.length);
        x[8]=3;x[18]=35;

        int count = (int)Arrays.stream(x).filter(value -> value > 0).count();
        int[] y = new int[count];
        int yCount=0;
        for(int k=0; k < x.length-1; k++){

          int z =  x[k];
          if(z>0){
              y[yCount++] = z;
          }
        }
        System.out.println(Arrays.toString(y));

    }
}
