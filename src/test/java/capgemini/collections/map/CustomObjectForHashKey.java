package capgemini.collections.map;

import java.util.Objects;

public class CustomObjectForHashKey {
    private String name;
    private int id;
    private String department;

    @Override
    public int hashCode() {

        int hash = Objects.hash(name, id, department); //Use Objects.hash() (Simple and Clean)

            hash = hashCodeManual(); // same logic like Objects.hash() (Manual, Faster)


        return hash;
    }

    private int defaultObjectsHashMethod(){
        return Objects.hash(name, id, department); //Use Objects.hash() (Simple and Clean)
    }


    public int hashCodeManual() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (department == null ? 0 : department.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomObjectForHashKey other = (CustomObjectForHashKey) obj;
        return id == other.id &&
                Objects.equals(name, other.name) &&
                Objects.equals(department, other.department);
    }
}
