package in.co.nmsworks.exercise3;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class JDBCFileReader {

    public static void reader() {

        File male = new File("/home/nmsadmin/Documents/Male_User.txt");
        File female= new File("/home/nmsadmin/Documents/Female_User.txt");
        try (Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
             Statement stmt = connect.createStatement();
             FileWriter fileWriterMale = new FileWriter(male);
             FileWriter fileWriterFemale = new FileWriter(female);
        )
        {
            male.createNewFile();
            female.createNewFile();
            ResultSet result= stmt.executeQuery("Select user_id,username,first_name,last_name,gender,password,status from user_details");
            while(result.next())
            {
                int userId = result.getInt("user_id");
                String username = result.getString("username");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                String gender = result.getString("gender");
                String password = result.getString("password");
                String status = result.getString("status");

                //fileWriter.write(userId+ "      " +username+ "      " +firstName+ "     "+lastName+ "       "+gender+"      "+password+"        "+status +'\n');

                if (gender.equals("Male"))
                    fileWriterMale.write("  " +userId+ "      "+firstName + "      " + lastName +'\n');
                else
                    fileWriterFemale.write("  " +userId+ "      "+firstName+ "     " +lastName +'\n');
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
