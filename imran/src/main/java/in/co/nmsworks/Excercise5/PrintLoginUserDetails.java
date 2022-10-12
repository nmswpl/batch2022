package in.co.nmsworks.Excercise5;

import java.sql.*;
import java.util.*;

public class PrintLoginUserDetails {
    public static void printLoggedInUserDetails() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/training");
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM USER_LOGIN");
             PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM user_details"))
        {
            List<String> loggedInUserNames = new ArrayList<>();

            ResultSet userLoginRS = stmt.executeQuery();
            while (userLoginRS.next()) {
                loggedInUserNames.add(userLoginRS.getString(2));
            }

            ResultSet userDetailsRS = stmt1.executeQuery();
            while (userDetailsRS.next()) {
                String userName = userDetailsRS.getString(2);
                String firstName = userDetailsRS.getString(3);
                String lastName = userDetailsRS.getString(4);
                if (loggedInUserNames.contains(userName)) {
                    System.out.println(firstName + "\t\t" + lastName);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error occures");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        printLoggedInUserDetails();
    }
}
