package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;


public class SqlFileConnection {
    public static void main(String[] args) {

        SqlFileConnection.printReadFile();

    }

    public static void printReadFile() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/training");
             Statement statement = connection.createStatement()) {


            File file1 = new File("/home/nmsadmin/Desktop/male.txt");
            File file2 = new File("/home/nmsadmin/Desktop/female.txt");
            file1.createNewFile();
            file2.createNewFile();
            FileWriter fr1 = new FileWriter(file1);
            FileWriter fr2 = new FileWriter(file2);

            ResultSet result = statement.executeQuery("select username,first_name,last_name,gender from user_details");

            while (result.next()) {
                String username = result.getString("username");
                String firstname = result.getString("first_name");
                String lastname = result.getString("last_name");
                String gender = result.getString("gender");


                if (gender.equals("Male")) {
                    fr1.write(username + " " + firstname + " " + lastname + " " + gender+"\n");
//                    System.out.println(username + "" + firstname + "" + lastname + "" + gender+"\n");
                } else {
                    fr2.write(username + " " + firstname + " " + lastname + " " + gender+"\n");
//                    System.out.println(username + "" + firstname + "" + lastname + "" + gender+"\n");
                }

                fr1.flush();
                fr2.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error Obtained");
        }

    }


}
