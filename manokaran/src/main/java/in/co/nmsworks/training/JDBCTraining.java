package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTraining
{
    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            List<String[]>todos = new ArrayList<>();
            todos.add(new String[]{"1", "manokaran", "watch anime", "2022-10-06 20:00:00"});
            todos.add(new String[]{"2", "manokaran", "study", "2022-10-06 20:30:00"});
            todos.add(new String[]{"3", "manokaran", "eat", "2022-10-06 20:45:00"});
            todos.add(new String[]{"4", "manokaran", "do jdbc program", "2022-10-06 21:00:00"});
            todos.add(new String[]{"5", "manokaran", "sleep", "2022-10-06 20:30:00"});


            String query = "INSERT INTO TodoList VALUES ( ? , ? , ? , ? )";
            statement = conn.prepareStatement(query);

            for(String[] todo : todos) {
                statement.setInt(1, Integer.parseInt(todo[0]));
                statement.setString(2, todo[1]);
                statement.setString(3, todo[2]);
                statement.setString(4, todo[3]);

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
