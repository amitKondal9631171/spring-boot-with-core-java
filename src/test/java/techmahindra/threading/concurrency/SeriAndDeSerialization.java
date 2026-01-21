package techmahindra.threading.concurrency;

import java.io.*;

//If a class has a reference to another class, all the references must be Serializable otherwise serialization
// process will not be performed. In such case, NotSerializableException is thrown at runtime.
class A
{
    int i;

    // parameterized constructor
    /* public A(int i)
    {
        this.i = i;
    }*/

}

// subclass B
// B class doesn't implement Serializable
// interface.
class B extends A implements Serializable
{
    int j;

    // parameterized constructor
    public B(int i, int j)
    {
        // super(i);
        this.j = j;
    }
    // By implementing writeObject method,
    // we can prevent
    // subclass from serialization
   /* private void writeObject(ObjectOutputStream out) throws IOException
    {
        throw new NotSerializableException();
    }*/

    // By implementing readObject method,
    // we can prevent
    // subclass from de-serialization
    /*private void readObject(ObjectInputStream in) throws IOException
    {
       throw new NotSerializableException();
    }*/
}

public class SeriAndDeSerialization {

    private void serializeObject(){
        try {
            B s1 =new B( 1, 123);
            FileOutputStream fout=new FileOutputStream("./src/main/resources/f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
        }catch (Exception ex){
            ex.getStackTrace();
        }
    }

    private void deSerializeObject(){
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("./src/main/resources/f.txt"));
            B s=(B)in.readObject();
            System.out.println(s.i +" : "+s.j);
            in.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SeriAndDeSerialization().serializeObject();
        new SeriAndDeSerialization().deSerializeObject();
    }
}
