package in.co.nmsworks.exersice5;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Comparing2TableInMysql {

    public static void main(String[] args) throws Exception {

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement smt = conn.prepareStatement("select username,first_name,last_name from user_details")) {

            ResultSet userDetailsRS = smt.executeQuery();
            List<String> nameOflogin = new ArrayList<>();

            List<String[]>FirstLastnameInUsrDeatails=new ArrayList<>();


            while (userDetailsRS.next()) {
                String nameOfDetails = userDetailsRS.getString("username");
                String firstName = userDetailsRS.getString("first_name");
                String lastName = userDetailsRS.getString("last_name");

                FirstLastnameInUsrDeatails.add(new String[]{nameOfDetails, firstName, lastName});
            }
            //System.out.println(FirstLastnameInUsrDeatails);

            ResultSet loginTableRS = smt.executeQuery("select u_name from usr_login;");
            while (loginTableRS.next()) {
                String nameInLoginTable = loginTableRS.getString("u_name");
                nameOflogin.add(nameInLoginTable);

            }

            for (String nameLog : nameOflogin)
            {
                for (String [] allNames:FirstLastnameInUsrDeatails) {

                    if(nameLog.equals(allNames[0]))
                    {
                        System.out.println(allNames[1]+" "+allNames[2]);
                    }
                }
            }
            //System.out.println(nameOflogin);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
