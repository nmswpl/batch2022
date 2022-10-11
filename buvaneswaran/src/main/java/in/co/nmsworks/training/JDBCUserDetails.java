package in.co.nmsworks.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUserDetails
{
    public void select()
    {
        Connection con = null;
        PreparedStatement p = null;
        String s="";
        try(FileWriter wr=new FileWriter("/home/nmsadmin/Downloads/user_details Male.txt");
            FileWriter wr1=new FileWriter("/home/nmsadmin/Downloads/user_details Female.txt"))
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            p = con.prepareStatement("SELECT * FROM user_details");
            ResultSet resultSet=p.executeQuery();
            while(resultSet.next())
            {
                s=resultSet.getInt("user_id")+","+resultSet.getString("username")+","+resultSet.getString("first_name")+","+resultSet.getString("last_name")+","+resultSet.getString("gender")+","+resultSet.getString("password")+","+resultSet.getInt("status")+"\n";

                String[] arr=s.split(",");
                if (arr[4].equalsIgnoreCase("Male"))
                {
                    wr.write(arr[1] + "," + arr[2] + "," + arr[3] + "\n");
                }
                else
                {
                   wr1.write(arr[1] + "," + arr[2] + "," + arr[3] + "\n");
                }
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JDBCUserDetails jdbcUserDetails=new JDBCUserDetails();
        jdbcUserDetails.select();
    }
}
