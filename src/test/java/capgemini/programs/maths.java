package capgemini.programs;

import java.math.BigDecimal;
import java.util.Objects;

public class maths {
    BigDecimal amount;

    public static void main(String[] args) {

        maths test = new maths();

        System.out.println(test.amount);

        String currency = (Objects.isNull(test.amount) || test.amount.compareTo(BigDecimal.ZERO) == 0) ? "EUR" : "RS";
        System.out.println("1:"+currency);
        test.amount=new BigDecimal(0);
        currency = (Objects.isNull(test.amount) || test.amount.compareTo(BigDecimal.ZERO) == 0) ? "EUR" : "RS";
        System.out.println("2:"+currency);
        test.amount=new BigDecimal(10);
        currency = (Objects.isNull(test.amount) || test.amount.compareTo(BigDecimal.ZERO) == 0) ? "EUR" : "RS";
        System.out.println("2:"+currency);


        int temp = 39;

        System.out.println(  (temp/2)   ); //19  dividend

        System.out.println(  (temp%10)   ); //9  Remainder

        System.out.println(  (temp%2)   );  //1   Remainder

    }
}
