package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCFor {

    public static void main(String[] args) throws SQLException {

        PreparedStatement ps=null;

        Connection c=null;

        List<String[]> query=new ArrayList<>();
        try {


            c = DriverManager.getConnection("jdbc:mysql://localhost/Training");


            query.add(new String[]{"Thamizh", "Reading java","2022-10-05"});
            query.add(new String[]{"Sakthi", "Reading sql","2022-10-05"});
            query.add(new String[]{"Deepan", "Reading js","2022-10-05"});
            query.add(new String[]{"Praveen", "Reading oracle","2022-10-05"});
            query.add(new String[]{"Saravanan", "Reading C","2022-10-05"});
            query.add(new String[]{"Arun", "Reading novel","2022-10-05"});
            query.add(new String[]{"Siva", "Reading jquery","2022-10-05"});
            query.add(new String[]{"vijay", "Reading BootStrap","2022-10-05"});
            query.add(new String[]{"karthi", "Reading Python","2022-10-05"});
            query.add(new String[]{"Sarathi", "Reading books","2022-10-05"});

            for (int i = 0; i < query.size(); i++) {
                 ps = c.prepareStatement("insert into TodoLiSt values(?,?,?,?)");
                ps.setInt(1,i+1);
                ps.setString(2,query.get(i)[0]);
                ps.setString(3,query.get(i)[1]);

                //ps.setDate(new Date(System.);
                ps.setString(4,query.get(i)[2]);

                ps.executeUpdate();

            }
        }
        catch (Exception e)
        {
            System.err.println("error occurred");
            e.printStackTrace();
        }
        finally {
            if(ps!=null) {
                ps.close();
            }
            if(c!=null) {
             c.close();
            }
        }
    }
}
