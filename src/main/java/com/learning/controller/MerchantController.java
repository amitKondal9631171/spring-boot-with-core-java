package com.learning.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

@RestController
public class MerchantController {

    @PostMapping(value = "/merchant/payment")
    public String processPayment(@RequestBody String httpRequest) throws IOException, InterruptedException, JSONException {

        //Read card details from front end
        JSONObject obj = new JSONObject(httpRequest);
        JSONObject parentJSON = obj.getJSONObject("fields");
        String name =   (String) parentJSON.get("name");
        String cardHolder =   (String) parentJSON.get("card_holder");
        String cardNumber = (String) parentJSON.get("card_number");
        String cardCvv = (String) parentJSON.get("cvv");

        cardHolder = (name.equals("")) ? "" : cardHolder;

        //Read request template from file.
        HttpClient client = HttpClient.newHttpClient();
        String requestPayload = new String(
                Files.readAllBytes(Paths.get("C:\\Users\\amkondal\\IdeaProjects\\SchoolManagement\\src\\main\\resources\\Request.txt")));

        //Updated card details in request template
        Random random = new Random();
        int transactionID = random.nextInt();
        requestPayload = requestPayload.replace("TransactionID", Integer.toString(transactionID));
        requestPayload = requestPayload.replace("CardHolder", cardHolder);
        requestPayload = requestPayload.replace("CardNumber", cardNumber);
        requestPayload = requestPayload.replace("CardCvv", cardCvv);

        HttpRequest eMerchantRequest = HttpRequest.newBuilder()
                .header("Authorization","Basic MmIxMmVlZDAyNTg3MTVkM2UyNzY0ZGY3NzlhYWUwOTUwYTI0MzJhNjo2MmQ1ZTFiZmMzYzhmYTQ5N2QyOGUwMzAxMjUxN2FmYTU4YzVkOTQ4")
                .header("Content-Type","text/xml")
                .uri(URI.create("https://staging.gate.emerchantpay.net/process/e57bc00ffb24889855e00e8dc3c6bdfa1669d49a"))
                .POST(HttpRequest.BodyPublishers.ofString(requestPayload))
                .build();
        HttpResponse<String> eMerchantResponse = client.send(eMerchantRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(eMerchantResponse.body());
        Document doc = convertStringToXMLDocument(eMerchantResponse.body());
        NodeList nodeList = doc.getElementsByTagName("payment_response");

       String responseStatus = name.equals("") ? nodeList.item(5).getNodeValue()  : "200";

        return responseStatus;
    }

    private static Document convertStringToXMLDocument(String xmlString) {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
