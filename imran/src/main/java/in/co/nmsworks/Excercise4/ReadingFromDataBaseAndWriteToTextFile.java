package in.co.nmsworks.Excercise4;

import java.io.*;
import java.sql.*;


public class ReadingFromDataBaseAndWriteToTextFile {
    public static void readFileAndWrite() {
        try (FileWriter fileWriterMale = new FileWriter("/home/nmsadmin/Desktop/male.txt");
             FileWriter fileWriterFemale = new FileWriter("/home/nmsadmin/Desktop/female.txt");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/training");
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM user_details")) {

            ResultSet resultSet = stmt.executeQuery();

            fileWriterMale.write(String.format("%-20s %-20s %-20s\n", "username", "firstname", "lastname"));
            fileWriterMale.write("------------------------------------------------------------------------------\n");

            fileWriterFemale.write(String.format("%-20s %-20s %-20s\n", "username", "firstname", "lastname"));
            fileWriterFemale.write("------------------------------------------------------------------------------\n");

            while (resultSet.next())
            {
                String gender = resultSet.getString("gender");
                String username = resultSet.getString(2);
                String firstname = resultSet.getString(3);
                String lastname = resultSet.getString(4);

                if (gender.equals("Male")) {
                    fileWriterMale.write(String.format("%-20s %-20s %-20s\n", username, firstname, lastname));

                }
                else if (gender.equals("Female"))
                {
                    fileWriterFemale.write(String.format("%-20s %-20s %-20s\n", username, firstname, lastname));

                }
            }

        }
        catch (SQLException | IOException e)
        {
            e.printStackTrace();
            System.err.println("Error occured " + e);
        }
    }

    public static void main(String[] args)
    {
        readFileAndWrite();
    }
}
