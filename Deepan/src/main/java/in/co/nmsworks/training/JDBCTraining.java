package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCTraining {


    public static void main(String[] args) {
        try
        {
            Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
            System.out.println("Connected");

           // PreparedStatement stmt = connect.prepareStatement("insert into TodoList values (1,'Deepan','Kick start jdbc','2022-10-06')");

            String[] name = {"Thamizh","Sakthi","Praveen","Arun Siva"};
            String[] desc = {"java","js","reactjs","c"};
            PreparedStatement stmt;
            for (int i=0 ; i < name.length; i++)
            {
                stmt = connect.prepareStatement("insert into TodoList values(" +i+ ", '" +name[i] +"' , '"+desc[i]+"', '2022-10-06')");
                stmt.executeUpdate();
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
