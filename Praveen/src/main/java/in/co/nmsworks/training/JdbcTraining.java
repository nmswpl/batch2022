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
            queries.add(new String[]{"", "",""});
            queries.add(new String[]{"", "",""});
            queries.add(new String[]{"", "",""});
            queries.add(new String[]{"", "",""});

            for (int i = 0; i < queries.size(); i++) {
                stmt = connect.prepareStatement("insert into TodoList values (?,?,?,?)");
                stmt.setInt(0, i+1);
                stmt.setString(1, queries.get(i)[0]);
                stmt.setString(2, queries.get(i)[1]);
                stmt.setString(3, queries.get(i)[2]);

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
                System.out.println("error");
            }
    }
}
}

