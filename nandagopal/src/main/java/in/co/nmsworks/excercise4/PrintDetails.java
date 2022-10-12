package in.co.nmsworks.excercise4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintDetails {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training")) {
            String userNameQuery = "SELECT user_name FROM user_login";
            PreparedStatement userNameStmt = conn.prepareStatement(userNameQuery);
            ResultSet userNameSet = userNameStmt.executeQuery();

            String userDetailsQuery = "SELECT username, first_name, last_name FROM user_details";
            PreparedStatement userDetailsStmt = conn.prepareStatement(userDetailsQuery);
            ResultSet userDetailsSet = userDetailsStmt.executeQuery();

            Map<String, List<String>> userNameToFirstNameLastName = new HashMap<>();

            while(userDetailsSet.next()) {
                List<String> temp = new ArrayList<>();
                temp.add(userDetailsSet.getString(2));
                temp.add(userDetailsSet.getString(3));

                String userName = userDetailsSet.getString(1);
                userNameToFirstNameLastName.put(userName, temp);
            }

            while (userNameSet.next()) {
                String userNameInLoginTable = userNameSet.getString(1);

                if (userNameToFirstNameLastName.containsKey(userNameInLoginTable)) {
                    String firstName = userNameToFirstNameLastName.get(userNameInLoginTable).get(0);
                    String lastName = userNameToFirstNameLastName.get(userNameInLoginTable).get(1);

                    System.out.println(firstName + ", " + lastName);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
