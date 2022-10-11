package in.co.nmsworks.excercise3;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class FileReadingAndWriting {
    public static void main(String[] args) throws SQLException, IOException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");

        PreparedStatement stmt = conn.prepareStatement("select * from user_details;");
        ResultSet resultSet = stmt.executeQuery();

            File file1 = new File("/home/nmsadmin/Downloads/Male.txt");
            File file2 = new File("/home/nmsadmin/Downloads/FeMale.txt");

       try  (  FileWriter fileWriterMale = new FileWriter(file1);
               FileWriter fileWriterFemale = new FileWriter(file2))
       {


           while (resultSet.next())
           {
                String gender = resultSet.getString("gender");
                String userid = resultSet.getString(1);
                String firstname = resultSet.getString(3);
                String lastname = resultSet.getString(4);

                if (gender.equals("Male")) {
                    fileWriterMale.write(String.format(userid+" "+firstname+" "+lastname+"\n"));


                }
                else if(gender.equals("Female"))
                {
                    fileWriterFemale.write(String.format(userid+" "+firstname+" "+lastname));
                    fileWriterFemale.write("\n");
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}