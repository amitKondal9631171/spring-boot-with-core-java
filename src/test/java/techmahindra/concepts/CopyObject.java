package techmahindra.concepts;


/**
 * We can copy object with 3 ways:
 * 1. Shallow copy: copy only the reference.
 * 2. Deep Copy: copy all properties of object manually.
 * 3. clone: need to override clone method of object class and implement cloneable marker interface.
 * Clone gives Shallow copy
 */
public class CopyObject {

    private CloneParentEmployee getObject(){
        CloneParentEmployee employee = new CloneParentEmployee();
        employee.setEmpName("Amit");
        employee.setEmpId(1);
        CloneChildAddress childAddress = new CloneChildAddress();
        childAddress.setCityName("Kangra");
        childAddress.setStreetNo(1);
        employee.setAddress(childAddress);

        return employee;
    }

    private void shallowCopy(){
        CloneParentEmployee employee = getObject();
        CloneParentEmployee copiedObject = employee;
        //After copy we are change parent as well as child object property. So, it is reflecting to the copied object.
        copiedObject.setEmpId(2);
        copiedObject.getAddress().setStreetNo(2);

        System.out.println(copiedObject);
    }

    //Clone returns the shallow copy
    private void testClone() throws CloneNotSupportedException {
        CloneParentEmployee employee = getObject();

        //Clone gives Shallow copy
        CloneParentEmployee clone = (CloneParentEmployee) employee.clone();
        clone.getAddress().setStreetNo(300000000);
         System.out.println("Copied: "+clone);

    }

    private void deepCopy(){

        CloneParentEmployee employee = getObject();
        CloneParentEmployee copiedObject = new CloneParentEmployee();
        //After copy we are change parent as well as child object property. So, it will not reflect on the copied object.
        copiedObject.setEmpName("U-"+employee.getEmpName());
        copiedObject.setEmpId(3);

        CloneChildAddress copiedAddress = new CloneChildAddress();
        copiedAddress.setCityName("U-"+employee.getAddress().getCityName());
        copiedAddress.setStreetNo(3);
        copiedObject.setAddress(copiedAddress);
        System.out.println(copiedObject.toString());
    }
    public static void main(String[] args) throws CloneNotSupportedException {

        /*System.out.println("Original Properties:\n "+ new CopyObject().getObject());
        System.out.println("Shallow copy");
        new CopyObject().shallowCopy();

        System.out.println("Deep Copy");
        new CopyObject().deepCopy();*/

        System.out.println("Clone Copy");
        new CopyObject().testClone();
    }
}

class CloneParentEmployee implements Cloneable{


    private String empName;
    private Integer empId;
    private CloneChildAddress address;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public CloneChildAddress getAddress() {
        return address;
    }

    public void setAddress(CloneChildAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CloneParentEmployee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", address=" + address.toString() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class CloneChildAddress implements Cloneable{

    private String cityName;
    private int streetNo;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    @Override
    public String toString() {
        return "CloneChildAddress{" +
                "cityName='" + cityName + '\'' +
                ", streetNo=" + streetNo +
                '}';
    }
}
