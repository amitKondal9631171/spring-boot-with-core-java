package techmahindra.solid;



class Rectangle
{
    private int length;
    private int breadth;
    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }
    public int getArea()
    {
        return this.length * this.breadth;
    }
}

class Square extends Rectangle
{

    public void setBreadth(int breadth)
    {
        //In this setting length and breadth as same value
        super.setBreadth(breadth);
        super.setLength(breadth);
    }

    public void setLength(int length)
    {
         super.setLength(length);
         super.setBreadth(length);
    }
}

public class Liskov {

    public int calculateArea(Rectangle r)
    {
        r.setBreadth(2);
        r.setLength(3);
        return r.getArea();

    }
    private String printError(String errorIdentifier, Rectangle r)
    {
        return "Unexpected value of " + errorIdentifier + " for instance of " + r.getClass().getName();
    }

    public static void main(String[] args)
    {
        Liskov lsp = new Liskov();
// An instance of Rectangle is passed
        System.out.println( lsp.calculateArea(new Rectangle()) );
// An instance of Square is passed
        System.out.println( lsp.calculateArea(new Square()) );
    }


}
