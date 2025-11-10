package capgemini.programs;


import java.time.LocalDate;
import java.util.Locale;

public class AwsS3Connection {

    public static void main(String[] args) {

            java.time.format.DateTimeFormatter dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse("11/11/2012".trim(),  dateTimeFormatter);

        System.out.println("Default Locale: " + Locale.getDefault() + " Default Charset: " + java.nio.charset.Charset.defaultCharset() + " File Encoding: " + System.getProperty("file.encoding")+ "JVM TimeZone: " + java.util.TimeZone.getDefault().getID());
        System.out.println("Default Charset: " + java.nio.charset.Charset.defaultCharset());
        System.out.println("File Encoding: " + System.getProperty("file.encoding"));
        System.out.println("JVM TimeZone: " + java.util.TimeZone.getDefault().getID());

    }

}
