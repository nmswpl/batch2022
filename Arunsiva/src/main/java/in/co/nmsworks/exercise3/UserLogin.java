package in.co.nmsworks.exercise3;
import java.sql.*;
import java.util.*;

public class UserLogin {
    public static void main(String[] args) throws Exception {
        List<String> listlogin = new ArrayList<>();
        Map<String, List<String>> maplist = new HashMap<>();

        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/training");
                PreparedStatement stm1 = con.prepareStatement("Select * from user_details");
                PreparedStatement stm2 = con.prepareStatement("Select * from user_login")) {

            ResultSet detailslist = stm1.executeQuery();
            ResultSet loginlist = stm2.executeQuery();

            while (loginlist.next()) {
                String username = loginlist.getString("UName");
                listlogin.add(username);

            }
            while (detailslist.next()) {
                String username = detailslist.getString("username");
                String firstname = detailslist.getString("first_name");
                String lastname = detailslist.getString("last_name");
                List<String> listmap = new ArrayList<>();
                listmap.add(firstname);
                listmap.add(lastname);
                maplist.put(username, listmap);
            }
            for (int i = 0; i < listlogin.size(); i++)
            {

                if (maplist.containsKey(listlogin.get(i))) {
                    System.out.println(maplist.get(listlogin.get(i)));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}


