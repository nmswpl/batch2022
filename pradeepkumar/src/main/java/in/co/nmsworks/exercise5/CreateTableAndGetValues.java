package in.co.nmsworks.exercise5;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateTableAndGetValues {
    public static void main(String[] args) throws SQLException {
       try(Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/Training");
        PreparedStatement statement= conn.prepareStatement("select username from user_login");
        PreparedStatement stmt= conn.prepareStatement("select username,first_name,last_name from user_details"))
       {
           ResultSet result=stmt.executeQuery();
           System.out.println(result);

           ResultSet rs=statement.executeQuery();
           System.out.println(rs);


           System.out.println("connection is obtained");
           List<String>list=new ArrayList<>();
           Map<String,String>map=new HashMap<>();

           while (rs.next())
           {
               String username=rs.getString("userName");
               list.add(username);
//               System.out.println(username);
           }
           while (result.next())
           {
               String username=result.getString(1);
               String firstname= result.getString(2);
               String lastname= result.getString(3);
//               System.out.println(username + "|" + firstname + "|" +lastname);

               map.put(username,firstname+"|" +lastname);
//               System.out.println(map);
           }
           for (String s : list) {
               if (map.containsKey(s)) {
                   System.out.println(map.get(s));
               }


           }
       }

       catch (Exception e)
       {
           e.printStackTrace();
           System.out.println("connection is not obtained");
       }

    }
}
