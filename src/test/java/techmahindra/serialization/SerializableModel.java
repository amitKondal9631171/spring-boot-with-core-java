package techmahindra.serialization;


import java.io.*;

class ParentClass implements Serializable{
    int i;
    ParentClass(int i){
        this.i=i;
    }
}
public class SerializableModel extends ParentClass {
    int j;
    SerializableModel(int i, int j){
        super(i);
        this.j=j;
    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }

    private void readObject(ObjectInputStream in) throws IOException
    {
        throw new NotSerializableException();
    }

}


class TestSerialization
{
    public static void main(String[] args)
            throws Exception
    {
        SerializableModel b1 = new SerializableModel(10, 20);
        //ParentClass b1 = new ParentClass(10, 20);
        System.out.println("i = " + b1.i);
        System.out.println("j = " + b1.j);

        // Serializing B's(subclass) object

        //Saving of object in a file
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Method for serialization of B's class object
        oos.writeObject(b1);

        // closing streams
        oos.close();
        fos.close();

        System.out.println("Object has been serialized");

        // De-Serializing B's(subclass) object

        // Reading the object from a file
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Method for de-serialization of B's class object
        B b2 = (B)ois.readObject();

        // closing streams
        ois.close();
        fis.close();

        System.out.println("Object has been deserialized");

        System.out.println("i = " + b2.i);
        System.out.println("j = " + b2.j);
    }
}
