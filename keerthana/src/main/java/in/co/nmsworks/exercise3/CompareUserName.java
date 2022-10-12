package in.co.nmsworks.exercise3;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareUserName {
    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             PreparedStatement stmt = con.prepareStatement("SELECT username FROM user_login;");
             PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM user_details;");) {

            List<String> list1 = new ArrayList<>();
            Map<String, List<String>> mapobj = new HashMap<>();

            ResultSet rs = stmt.executeQuery();

            while(rs.next())
            {
                list1.add(rs.getString("username"));
            }
            ResultSet rs2= stmt1.executeQuery();
            while(rs2.next())
           {
               List<String> list2=new ArrayList<>();
               list2.add(rs2.getString("first_name")+" , "+rs2.getString("last_name"));
               mapobj.put(rs2.getString("username"),list2);
           }
            System.out.println(list1);
            System.out.println(mapobj);

            for(String i:list1)
            {
                if(mapobj.containsKey(i))
                {
                    System.out.println(i+"  "+mapobj.get(i));
                }
            }

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
