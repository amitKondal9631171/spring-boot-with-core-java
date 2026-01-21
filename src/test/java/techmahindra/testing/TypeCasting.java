package techmahindra.testing;

/**
 * Created by HP-USER on 02-02-2019.
 */
public class TypeCasting {

    public static void main(String args[]){

        String stringValue = "abc";

        //Implicit casting
        Object objType = stringValue;

        System.out.println("Value from String to object casting: "+objType);
        //Explicit casting
        String objTypeValue = (String) objType;
        System.out.println("Value from Object to String casting: "+objTypeValue);


        ParentClass parentCLassObj = new ParentClass();
        FirstChild firstChild = new FirstChild();
        SecondChild secondChild = new SecondChild();

        if(parentCLassObj instanceof FirstChild)
            parentCLassObj = firstChild;

        ParentClass parentObj = new FirstChild();

       // parentObj.childName();

        if(parentObj instanceof SecondChild){
            secondChild=(SecondChild)parentObj;//downcasting
        }
            secondChild.chidName();

    }
}

class ParentClass{
    void parentName(){
        System.out.print("Braham Dass");
    }
    void childName(){
        System.out.println("father.....");
    }
}

class FirstChild extends ParentClass{
    void childName(){
        System.out.println("Prateek");
    }
}

class SecondChild extends ParentClass{
    void chidName(){
        System.out.println("Nititka");
    }
}




