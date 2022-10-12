package in.co.nmsworks.training;

import java.io.*;
import java.sql.*;

public class SampleUserList {

    public static void main(String[] args) throws  IOException
    {
        File file1 = new File("/home/nmsadmin/Downloads/male.txt");
        File file2 = new File("/home/nmsadmin/Downloads/female.txt");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             Statement stmt = con.createStatement();


             FileWriter write = new FileWriter(file1);
             FileWriter write1 = new FileWriter(file2))

              {
                  file1.createNewFile();
                  file2.createNewFile();

                  ResultSet set = stmt.executeQuery("select username,first_name,last_name,gender from user_details");
                  while (set.next()) {


                String username = set.getString("Username");
                String firstname = set.getString("first_name");
                String lastname = set.getString("last_name");
                String gender = set.getString("gender");

                if (gender.equals("Male")) {
                    write.write(username + " " + firstname + " " + lastname + " " + gender + "\n");

                }
                if(gender.equals("Female"))
                {
                    write1.write(username + " " + firstname + " " + lastname + " " + gender + "\n");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


