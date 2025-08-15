package techmahindra.serialization;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

    void serializeObject(ExternalizationModel obj) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/main/resources/myfileExtern");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        oos.close();
    }

    ExternalizationModel deserializeObject() throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("./src/main/resources/myfileExtern");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizationModel obj = (ExternalizationModel) ois.readObject();

        ois.close();
        return obj;
    }

    public static void main(String[] args) {
        ExternalizationDemo demo = new ExternalizationDemo();

        try{
            ExternalizationModel obj = new ExternalizationModel(20000, "Kumar");
            System.out.println("Before serialization");
            demo.serializeObject(obj);
            System.out.println("Serialized Object : " + obj);
            obj.setName("Bhuvi");

            ExternalizationModel deseObj = (ExternalizationModel)demo.deserializeObject();
            System.out.println(deseObj.getName() + " : " + deseObj.getSalary());
        } catch(IOException ioe){
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
}
