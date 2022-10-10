package in.co.nmsworks.Training;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCExercise {
    static PreparedStatement stmt = null;
    static Connection con = null;
    private static void update() throws SQLException {
        //Add connection

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/training");


            String[] query = {"insert into TodoList values(1,'vicky','Wakeup','2001-06-30 12:10:00')",
                    "insert into TodoList values(2,'imran','Bought','2000-10-05 11:10:00')",
                    "insert into TodoList values(3,'Sambath','Brush','2002-10-15 10:10:00')",
                    "insert into TodoList values(4,'Rose','Dinner','2003-11-25 12:12:12')",
                    "insert into TodoList values(5,'gokul','Lunch','2004-12-17 01:10:28')"};

            for (String i : query) {
                stmt = con.prepareStatement(i);
                stmt.executeUpdate();
            }


        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            if (stmt != null)
                stmt.close();
            if (stmt != null)
                con.close();
        }
    }

    public static void jdbc()
    {
        Connection con=null;
        PreparedStatement stmt=null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/training");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your work : ");
            String work = sc.nextLine();
            List<String[]> queries=new ArrayList<>();
            queries.add(new String[]{"vikky", work});
            queries.add(new String[]{"sam", "Writing"});
            queries.add(new String[]{"Keerthana","Sleeping"});
            queries.add(new String[]{"rose","Boughthing"});
            queries.add(new String[]{"sreedhar","Running"});
            queries.add(new String[]{"Nethaj", "Do HW"});
            queries.add(new String[]{"Sanjeev", "Writing"});
            queries.add(new String[]{"Yasmin","Sleeping"});
            queries.add(new String[]{"Bhuvi","Boughthing"});
            queries.add(new String[]{"Fazil","Running"});
            stmt=con.prepareStatement("INSERT INTO TodoList VALUES(?,?,?,?)");
            for(int i=0;i< queries.size();i++)
            {
                stmt.setInt(1,i+1);
                stmt.setString(2,queries.get(i)[0]);
                stmt.setString(3,queries.get(i)[1]);
                stmt.setDate(4,new Date(System.currentTimeMillis()));
                stmt.executeUpdate();
            }


        }
        catch(Exception e)
        {
            System.err.println("ERROR occured");
            e.printStackTrace();
        }
        finally {
            if (stmt != null)
            {
                try {
                    stmt.close();
                } catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }

            if (con != null)
            {
                try {
                    con.close();
                }
                catch (SQLException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String[] args) throws SQLException
    {

        jdbc();

    }
}