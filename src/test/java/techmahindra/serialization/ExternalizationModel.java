package techmahindra.serialization;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationModel implements Externalizable{

    private int salary;
    private String name;

    /* Note : the default (no-arg) constructor is mandatory.
     * If this the not declared then jvm will give InvalidClassException..
      * */
    public ExternalizationModel() {
        System.out.println("No-arg constructor is invoked.");
    }

    public ExternalizationModel(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name 	= (String) in.readObject();
        salary  = in.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ExternalizationModel [" + name + " : " + salary + "  ]";
    }
}
