package in.co.nmsworks.excercise3;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class FileWrite {
    public static void main(String[] args) {
        readAndWrite();
    }
    public static void readAndWrite()
    {
        try(FileWriter fileWriterMale = new FileWriter("/home/nmsadmin/Desktop/male.txt");
            FileWriter fileWriterFemale = new FileWriter("/home/nmsadmin/Desktop/female.txt");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM user_details")) {

            ResultSet resultSet=stmt.executeQuery();

            fileWriterMale.write("username"+"\t");
            fileWriterMale.write("firstname"+"\t");
            fileWriterMale.write("lastname"+"\t"+"\n");

            fileWriterFemale.write("username"+"\t");
            fileWriterFemale.write("firstname"+"\t");
            fileWriterFemale.write("lastname"+"\t"+"\n");



            while (resultSet.next())
            {

                    String gender = resultSet.getString("gender");
                    String username = resultSet.getString(2);
                    String firstname = resultSet.getString(3);
                    String lastname = resultSet.getString(4);

                    if (gender.equals("Male")) {
                        fileWriterMale.write(username+"\t");
                        fileWriterMale.write(firstname+"\t");
                        fileWriterMale.write(lastname+"\t"+"\n");


                    }
                    else if (gender.equals("Female"))
                    {
                        fileWriterFemale.write(username+"\t");
                        fileWriterFemale.write(firstname+"\t");
                        fileWriterFemale.write(lastname+"\t"+"\n");

                    }
            }

        }
        catch (SQLException | IOException e){
            e.printStackTrace();
            System.out.println("Error");
        }

        }
    }





