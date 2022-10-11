package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTraining
{
    public static void main(String[] args)
    {
        Connection con = null;
        PreparedStatement stmt = null;
        try
        {
             con = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"Abi","study python","2022-10-21"});
            queries.add(new String[]{"Aashika"," study java","2022-10-22"});
            queries.add(new String[]{"'tamizhini","work","2022-10-23"});
            queries.add(new String[]{"harshitha","washing","2022-10-24"});
            queries.add(new String[]{"Illakiya","washing","2022-10-24"});
            queries.add(new String[]{"Madhu","washing","2022-10-24"});
            queries.add(new String[]{"Elakiya","washing","2022-10-24"});
            queries.add(new String[]{"luba","writing","2022-10-24"});
            queries.add(new String[]{"rahul","doing projects","2022-10-24"});
            queries.add(new String[]{"harish","studying","2022-10-24"});

            stmt = con.prepareStatement("INSERT INTO TodoList  values(? ,?, ? ,?) ");
            for (int i = 0; i < queries.size(); i++)
            {
                stmt.setInt(1, i + 1);
                stmt.setString(2, queries.get(i)[0]);
                stmt.setString(3, queries.get(i)[1]);
                stmt.setString(4, queries.get(i)[2]);
                stmt.executeUpdate();
            }




            /*stmt=con.prepareStatement("INSERT INTO TodoList (sno,uname,descr,addedDate)values(2,'Abi','study python','2022-10-21')");
            stmt.executeUpdate();

            stmt=con.prepareStatement("INSERT INTO TodoList (sno,uname,descr,addedDate)values(3,'Aashika',' study java','2022-10-22')");
            stmt.executeUpdate();

            stmt=con.prepareStatement("INSERT INTO TodoList (sno,uname,descr,addedDate)values(4,'tamizhini','work','2022-10-23')");
            stmt.executeUpdate();

            stmt=con.prepareStatement("INSERT INTO TodoList (sno,uname,descr,addedDate)values(5,'harshitha','washing','2022-10-24')");
            stmt.executeUpdate();*/

           /* String [] array={"INSERT INTO TodoList (sno,uname,descr,addedDate)values(1,'Narmada','Homework','2022-10-20')",
                    "INSERT INTO TodoList (sno,uname,descr,addedDate)values (2,'Abi','study python','2022-10-21')",
                    "INSERT INTO TodoList (sno,uname,descr,addedDate)values(3,'Aashika',' study java','2022-10-22')",
                    "INSERT INTO TodoList (sno,uname,descr,addedDate)values(4,'Tamizhini','work','2022-10-23')",
                    "INSERT INTO TodoList (sno,uname,descr,addedDate)values(5,'Harshitha','washing','2022-10-24')"};
            for(String queries:array)
            {
                PreparedStatement stmt=con.prepareStatement(queries);
                stmt.executeUpdate();
            }




            */
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println("connection cannot obtained");
        }
        finally
        {
            if(stmt !=null)
            {
            try {
                stmt.close();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
            }
            if(con!=null)
            {
                try {
                    con.close();
                }
                catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
