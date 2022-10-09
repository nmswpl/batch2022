package in.co.nmsworks.training;

import java.sql.*;
import java.util.ArrayList;

public class JDBCTraining {

    private void select()
    {

    }
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
//            String[] todoArray={"insert into Todo_List values(1,'VIRAT','PRACTICING BATTING','2022-10-05 04:30:22')",
//                    "insert into Todo_List values(2,'MESSI','PRACTICE FOOT BALL','2022-10-05 06:30:22')",
//                        "insert into Todo_List values(3,'BHUVI','PRACTICE BOWLING','2022-10-05 10:30:22')",
//                    "insert into Todo_List values(4,'FEDD','TRAINING TENNIS','2022-10-05 12:30:22')",
//                    "insert into Todo_List values(5,'VIJAY','SLEEPING','2022-10-05 21:30:22')"};
            ArrayList<String> query= new ArrayList<>();
            query.add("insert into Todo_List values(1,'VIRAT','PRACTICING BATTING','2022-10-05 04:30:22')");
            query.add("insert into Todo_List values(2,'MESSI','PRACTICE FOOT BALL','2022-10-05 06:30:22')");
            query.add("insert into Todo_List values(3,'BHUVI','PRACTICE BOWLING','2022-10-05 10:30:22')");
            query.add( "insert into Todo_List values(4,'FEDD','TRAINING TENNIS','2022-10-05 12:30:22')");
            query.add("insert into Todo_List values(5,'VIJAY','SLEEPING','2022-10-05 21:30:22')");



            for (int i = 0; i < query.size(); i++) {
                PreparedStatement ps = con.prepareStatement(query.get(i));
                ps.executeUpdate();
                System.out.println("connected");
            }
        }
        catch (SQLException e)
        {
            System.err.println("NOT CONNECTED");
            e.printStackTrace();
        }

        JDBCTraining jdbc = new JDBCTraining();



    }
}
