package techmahindra.Java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by vkondal on 8/11/2020.
 */
public class StreamFunctions {

    private static void filterItemFromList(List<Hosting> hostingList){

        List<Hosting>  sortedHostingList = hostingList.stream().filter(item -> item.getWebsites() >= 85000).collect(Collectors.toList());

        sortedHostingList.forEach( item -> System.out.println("Host Name:"+ item.getName() +", Host count:"+item.getWebsites()));
    }

    private static void listToMap(List<Hosting> hostingList){

        //using default comparator
        Map<Integer, Hosting>  listToMap = hostingList.stream().collect(Collectors.toMap(Hosting::getId, hosting -> hosting));
        listToMap.forEach((K,V)-> System.out.println("Host Name:"+K + ", Host Count: " + V.getWebsites()));

    }
    private static void sortList(List<Hosting> hostingList){

        Comparator<Hosting> hostingComparator = (obj1,obj2)->{
            return  (int) (obj1.getWebsites() - obj2.getWebsites());
        };

        //using default comparator
       List<Hosting>  sortedHostingList = hostingList.stream().sorted(Comparator.comparingLong(Hosting::getWebsites).reversed()).collect(Collectors.toList());

        /**
         * passing custom comparator
         * List<Hosting>  sortedHostingList = hostingList.stream().sorted(hostingComparator.reversed()).collect(Collectors.toList());
         */

        sortedHostingList.forEach( item -> System.out.println("Host Name:"+ item.getName() +", Host count:"+item.getWebsites()));
    }

    private static void sortListToMap(List<Hosting> hostingList){
        //example 1
        Map result1 = hostingList.stream()
                .sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
                .collect(
                        Collectors.toMap(
                                Hosting::getName, Hosting::getWebsites, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        result1.forEach((k,v)-> System.out.println("Key: "+ k + ", value:"+v));
    }


    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        list.add(new Hosting(6, "linode.com", 100000));

        //filterItemFromList(list);
        listToMap(list);
        //sortListToMap(list);
        //sortList(list);
    }
}


class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWebsites() {
        return websites;
    }

    public void setWebsites(long websites) {
        this.websites = websites;
    }
}