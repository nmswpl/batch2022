package in.co.nmsworks.excercise3;

import java.sql.*;

public class LogintimeJDBC {
    public static void main(String[] args) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession")) {
            PreparedStatement stm = con.prepareStatement("select first_name,last_name from user_details where exists ( select username  from user_login  where user_login.username = user_details.userName) ;");

            ResultSet resultSet = stm.executeQuery();
            String line = "";
            while (resultSet.next()) {
                line += resultSet.getString("first_name");
                line += resultSet.getString("last_name");
                line += "\n";

            }
            System.out.println(line);

        }
    }
}
