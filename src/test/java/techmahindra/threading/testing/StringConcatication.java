package techmahindra.threading.testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 8/4/2020.
 */
public class StringConcatication {

    public static void main(String[] args) {

        List<String> ids = new ArrayList<>();
        ids.add("1000");
        ids.add("1001");
        ids.add("1002");
        ids.add("1003");
        ids.add("");

        Iterator<String> itr = ids.iterator();
        String departmentIds = "";
        while(itr.hasNext())
        {
            String clientDepartment  = itr.next();
            if(itr.hasNext())// check if it's last record
            {
                departmentIds = departmentIds+"'"+clientDepartment+"'"+",";
            }
            else
            {
                departmentIds = departmentIds+"'"+clientDepartment+"'";
            }
        }
        departmentIds = departmentIds+" )" ;
        System.out.println(departmentIds);
    }

}
