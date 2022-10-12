package in.co.nmsworks.Training;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginFile
{
    public static void main (String[] args) throws SQLException {


           Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Training");

           String userNameQuery = "SELECT username FROM user_login";
           PreparedStatement userNameStmt = con.prepareStatement(userNameQuery);
           ResultSet userNameSet = userNameStmt.executeQuery();


           String userDetailsQuery = "SELECT username, first_name, last_name FROM user_details";
           PreparedStatement userDetailsStmt = con.prepareStatement(userDetailsQuery);
           ResultSet userDetails = userDetailsStmt.executeQuery();

           Map<String, List<String>> usernameMap = new HashMap<>();

           while(userDetails.next())
           {
               List<String> list = new ArrayList<>();
               list.add(userDetails.getString(2));
               list.add(userDetails.getString(3));

               String userName = userDetails.getString(1);
               usernameMap.put(userName, list);
           }

           while (userNameSet.next())
           {
               String userNameInLoginTable = userNameSet.getString(1);

               if (usernameMap.containsKey(userNameInLoginTable))
               {
                   String firstName = usernameMap.get(userNameInLoginTable).get(0);
                   String lastName = usernameMap.get(userNameInLoginTable).get(1);
                   System.out.println(firstName + ", " + lastName);
               }
           }
        }
    }


