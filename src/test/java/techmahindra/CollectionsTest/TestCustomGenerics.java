package techmahindra.CollectionsTest;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Country{

}

class Office extends Country{

    String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}

class Company extends Office{

}

class Employee extends Company{

}

public class TestCustomGenerics {

    public static void main(String[] args) {

        List<? extends Number> numberBound = new ArrayList<>();

        List<? extends Country> upperBound = new ArrayList<>();

        Country country = new Country();


        List<? super Company> lowerBound = new ArrayList<>();
        Employee employee = new Employee();
        Office office = new Office();
        lowerBound.add(employee);

    }
}
