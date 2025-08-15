package techmahindra.access.pack1;


public class DeclareSpecifiers {


    //can not be accessed out side the class
    private String privateVariable;
    //can not be accessed out side the packed even after inheriting this class.
    String defaultVariable;
    //Can be accessed outside the package in the subclass
    protected String protectedVariable;
    //can be accessed outside the class.
    public String publicVariable;

    private String getPrivateVariable() {
        return privateVariable;
    }

    private void setPrivateVariable(String privateVariable) {
        this.privateVariable = privateVariable;
    }

    String getDefaultVariable() {
        return defaultVariable;
    }

    void setDefaultVariable(String defaultVariable) {
        this.defaultVariable = defaultVariable;
    }

    protected String getProtectedVariable() {
        return protectedVariable;
    }

    protected void setProtectedVariable(String protectedVariable) {
        this.protectedVariable = protectedVariable;
    }

    public String getPublicVariable() {
        return publicVariable;
    }

    public void setPublicVariable(String publicVariable) {
        this.publicVariable = publicVariable;
    }
}
