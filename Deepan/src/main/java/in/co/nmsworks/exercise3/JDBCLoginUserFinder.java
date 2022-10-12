package in.co.nmsworks.exercise3;

import in.co.nmsworks.training.TodoList;

import java.awt.geom.RectangularShape;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class JDBCLoginUserFinder {

    public static void reader()
    {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
            Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
            Statement stmt = connection.createStatement();
            Statement stmt1 = connect.createStatement()
        )
        {
            //ResultSet
            ResultSet userSet = stmt1.executeQuery("select username from User_login");
            ResultSet totalUserSet=stmt.executeQuery("select username,first_name,last_name from user_details");

            //Storing username in a List
            List<String> userNameList = new ArrayList<>();

            while(userSet.next())
            {
                userNameList.add(userSet.getString("username"));
            }

            while(totalUserSet.next())
            {
                if (userNameList.contains(totalUserSet.getString("username")))
                {
                    System.out.println("First Name: "+totalUserSet.getString("first_name") + "      "+"Last Name: "+totalUserSet.getString("last_name"));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reader();
    }
}
