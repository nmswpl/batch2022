package in.co.nmsworks.exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class ReadingDataFromDataBaseAndWriteIntoTextFile{
    public static void main(String[] args) {

        File fileWriterMale = new File("/home/nmsadmin/Downloads/Male.txt");
        File fileWriterFemale = new File("/home/nmsadmin/Downloads/Female.txt");
        try (

            BufferedWriter br = new BufferedWriter(new FileWriter(fileWriterMale));
            BufferedWriter br2 = new BufferedWriter(new FileWriter(fileWriterFemale));

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement stmt = con.prepareStatement("select * from user_details;");)
            {
            ResultSet resultSet = stmt.executeQuery();


            while (resultSet.next()) {
                if (resultSet.getString(5).equals("Male")) {
                    String answer = (resultSet.getString(2) +"      "+ resultSet.getString(3) + "      "+resultSet.getString(4)+"\n");
                    br.write(answer);
                } else if (resultSet.getString(5).equals("Female")) {
                    String answer1 = (resultSet.getString(2) +"      "+ resultSet.getString(3) +"      "+ resultSet.getString(4)+"\n");
                    br2.write(answer1);
                }
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);

        }
    }
}

