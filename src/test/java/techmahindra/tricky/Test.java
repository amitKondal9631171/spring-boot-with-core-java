package techmahindra.tricky;

import java.util.HashMap;
import java.util.Map;

class Students{
    String name;
    int age;

    Students(String name, int age ){
        this.name = name;
        this.age=age;
    }

    @Override
    public int hashCode() {
        System.out.println("__hash__");
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("__eq__");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}

public class Test {

    public static void main(String[] args) {

       /* Students S1 = new Students("taj",21);
        Students S2 = new Students("taj",21);

        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());*/

        Map<String,Integer > HM = new HashMap<>();
        HM.put( "tajinder", 1);
        HM.put( "tajinder", 1);

        System.out.println(HM.get("tajinder"));

    }
}
