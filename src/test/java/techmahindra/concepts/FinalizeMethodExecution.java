package techmahindra.concepts;

public class FinalizeMethodExecution {

    @Override
    protected void finalize()
    {
        System.out.println("Inside finalize method");
        System.out.println("Performing clean-up before destroying the object.");
        System.out.println("Release and close connections.");
    }

}
