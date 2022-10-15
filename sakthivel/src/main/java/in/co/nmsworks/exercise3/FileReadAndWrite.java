package in.co.nmsworks.exercise3;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FileReadAndWrite {
    public static void main(String[] args) {


        File male = new File("/home/nmsadmin/Downloads/Male.txt");
        File female = new File("/home/nmsadmin/Downloads/FeMale.txt");

        try (
            FileWriter writer = new FileWriter("/home/nmsadmin/Downloads/Male.txt");
             FileWriter writer1 = new FileWriter("/home/nmsadmin/Downloads/FeMale.txt");
            Connection cont = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
            PreparedStatement stmt = cont.prepareStatement("select username,first_name,last_name,gender from user_details"))
        {


            male.createNewFile();
            female.createNewFile();


            ResultSet data= stmt.executeQuery();

            while (data.next())
            {
                String username = data.getString("username");
                String firstname = data.getString("first_name");
                String lastname = data.getString("last_name");
                String gender = data.getString("gender");
                if (gender.equals("Male"))
                {
                    writer.write(username+"     " + firstname+"     " + lastname+"\n");

                }
                if (gender.equals("Female"))
                {
                    writer1.write(username+"        "  + firstname+"   "  + lastname+"\n");

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error Occured");

        }


    }
}
