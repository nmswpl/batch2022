package in.co.nmsworks.excercise3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserLogin {
    public static void main(String[] args)
    {
        String queries="SELECT * FROM user_login";
        String queries1="SELECT * FROM user_details";
        String jdbcPath="jdbc:mysql://localhost/Training";
        UserLogin.createAndInsertValues(jdbcPath,queries,queries1);
    }
    public static void createAndInsertValues(String jdbcPath,String queries,String queries1)
    {
        List<String> loginList=new ArrayList<>();

        try(Connection con= DriverManager.getConnection(jdbcPath);
            Statement stmt= con.createStatement())
            {
                ResultSet resultSet= stmt.executeQuery(queries);
                while (resultSet.next())
                {
                    loginList.add(resultSet.getString(2));
                }

                ResultSet resultSet1= stmt.executeQuery(queries1);

                while (resultSet1.next())
                {
                    if (loginList.contains(resultSet1.getString(2)))
                    {
                         System.out.println(resultSet1.getString(3)+" | "+resultSet1.getString(4)+"\n");
                    }
                }
            }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println("Wrong Database Path");
        }

    }
}
