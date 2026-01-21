package techmahindra.Java8;


interface InterfaceToTestMethodAsParameter{
    public abstract void passMethodAsParameter();
}

public class MethodAsParameter {


    static void takeFunctionAsParameter(InterfaceToTestMethodAsParameter parameter){
        parameter.passMethodAsParameter();
    }

    public static void main(String[] args) {


        InterfaceToTestMethodAsParameter passFunctionAsParameter = () -> {
            System.out.println("Inside the functional interface method....");
        };

        takeFunctionAsParameter(passFunctionAsParameter);


    }

}
