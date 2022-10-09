package in.co.nmsworks.training;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class JDBCConnect {

    public static void main(String[] args) {


        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localost/Training");

            PreparedStatement ps = con.prepareStatement("insert into Todo_List values(?,?,?,?);");

            List<String[]> query = new ArrayList<>();
            query.add(new String[]{"Vijayvarsan","Buying cloths","'2022-07-08 15:33:00'"});
            query.add(new String[]{"VIART","Buying bat","'2022-07-08'"});
            query.add(new String[]{"DOHNI","Buying GLOVES","'2022-07-08 04:33:00'"});
            query.add(new String[]{"MESSI","WASHING DRESS","'2022-07-08 06:33:00'"});
            query.add(new String[]{"RAINA","PRACTICING","'2022-07-08 01:33:00'"});
            query.add(new String[]{"SURYA","INNOVATIVE","'2022-07-08 124:33:00'"});
            query.add(new String[]{"BHUVI","USE THE WIND","'2022-07-08 11:33:00'"});
            query.add(new String[]{"DRAVID","COACHING","'2022-07-08 09:33:00'"});
            query.add(new String[]{"NEYMAR","SKILLS","'2022-07-08 19:33:00'"});
            query.add(new String[]{"RONALDO","PLAY SOME OTHER GAMES","2022-07-08 02:22:00"});


           for (int i= 0 ; i<10;i++) {
               ps.setInt(1, i);
               ps.setString(2, query.get(i)[0]);
               ps.setString(3, query.get(i)[1]);
               ps.setDate(4, Date.valueOf(query.get(i)[2]));

               ps.executeUpdate();
           }

        } catch (SQLException e) {
            System.err.println("NOT CONNECTED");
            e.printStackTrace();
        }
    }
}