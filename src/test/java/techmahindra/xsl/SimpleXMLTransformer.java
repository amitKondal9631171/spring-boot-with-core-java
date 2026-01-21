package techmahindra.xsl;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class SimpleXMLTransformer {
	private static String inXML =  "./src/main/resources/xsl/elcyFormat.xml";
	private static String inXSL =  "./src/main/resources/xsl/transformer.xsl";
	private static String outXML = "./src/main/resources/xsl/finastraFormat.xml";
	
	public static void main(String[] args) {
		
		File file=new File(inXML);
		String content = "";
	    try {
			content = new String(Files.readAllBytes(Paths.get(inXML)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		transform(content,inXSL,outXML);
	}
	private static void transform(String inputXMLString,String inXSLPath,String outXMLPath) {
		TransformerFactory factory = TransformerFactory.newInstance();
		StreamSource xslStream = new StreamSource(inXSLPath);
		try {
			Transformer transformer = factory.newTransformer(xslStream);
			StreamSource in =new StreamSource(new StringReader(inputXMLString));
			StreamResult out = new StreamResult(outXMLPath);
			transformer.transform(in,out);
			System.out.println("The generated XML file is:" + outXMLPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
