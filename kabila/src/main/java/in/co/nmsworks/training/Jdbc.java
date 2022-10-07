package in.co.nmsworks.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class Jdbc {
    public static void main(String[] args)
    {
        List<String> query=new ArrayList<>();
       // query.add(new String[]{'kabi','writing homework'});
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
         //   PreparedStatement stmt = con.prepareStatement("insert into TodoList);

//            String[] arr={"INSERT INTO TodoList values(1,'kabi','writingwork','2022-10-07')\");",};
            for(int i=0;i<5;i++)
            {




//                PreparedStatement stmt = con.prepareStatement("INSERT INTO TodoList values(1,'kabi','writingwork','2022-10-07')");
//                stmt.executeUpdate();
//
//                stmt = con.prepareStatement("INSERT INTO TodoList values(2,'appu','writingwork1','2022-10-07')");
//                stmt.executeUpdate();
//
//                stmt = con.prepareStatement("INSERT INTO TodoList values(3,'dd','writingwork2','2022-10-07')");
//                stmt.executeUpdate();
//
//                stmt = con.prepareStatement("INSERT INTO TodoList values(4,'aju','writingwork3','2022-10-07')");
//                stmt.executeUpdate();
//
//                stmt = con.prepareStatement("INSERT INTO TodoList values(5,'ajuu','writingwork4','2022-10-07')");
//                stmt.executeUpdate();
            }

        } catch (Exception e)
        {
            System.err.println("not created");
            e.printStackTrace();
        }


    }
}
