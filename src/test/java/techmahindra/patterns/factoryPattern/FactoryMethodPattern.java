package techmahindra.patterns.factoryPattern;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Defines: define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
 * The Factory Method Pattern is also known as Virtual Constructor. So, virtual constructor is design pattern in which sub-classes
 * takes care the object initialization.
 * Advantage: It promotes the loose-coupling by eliminating the dependency to application-specific classes into the code.
 * Usage: When a class doesn't know what sub-classes will be required to create
 *      : When a class wants that its sub-classes specify the objects to be created.
 */
public class FactoryMethodPattern {

    public static void main(String args[])throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");

        Scanner inputScanner = new Scanner(System.in);
        String planName=inputScanner.next();
        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPlan.
        if(Objects.isNull(p)){
            System.out.println("Plan is not in the list, Please enter valid plan name. Going to exit");
            System.exit(0);
        }

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=inputScanner.nextInt();

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.calculateBill(units);
    }
}

abstract class Plan{

    abstract double getRate();

    public void calculateBill(int units){
        System.out.println(units*getRate());
    }

}

class  DomesticPlan extends Plan{

    public double getRate(){
        return 3.50;
    }

}

class  CommercialPlan extends Plan {

    public double getRate() {
        return 7.50;
    }

}

class  InstitutionalPlan extends Plan {

    public double getRate() {
        return 5.50;
    }
}

class GetPlanFactory{

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType){

        switch(planType){

            case("DOMESTICPLAN") :
                return new DomesticPlan();
            case("COMMERCIALPLAN") :
                return new CommercialPlan();

            case("INSTITUTIONALPLAN") :
                return new InstitutionalPlan();

            default:
                return null;

        }

    }
}