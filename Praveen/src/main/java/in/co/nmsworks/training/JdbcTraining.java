package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcTraining {


    public static void main(String[] args) {

        Connection connect = null;
        PreparedStatement stmt = null;
        try {
            connect=DriverManager.getConnection("jdbc:mysql://127.0.0.1/training");
            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"Praveen", "Read Sql","2022-10-06 7:00:00"});
            queries.add(new String[]{"Naveen", "Read Java","2022-10-07 7:00:00"});
            queries.add(new String[]{"Sakthi", "Read Js","2022-10-08 7:00:00"});
            queries.add(new String[]{"Sridhar", "Read Linux","2022-10-09 7:00:00"});
            stmt = connect.prepareStatement("insert into TodoList values (?,?,?,?)");
            System.out.println(queries.size());
            for (int i = 0; i < queries.size(); i++) {

                stmt.setInt(1, i+1);
                stmt.setString(2, queries.get(i)[0]);
                stmt.setString(3, queries.get(i)[1]);
                stmt.setString(4, queries.get(i)[2]);
                stmt.executeUpdate();
            }

        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        } finally {

            try {
            if (connect != null) {
                connect.close();
            }
            if (stmt != null) {
                stmt.close();
            }

        }
            catch (Exception e)
            {
                System.err.println("error");
            }
    }
}
}

