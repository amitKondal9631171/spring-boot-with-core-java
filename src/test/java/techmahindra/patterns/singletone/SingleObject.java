package techmahindra.patterns.singletone;


import java.util.Objects;

public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = null;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get the only object available
    //Not thread safe
    public static SingleObject getInstance(){
        return instance;
    }

    //Thread safe
    public static SingleObject getMultiThreadedInstance(){
        if(Objects.isNull(instance)) {
            synchronized (instance) {
                if (Objects.isNull(instance)) { //double check if object is initialized or not.
                    instance = new SingleObject();
                    return instance;
                } else
                    return instance;
            }
        }else
            return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
