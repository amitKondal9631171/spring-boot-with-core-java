package techmahindra.CollectionsTest;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.HashSet;

public class SerializationArrayList
{
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        Set set = new HashSet();

        Iterator itr = set.iterator();


        try
        {
            List<String> fileWithLines = Files.readAllLines(Path.of("f:/SerializationArrayList.txt"));
            //Serialization
            File serializeFile = new File("f:/SerializationArrayList.txt");
            if(!serializeFile.exists()){
                serializeFile.createNewFile();
            }
            FileOutputStream fos=new FileOutputStream(serializeFile);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis=new FileInputStream(serializeFile);
            ObjectInputStream ois=new ObjectInputStream(fis);
            ArrayList  list=(ArrayList)ois.readObject();
            System.out.println(list);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
