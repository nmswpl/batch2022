package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class TodoList {

    public static void main(String[] args) {

        PreparedStatement statement = null;
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
            System.out.println("Connected to Database");
            List<String[]> queryList = new ArrayList<>();
            queryList.add(new String[]{"Deepan","Kick start jdbc"});
            queryList.add(new String[]{"Thamizh","Kick start java"});
            queryList.add(new String[]{"Sakthi","Kick start js"});
            queryList.add(new String[]{"Praveen","Kick start C"});
            queryList.add(new String[]{"Arun siva","Kick start C"});
            queryList.add(new String[]{"Saravanan","Kick start C"});
            queryList.add(new String[]{"Vijay","Kick start C"});
            queryList.add(new String[]{"Bhuvaneshwar","Kick start C"});
            queryList.add(new String[]{"Manokar","Kick start C"});
            queryList.add(new String[]{"Pradeep","Kick start C"});

            for (int i=0 ; i < queryList.size(); i++) {
                statement = connection.prepareStatement("insert into TodoList values(?,?,?,?)");
                statement.setInt(1, i + 1);
                statement.setString(2, queryList.get(i)[0]);
                statement.setString(3, queryList.get(i)[1]);
                statement.setString(4,"2022-10-06");
                statement.executeUpdate();
            }
        }
        catch (Exception e)
        {
            System.err.println("Exception popped");
            e.printStackTrace();
        }
        finally {
            try
            {
                if (statement != null)
                {
                    statement.close();
                }

                if (connection != null)
                    connection.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
    }
}
