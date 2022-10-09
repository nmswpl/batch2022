package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class JDBCExercise
{
    public static void main(String[] args)
    {
        Connection cont =null;
        PreparedStatement stmt =null;

        try {
            cont = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
            System.out.println("Connected");


            List<String[]> list = new ArrayList<>();
            list.add(new String[]{"Sakthi", "Reading Books"});
            list.add(new String[]{"Surya", "At Working"});
            list.add(new String[]{"Arun", "Java Program"});
            list.add(new String[]{"Praveen", "ReadingBooks"});
            list.add(new String[]{"Deepan", "Reading Stories"});

            for (int i = 0; i < list.size(); i++) {
                stmt = cont.prepareStatement("insert into TodoList values (?,?,?,?)");
                stmt.setInt(1, i + 1);
                stmt.setString(2, list.get(i)[0]);
                stmt.setString(3, list.get(i)[1]);
                stmt.setString(4, "2022-10-11");

                stmt.executeUpdate();
            }
        }
        catch (Exception e)
        {
            System.err.println("its working");
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt!=null)
                    stmt.close();
                if(cont!=null)
                    cont.close();
            }
            catch(Exception e)
            {
                System.out.println("error");
            }
        }

        }


}
