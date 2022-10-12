package in.co.nmsworks.excercise3;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CompareWithTable {
    public static void main(String[] args) throws SQLException {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            PreparedStatement stmt1 = conn.prepareStatement("select * from user_details");
            ResultSet resultSet1 = stmt1.executeQuery();

            PreparedStatement stmt2 = conn.prepareStatement("select * from user_login");
            ResultSet resultSet2 = stmt2.executeQuery();
            List<String> unamelogin = new ArrayList<>();
            Map<String, List<String>> unamedetails = new LinkedHashMap<>();


            while(resultSet1.next())
            {
                List<String> name = new ArrayList<>();

                name.add(resultSet1.getString("first_name")+" "+resultSet1.getString("last_name"));
                unamedetails.put(resultSet1.getString("username"),name);
            }
            while(resultSet2.next())
            {
                unamelogin.add(resultSet2.getString("uname"));
            }
            System.out.println(unamedetails);
            System.out.println(unamelogin);

            for (String element : unamelogin)
            {
                if (unamedetails.containsKey(element))
                {
                    System.out.println("username of " + element + " is" + unamedetails.get(element));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}