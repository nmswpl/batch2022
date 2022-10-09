package in.co.nmsworks.training;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class JDBCTraining {
    public static void main(String[] args) {
        PreparedStatement stm = null;
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/training");
            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"Aruniva", "BuyPaste"});
            queries.add(new String[]{"Arun", "BuySoap"});
            queries.add(new String[]{"Siva", "Go to Hospital"});
            queries.add(new String[]{"Divya", "DoHardwork"});
            queries.add(new String[]{"Karthika", "DoSleep"});
            queries.add(new String[]{"SK", "Check ur work"});
            for (int i = 0; i < queries.size(); i++) {
                stm = con.prepareStatement("insert into TodoList values(?,?,?,?)");
                stm.setInt(1, i + 1);
                stm.setString(2, queries.get(i)[0]);
                stm.setString(3, queries.get(i)[1]);
                stm.setString(4, "2022-10-06");

                stm.executeUpdate();

            }


        }
        catch (Exception e){
            System.err.println("Error in the statement");
           e.printStackTrace();
        }
finally
        {
            try
            {
                if(stm!=null)
                    stm.close();
                if(con!=null)
                    con.close();
            }
            catch(Exception e) {
                System.out.println("error");
            }
        }
        }
    }



//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/training");
//            PreparedStatement stm = con.prepareStatement("insert into TodoList Values (1,'Divya','DoHardWork','2022-10-06')");
//            stm.executeUpdate();
//            stm = con.prepareStatement("insert into TodoList Values (2,'Arun','DoSmartWork','2022-10-06')");
//            stm.executeUpdate();
//            stm = con.prepareStatement("insert into TodoList Values (3,'Siva','DoWork','2022-10-06')");
//            stm.executeUpdate();
//            stm = con.prepareStatement("insert into TodoList Values (4,'AS','DoSleep','2022-10-06')");
//            stm.executeUpdate();
//            stm = con.prepareStatement("insert into TodoList Values (5,'SK','DoEat','2022-10-06')");
//            stm.executeUpdate();


