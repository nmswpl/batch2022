package in.co.nmsworks.training;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class JDBCConnect {

    public static void main(String[] args) {
        Connection con=null;
        PreparedStatement ps=null;
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/Training");
            List<String[]> query = new ArrayList<>();
            query.add(new String[]{"Vijayvarsan","Buying cloths","2022-07-08 15:33:00"});
            query.add(new String[]{"VIART","Buying bat","2022-07-08 05:12:33"});
            query.add(new String[]{"DOHNI","Buying GLOVES","2022-07-08 04:33:00"});
            query.add(new String[]{"MESSI","WASHING DRESS","2022-07-08 06:33:00"});
            query.add(new String[]{"RAINA","PRACTICING","2022-07-08 01:33:00"});
            query.add(new String[]{"SURYA","INNOVATIVE","2022-07-08 24:33:00"});
            query.add(new String[]{"BHUVI","USE THE WIND","2022-07-08 11:33:00"});
            query.add(new String[]{"DRAVID","COACHING","2022-07-08 09:33:00"});
            query.add(new String[]{"NEYMAR","SKILLS","2022-07-08 19:33:00"});
            query.add(new String[]{"RONALDO","PLAY SOME OTHER GAMES","2022-07-08 02:22:00"});
           ps = con.prepareStatement("insert into Todo_List values(?,?,?,?)");


            System.out.println("qury size"+query.size());
           for (int i= 0 ; i< query.size();i++) {
               ps.setInt(1, i+1);
               ps.setString(2, query.get(i)[0]);
               ps.setString(3, query.get(i)[1]);
               ps.setString(4, query.get(i)[2]);
               ps.executeUpdate();
           }

        } catch (SQLException e) {
            System.err.println("NOT CONNECTED");
            e.printStackTrace();
        }
        finally {
            try{
            if(ps!=null)
                ps.close();
            if(con!=null)
                con.close();
            }
            catch (Exception e)
            {
                System.err.println("Exception");
            }
        }
    }
}