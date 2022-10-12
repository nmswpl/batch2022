package in.co.nmsworks.exercise3;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDetails {
    public static void main(String[] args) {
        maleUser();
        femaleUser();
    }
    public static void maleUser(){
        File file = new File("/home/nmsadmin/Downloads/male user.csv");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             PreparedStatement st = con.prepareStatement("SELECT * FROM user_details WHERE gender = 'Male';");
             FileWriter writer = new FileWriter(file)) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String name = rs.getString("username");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String gender = rs.getString("gender");
                String password = rs.getString("password");
                String status = rs.getString("status");

                String row = id + " " + name + " " + firstName + " " + lastName + " " + gender + " " + password + " " + status;
                writer.write(row + "\n");

            }
        } catch (Exception e) {
            System.err.println("connection lost");
            e.printStackTrace();
        }

    }
    public static void femaleUser(){
        File file = new File("/home/nmsadmin/Downloads/female user.csv");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             PreparedStatement st = con.prepareStatement("SELECT * FROM user_details WHERE gender = 'Female';");
             FileWriter writer = new FileWriter(file)) {

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String name = rs.getString("username");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String gender = rs.getString("gender");
                String password = rs.getString("password");
                String status = rs.getString("status");

                String row = id + " " + name + " " + firstName + " " + lastName + " " + gender + " " + password + " " + status;
                writer.write(row + "\n");

            }
        } catch (Exception e) {
            System.err.println("connection lost");
            e.printStackTrace();
        }

    }
}
