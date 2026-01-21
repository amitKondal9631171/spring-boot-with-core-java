package capgemini.solid;

/**
 * The Liskov Substitution Principle helps us model good inheritance hierarchies.
 * It helps us prevent model hierarchies that don't conform to the Open/Closed principle.
 *  Any inheritance model that adheres to the Liskov Substitution Principle will implicitly
 *      follow the Open/Closed principle.
 *
 */
class StudentLP
{
    private double height;
    private double weight;

    public void setHeight(double h)
    {
        height = h;
    }
    public void setWeight(double w)
    {
        weight= w;
    }

}

class StudentBMI extends StudentLP
{
    @Override
    public void setHeight(double h)
    {
        super.setHeight(h);
        //additional functionality which breaks the rule
        super.setWeight(h);
    }
    @Override
    public void setWeight(double h)
    {
        super.setHeight(h);
        super.setWeight(h);
    }
}


public class LiskovSubstitutionPrincipal {
}
