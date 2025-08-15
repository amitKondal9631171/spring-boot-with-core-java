package techmahindra.testing;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Testing {

    public static String formatDateToString(String format,Date date) {

        String lcDate="";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat();
            sdf.applyPattern(format);
            if(date != null)
            {
                lcDate = sdf.format(date);
            }
        }catch (Exception e) {
            //e.printStackTrace();
            //logger.error(LogId,e);

        }
        return lcDate;
    }
    public static void main(String x[]) throws Exception {


        String number = "99900000000.98";
        double amount = Double.parseDouble(number);
        java.text.DecimalFormat formatter = new java.text.DecimalFormat("###,##.00");

        System.out.println(formatter.format(amount));
        String sDate1="2019-04-19 08:46:09.479";
        Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sDate1);

        System.out.println(formatDateToString("dd/MM/yyyy HH:mm:ss", date1 ));

        double a = 0;
        double b = 0.00;
        if(a>b)
            System.out.println("a is greater");
        else
            System.out.println(a == b);
    }
}
