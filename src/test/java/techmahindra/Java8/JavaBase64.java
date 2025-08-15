package techmahindra.Java8;

import java.util.Base64;
import java.util.UUID;
import java.io.UnsupportedEncodingException;

/**
 * Java 8 now has inbuilt encoder and decoder for Base64 encoding.
 */
public class JavaBase64 {

    public static void main(String args[]) {

        try {

            // Encode using basic encoder
            String base64encodedString = Base64.getEncoder().encodeToString("Java8features".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);

            // Decode
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
            System.out.println("decoded String: " + new String(base64decodedBytes, "utf-8"));

            base64encodedString = Base64.getUrlEncoder().encodeToString("www.elcy.com".getBytes("utf-8"));
            System.out.println("Base64 Encoded String (URL) :" + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 10; ++i) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 Encoded String (MIME) :" + mimeEncodedString);

        } catch(UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
