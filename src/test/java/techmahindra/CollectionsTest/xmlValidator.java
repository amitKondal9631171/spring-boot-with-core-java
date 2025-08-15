package techmahindra.CollectionsTest;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class xmlValidator {

    public static boolean validateSwiftXMLSchema(String xsdPath, String xmlPath){

        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
            System.out.println("File validated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    public static void main(String x[]){
        try
        {
            TestObjects obj1 = new TestObjects();
            obj1.setName("Obj1Name");
            obj1.setClasss("Obj1Class");
            obj1.setType("Obj1Type");
            obj1.setVillage("Obj1Village");
            TestObjects obj2 = new TestObjects();
            obj2.setName("Amit");
            obj2.setClasss("Obj2Class");
            obj2.setType("Obj2Type");
            obj2.setVillage("Obj2Village");
            TestObjects obj3 = new TestObjects();
            obj3.setName("Obj3Name");
            obj3.setClasss("Obj3Class");
            obj3.setType("Obj3Type");
            obj3.setVillage("Obj3Village");

            List<TestObjects> testObjects= new ArrayList<>();
            testObjects.add(obj1);
            testObjects.add(obj2);
            testObjects.add(obj3);

            System.out.println(testObjects.stream().anyMatch(obj1::isRealName));

            /*List<String> mobileNos= new ArrayList<>();
            mobileNos.add("11234");
            mobileNos.add("0986");
            mobileNos.add("64836438");
            Map<String, Object> map = new HashMap();

            map.put("Name","Amit");
            map.put("Sur Name","kondal");
            map.put("Village","Samela");
            map.put("MobileNos",mobileNos);
            map.put("TestObjects",testObjects);
            Path path = Paths.get("C:\\Users\\HP-USER\\Desktop\\MapFile.txt");
            Files.write(path, () -> map.entrySet().stream()
                    .<CharSequence>map(e -> e.getKey() + " : " + e.getValue())
                    .iterator());
*/
           /* String xsdPath = "C:\\GITCode\\TestCode\\TempProject\\src\\main\\resources\\NewElcySwiftMessage.xsd";
            String filePath = "C:\\GITCode\\TestCode\\TempProject\\src\\main\\resources\\Test.xml";
            validateSwiftXMLSchema(xsdPath,filePath);*/
        }
        catch(Exception exp)
        {
            System.out.println(exp);

        }
    }
}
