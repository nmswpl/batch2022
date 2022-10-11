package in.co.nmsworks.exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;


public class UserDetails {
    public static void main(String[] args)
    {

        File file1 = new File("/home/nmsadmin/female.txt");
        File file2 = new File("/home/nmsadmin/male.txt");
        try(Connection con = DriverManager.getConnection("JDBC:mysql://localhost/Training");
            PreparedStatement  stmt1 = con.prepareStatement("select user_id,username,first_name,last_name from user_details where gender = 'female';");
            PreparedStatement  stmt2 = con.prepareStatement("select user_id,username,first_name,last_name from user_details where gender = 'male';"))
            {
                UserDetails.listGeneration(file1,stmt1);
                UserDetails.listGeneration(file2,stmt2);
            }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void listGeneration(File file, PreparedStatement statement)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file)))
        {
            String colunm ;
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
            {
                colunm=resultSet.getString(1)+ "  |  " +resultSet.getString(2)+ "  |  " +resultSet.getString(3)+ "  |  " +resultSet.getString(4)+ "\n";
                bw.write(colunm);
            }
        }
        catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}