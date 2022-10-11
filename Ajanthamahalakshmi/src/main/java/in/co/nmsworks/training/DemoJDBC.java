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


//            String[] arr = {"insert into TodoList values(1,'Aj','Purchase Raincoat','2022-10-06')","insert into TodoList values(2,'dd','Purchase Raincoat','2022-10-06')","insert into TodoList values(3,'kabi','Purchase Raincoat','2022-10-06')","insert into TodoList values(4,'mathi','Purchase Raincoat','2022-10-06')","insert into TodoList values(5,'appu','Purchase Raincoat','2022-10-06')"};

            List<String[]> query = new ArrayList<>();
            query.add(new String[]{"Aju","Clean"});
            query.add(new String[]{"Kezi","Clean"});
            query.add(new String[]{"Sri","Wash"});
            query.add(new String[]{"kutty","Cook"});
            query.add(new String[]{"Shanu","Wash"});
            query.add(new String[]{"Gayu","Clean"});
            query.add(new String[]{"Aarti","Cook"});
            query.add(new String[]{"Sneka","Cook"});


            PreparedStatement stm = con.prepareStatement("insert into TodoList values(?,?,?,?)");
            for (int i = 0; i < query.size() ; i++ )
            {

                stm.setInt(1,i+1);
                stm.setString(2, query.get(i)[0]);
                stm.setString(3, query.get(i)[1]);
                stm.setDate(4,new Date(i));
                stm.executeUpdate();
//                System.out.println(stm);

            }

            }
        catch( Exception e)
            {
            e.printStackTrace();
            System.err.println("Value not inserted");
            }



    }

}
