package capgemini.java9;

public interface PrivateMethodInInterface {

    static void staticHelperMethod(){
        System.out.println("Static Helper Method");
    }

    default void defaultFunctionality(){
        privateHelperMethod();
        staticHelperMethod();
        System.out.println("Interface Default Method is used for: \n" +
                            "1) To Provide Common functionality. \n" +
                            "2) When any addition is required in interface and need to protect" +
                            " the code from breaking as multiple implementation classes needs to update.");
    }

    //Possible in interface after java 9
    private void privateHelperMethod(){
        System.out.println("Private Helper Method");
    }

}
