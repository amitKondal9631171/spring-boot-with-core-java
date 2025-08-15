package techmahindra.jdbc;
import java.sql.*;
/**
 * Created by HP-USER on 02-02-2019.
 */
public class OracleConnection {

    /**
     * Statement: use to execute static SQLs Testing Conflicts
     *              used for DDL
     * PreparedStatement: use to execute dynamic statements
     *                      It is precompiled
     *                      It is efficient as it is precompiled.
     *                      Used for DML
     *
     * @param args
     */

    public static void main(String args[]){
        try{
//step1 load the driver class
           Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
            Connection con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","system","fintek123");

//step3 create the statement object
            Statement stmt=con.createStatement();

            PreparedStatement pstmt = con.prepareStatement("");
            
            //step4 execute query
            ResultSet rs=stmt.executeQuery("select * from emp");

            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//step5 close the connection object
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
}
