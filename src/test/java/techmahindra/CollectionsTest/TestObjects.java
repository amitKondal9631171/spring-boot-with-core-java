package techmahindra.CollectionsTest;

/**
 * Created by HP-USER on 28-11-2018.
 */
public class TestObjects {
    String name;
    String classs;
    String type;
    String village;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public boolean isRealName(){
        return true;
    }

    public boolean isRealName(TestObjects testObjects) {
        if(testObjects.getName().equals("Amit"))
            return true;
        else
            return false;
    }
}
