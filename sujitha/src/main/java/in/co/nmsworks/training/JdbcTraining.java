package in.co.nmsworks.training;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.currentTimeMillis;

public class JdbcTraining
{
    public static void main(String[] args)
    {
        PreparedStatement stmt=null;
        Connection con=null;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            // PreparedStatement stmt=con.prepareStatement("insert into TodoList values (1,'suji','writetest','2022-09-12'),(2,'suba','readbook','2022-08-10'),(3,'priya','watchmovie','2022-07-09'),(4,'kamali','listenmusic','2022-06-07'),(5,'krithika','dohomowork','2022-05-04');");

            List<String[]> queries = new ArrayList<>();
            queries.add(new String[]{"suji","writetest"});
            queries.add(new String[]{"suba","readbook"});
            queries.add(new String[]{"renu","listenmusic"});
            queries.add(new String[]{"swetha","watchmovies"});
            queries.add(new String[]{"swathi","readbook"});
            queries.add(new String[]{"shalini","do home work"});
            queries.add(new String[]{"sangavi","readbook"});
            queries.add(new String[]{"surya","listen music"});
            queries.add(new String[]{"raji","eating"});
            queries.add(new String[]{"malathi","play cricket"});
            //System.out.println("---------");
            //System.out.println(Arrays.toString(queries.get(2)));
            stmt=con.prepareStatement("insert into TodoList values(?,?,?,?)");
            for(int i=0;i< queries.size();i++)
            {
              stmt.setInt(1,i+1);
              stmt.setString(2,queries.get(i)[0]);
              stmt.setString(3,queries.get(i)[1]);
              stmt.setString(4, String.valueOf(new Date(currentTimeMillis())));
              stmt.executeUpdate();
            }

        }
        catch (Exception e) {
            System.err.println("error occurred");
            e.printStackTrace();
        }
        finally
        {
            if(stmt!=null)
            {
                try
                {
                    stmt.close();
                }
                catch (SQLException e)
                {
                    System.out.println("error in close");;
                }

                if(con!=null)
                {
                    try
                    {
                        con.close();
                    }
                    catch (SQLException e)
                    {
                        System.out.println("error in close main");;
                    }
                }
            }
        }
    }
}
