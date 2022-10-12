package in.co.nmsworks.exercise3;
import java.sql.*;
import java.util.*;

public class UserLogin {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement st = con.prepareStatement("SELECT USERNAME FROM user_login");
            PreparedStatement st1 = con.prepareStatement("SELECT username,first_name,last_name FROM user_details"))
        {
            ResultSet rs = st.executeQuery();
            ResultSet rs1 = st1.executeQuery();
            ArrayList<String> list = new ArrayList<>();
            Map<String, List<String>> map = new HashMap<>();
            while (rs.next()) {
                String nameFromUserLogin = rs.getString("USERNAME");
                list.add(nameFromUserLogin);
            }
            while (rs1.next()) {
                String nameFromUserDetail = rs1.getString("username");
                ArrayList<String> mapValuelist = new ArrayList<>();
                String firstName = rs1.getString("first_name");
                String lastName = rs1.getString("last_name");
                String row = firstName + " " + lastName;
                mapValuelist.add(row);
                map.put(nameFromUserDetail, mapValuelist);
            }

            for (String s : list) {
                for (String s1 : map.keySet()) {
                    if (s1.contains(s)) {
                        System.out.println(map.get(s1));
                    }
                }
            }

        } catch (SQLException e) {
            System.err.print("Exception");
            e.printStackTrace();
        }
    }
}


//            queries.add(new String[]{"rogers63", "2022-10-06 04:35:09" });
//            queries.add(new String[]{"mike28", "2022-10-06 04:36:09" });
//            queries.add(new String[]{"rivera92","2022-10-06 04:41:09" });
//            queries.add(new String[]{"ross95",  "2022-10-06 04:38:09" });
//            queries.add(new String[]{"paul85",  "2022-10-06 04:39:09" });
//            queries.add(new String[]{"smith34", "2022-10-06 04:37:09" });
//            queries.add(new String[]{"james84", "2022-10-06 04:43:09" });
//            queries.add(new String[]{"daniel53", "2022-10-06 04:45:09" });
//            queries.add(new String[]{"brooks80", "2022-10-06 04:47:09" });
//            queries.add(new String[]{"morgan65", "2022-10-06 04:49:09" });
