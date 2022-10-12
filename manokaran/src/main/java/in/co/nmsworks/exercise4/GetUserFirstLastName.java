package in.co.nmsworks.exercise4;
// get the user first name and last name from table

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GetUserFirstLastName
{
    public static void main(String[] args) throws SQLException {
        List<String> user_name = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement stmt1 = conn.prepareStatement("select user_name from user_login");
            ResultSet u_name = stmt1.executeQuery();
            PreparedStatement stmt2 = conn.prepareStatement("select username,first_name,last_name from user_details");
            ResultSet names = stmt2.executeQuery();)
        {
            while (u_name.next())
            {
                user_name.add(u_name.getString(1));
            }
            while (names.next())
            {
                if(user_name.contains(names.getString(1)))
                {
                    System.out.println(names.getString(1)+" "+names.getString(2)+" "+names.getString(3));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
