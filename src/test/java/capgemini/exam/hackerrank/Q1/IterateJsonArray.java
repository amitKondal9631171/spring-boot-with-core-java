package capgemini.exam.hackerrank.Q1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IterateJsonArray {


    /*final String uri = "https://jsonmock.hackerrank.com/api/inventory";
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);
    JSONObject root;

    {
        try {
            root = new JSONObject(result);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    static JSONArray data;

    {
        try {
            data = root.getJSONArray("data");
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }*/

    public static void main(String[] args) {
       try {
            String result = Files.readString(Paths.get("./src/test/java/capgemini/exam/hackerrank/Q1/SampleJson.json"));
           JSONObject data1 = new JSONObject(result);
            JSONArray data = new JSONArray(data1.get("data"));

           // Convert JSONArray -> Stream<JSONObject>
           Stream<JSONObject> jsonStream = IntStream.range(0, data.length())
                   .mapToObj(i -> {
                       Object obj = null;
                       try {
                           obj = data.get(i);
                           if (obj instanceof JSONObject) {
                               return (JSONObject) obj;
                           } else {
                               throw new RuntimeException("Element at index " + i + " is not a JSONObject");
                           }
                       } catch (JSONException e) {
                           throw new RuntimeException(e);
                       }
                   });

           List<Product> products = IntStream.range(0, data.length())
                   .mapToObj(i -> {
                       try {
                           return data.getJSONObject(i);
                       } catch (JSONException e) {
                           throw new RuntimeException(e);
                       }
                   })
                   .map(obj -> new Product(
                           obj.optString("item"),        // optXxx avoids JSONException
                           obj.optInt("price"),
                           obj.optInt("available"),
                           obj.optInt("discount"),
                           obj.optString("category"),
                           obj.optString("barcode")
                   ))
                   .collect(Collectors.toList());


            System.out.println(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
