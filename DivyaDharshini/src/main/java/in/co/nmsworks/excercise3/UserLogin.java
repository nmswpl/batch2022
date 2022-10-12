package in.co.nmsworks.excercise3;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserLogin {
    public static void main(String[] args) throws IOException, SQLException
    {
             try(
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM user_login");
            PreparedStatement stmt1=con.prepareStatement("SELECT * FROM user_details"))
             {

                 ResultSet resultSet = stmt.executeQuery();
                 ResultSet resultSet1 = stmt1.executeQuery();
                 List<String> list = new ArrayList<>();
                 while (resultSet.next()) {
                     list.add(resultSet.getString(2));
                 }
                 while (resultSet1.next())
                 {
                     String userName = resultSet1.getString(2);
                     String firstName = resultSet1.getString(3);
                     String lastName = resultSet1.getString(4);
                     if (list.contains(userName)) {
                         System.out.println(firstName + "," + lastName);
                     }
                 }
             }
    }
 }



