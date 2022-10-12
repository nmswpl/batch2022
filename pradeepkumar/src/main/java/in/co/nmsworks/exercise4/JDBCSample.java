package in.co.nmsworks.exercise4;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class JDBCSample {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement statement=conn.prepareStatement("select * from user_details");
        FileWriter maleDetails=new FileWriter("/home/nmsadmin/Desktop/male.txt");
        FileWriter femaleDetails=new FileWriter("/home/nmsadmin/Desktop/female.txt"))

        {
            ResultSet result=statement.executeQuery();
            System.out.println(result);
            System.out.println("connection obtained");
            while (result.next())
            {
                String userName= result.getString("username");
                String firstName= result.getString("first_name");
                String lastName= result.getString("last_name");
                String gender= result.getString("gender");
                if (gender.equalsIgnoreCase("female"))
                {
                    femaleDetails.write(userName+"|"+firstName + "|" + lastName + "|" +"\n");

                }
                else {
                    maleDetails.write(userName+"|"+firstName + "|" + lastName + "|"+"\n");
                }
            }


        }
        catch (SQLException | IOException e) {
            System.out.println("connection is not obtained");
            throw new RuntimeException(e);
        }

    }
}
