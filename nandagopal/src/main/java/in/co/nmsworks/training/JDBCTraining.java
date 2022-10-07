package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDBCTraining {
    public static void main( String[] args) {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            List<List<String>>todos = new ArrayList<>();
            todos.add(Arrays.asList("1", "nandagopal", "watch anime", "2022-10-06 20:00:00"));
            todos.add(Arrays.asList("2", "nandagopal", "do java programs", "2022-10-06 20:10:00"));
            todos.add(Arrays.asList("3", "nandagopal", "study jdbc", "2022-10-06 20:20:00"));
            todos.add(Arrays.asList("4", "nandagopal", "eat", "2022-10-06 20:30:00"));
            todos.add(Arrays.asList("5", "nandagopal", "sleep", "2022-10-06 20:40:00"));


            String query = "INSERT INTO TodoList VALUES ( ? , ? , ? , ? )";
            statement = conn.prepareStatement(query);

            for(List<String> todo : todos) {
                statement.setInt(1, Integer.parseInt(todo.get(0)));
                statement.setString(2, todo.get(1));
                statement.setString(3, todo.get(2));
                statement.setString(4, todo.get(3));

                statement.executeUpdate();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(statement != null) {
                try {
                    statement.close();
                }
                catch (Exception e) {
                    System.err.println("prepared statement not closed");
                }
            }

            if(conn != null) {
                try {
                    conn.close();
                }
                catch (Exception e) {
                    System.err.println("jdbc connection not closed");
                }
            }
        }
    }
}
