package in.co.nmsworks.training;

import com.mysql.cj.protocol.a.LocalDateValueEncoder;

import java.sql.*;
import java.time.LocalDate;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class JDBCExcersise
{
    public void readyMySql()
    {
        Connection connection =null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Training");

            String[] query={"Buvi","Saro","Sakthi","Dheepan","Tamizh","Arun siva","Praveen","Vijay","Vicky","Srither"};
            String q="insert into ToDoList values(?,?,?,?)";

             preparedStatement = connection.prepareStatement(q);

            for (int i=0;i<query.length;i++)
            {
                preparedStatement.setInt(1,i+1);
                preparedStatement.setString(2,query[i]);
                preparedStatement.setString(3,"Home Work");
                preparedStatement.setDate(4,Date.valueOf(LocalDate.now()));
                int count = preparedStatement.executeUpdate();
            }
        }
        catch (Exception e)
        {
            System.err.println("Exceptuion Accured");
            e.printStackTrace();
        }

        finally {
            try {
                if (preparedStatement != null)
                {
                    preparedStatement.close();
                }
                if(connection != null)
                {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args)
    {
        JDBCExcersise jdbcExcersise=new JDBCExcersise();
        jdbcExcersise.readyMySql();
    }
}
