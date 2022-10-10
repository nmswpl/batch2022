package in.co.nmsworks.training;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCTraining2 {

    public static void main(String[] args) throws RuntimeException, SQLException {

        Connection con = null;
        PreparedStatement statement = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"Victor", "Dinner", "2022-10-06 18:00:01"});
            queries.add(new String[]{"Alice","Volleyball","2022-10-06 20:00:01"});
            queries.add(new String[]{"Emy","Billiards","2022-10-06 23:00:01"});
            queries.add(new String[]{"Ishu","Breakfast","2022-10-06 08:00:01"});
            queries.add(new String[]{"Surya","Dinner","2022-10-06 18:00:01"});
            queries.add(new String[]{"Vijay","Dinner","2022-10-06 18:00:01"});
            queries.add(new String[]{"Karthik","Dinner","2022-10-06 18:00:01"});
            queries.add(new String[]{"Ponniyin Selvan","Dinner","2022-10-06 18:00:01"});
            queries.add(new String[]{"Karigalan","Dinner","2022-10-06 18:00:01"});
            queries.add(new String[]{"Ziya","Dinner","2022-10-06 18:00:01"});
            statement = con.prepareStatement("insert into TodoList values(?,?,?,?)");
            for (int i = 0; i < queries.size(); i++) {

                statement.setInt(1,i+1);
                statement.setString(2,queries.get(i)[0]);
                statement.setString(3,queries.get(i)[1]);
                statement.setString(4,queries.get(i)[2]);

                statement.executeUpdate();
            }
        }
        catch (SQLException e){
            e.printStackTrace();


        }
        finally {
            if (statement != null){
                    statement.close();

            }
            if (con != null){
                con.close();
            }
        }

    }


}
