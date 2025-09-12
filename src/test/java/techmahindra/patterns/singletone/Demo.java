package techmahindra.patterns.singletone;


public class Demo {

    public static void main(String[] args) {


        SingleObject object = SingleObject.getMultiThreadedInstance();
        System.out.print(object +" ");
        object.showMessage();



    }




}
