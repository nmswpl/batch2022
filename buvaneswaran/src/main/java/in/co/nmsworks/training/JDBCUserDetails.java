package in.co.nmsworks.training;

import java.io.FileWriter;
import java.sql.*;


public class JDBCUserDetails {
    public void select() {
        try (FileWriter wr = new FileWriter("/home/nmsadmin/Downloads/user_details Male.txt");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             PreparedStatement p = con.prepareStatement("SELECT * FROM user_details")) {
            ResultSet resultSet = p.executeQuery();
            while (resultSet.next()) {
                int s = resultSet.getInt("user_id");
                String s1 = resultSet.getString("username");
                String s3 = resultSet.getString("first_name");
                String s4 = resultSet.getString("last_name");
                String s5 = resultSet.getString("gender");

                if (s5.equalsIgnoreCase("Male"))
                {
                    wr.write(s3 + s4);
                }
                else
                {
                    wr.write(s3 + s4);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


