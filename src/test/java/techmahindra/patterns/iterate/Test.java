package techmahindra.patterns.iterate;



public class Test {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        Iterator itr = namesRepository.getIterator();
        itr.add("Amit");
        itr.add("Vikas");
        itr.add("Pawan");
        itr.remove("Julie");
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

    }
}
