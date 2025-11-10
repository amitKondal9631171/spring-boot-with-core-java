package capgemini.tricks;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonArraysAndObjects {
    public static void main(String[] args) throws JSONException {
        String jsonString="[{\n" +
                "    \"FName\": \"api-05\",\n" +
                "    \"addresses\": [\n" +
                "      {\n" +
                "        \"city\": \"Kangra\",\n" +
                "        \"state\": \"HP\",\n" +
                "        \"country\": \"India\",\n" +
                "        \"address\": \"Samela\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"city\": \"Chandigarh\",\n" +
                "        \"state\": \"UT\",\n" +
                "        \"country\": \"India\",\n" +
                "        \"address\": \"Sector 17\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "  ]";


        JSONArray array = new JSONArray(jsonString);
        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            System.out.println(obj);
        }

    }
}
