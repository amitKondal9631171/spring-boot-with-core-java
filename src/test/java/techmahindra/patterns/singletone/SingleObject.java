package techmahindra.patterns.singletone;


import java.util.Objects;

public class SingleObject {

    // Step 1: Volatile ensures visibility and prevents reordering
    private static volatile SingleObject instance = null;


    private SingleObject(){}


    public static SingleObject getMultiThreadedInstance(){

        if(Objects.isNull(instance)) {
            synchronized (SingleObject.class) {
                if (Objects.isNull(instance)) {
                    instance = new SingleObject();
                }
            }
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
