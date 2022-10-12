package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUserLogin
{
    public void select1()
    {
        List<String> unameFromUserLogin=new ArrayList<>();
        Map<String,List<String>> userDetails=new HashMap<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             PreparedStatement p = con.prepareStatement("SELECT * FROM User_login");
             PreparedStatement p1 = con.prepareStatement("SELECT * FROM user_details"))
        {
            ResultSet resultSet = p.executeQuery();
            while (resultSet.next())
            {
                unameFromUserLogin.add(resultSet.getString("uname"));

                ResultSet resultSet1 = p1.executeQuery();
                while (resultSet1.next())
                {
                    String uDetails = resultSet1.getString("username");
                    String s3 = resultSet1.getString("first_name") + "," + resultSet1.getString("last_name");
                    for (String userNameCheck : unameFromUserLogin)
                    {
                        if (userNameCheck.equals(uDetails))
                        {
                            List<String> list=new ArrayList<>();
                            list.add(s3);
                            userDetails.put(uDetails,list);
                        }
                    }
                }
            }
            System.out.println(userDetails);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
        public static void main(String[] args)
        {
            JDBCUserLogin jdbcUserLogin=new JDBCUserLogin();
            jdbcUserLogin.select1();
        }
    }


