package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DemoJDBC {
    public static void main(String[] args)
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");

//            PreparedStatement stm = con.prepareStatement("insert into TodoList values(1,'Aj','Purchase Raincoat','2022-10-06'),(2,'dd','Purchase Raincoat','2022-10-06'),(3,'kabi','Purchase Raincoat','2022-10-06'),(4,'mathi','Purchase Raincoat','2022-10-06'),(5,'appu','Purchase Raincoat','2022-10-06')");


            String[] arr = {"insert into TodoList values(1,'Aj','Purchase Raincoat','2022-10-06')","insert into TodoList values(2,'dd','Purchase Raincoat','2022-10-06')","insert into TodoList values(3,'kabi','Purchase Raincoat','2022-10-06')","insert into TodoList values(4,'mathi','Purchase Raincoat','2022-10-06')","insert into TodoList values(5,'appu','Purchase Raincoat','2022-10-06')"};

            List<String> query = new ArrayList<>();
            query.add("('AJ','Purchase Raincoat')");
            query.add("('Maha','Purchase Raincoat')");
            query.add("('Appu','Purchase Raincoat')");
            query.add("('Ajan','Purchase Raincoat')");
            query.add("('Lakshmi','Purchase Raincoat')");
            PreparedStatement stm = con.prepareStatement("insert into TodoList values(?,?,?,?)");
            for (int i = 0; i < query.size() ; i++ )
            {

                stm.setInt(i,i+1);
                stm.setString(i, query.get(i));
                stm.setString(i, query.get(i));
                stm.setDate(i,new Date(i));
                stm.executeUpdate();
                System.out.println(stm);

            }

            }
        catch( Exception e)
            {
            e.printStackTrace();
            System.err.println("Value not inserted");
            }



    }

}
