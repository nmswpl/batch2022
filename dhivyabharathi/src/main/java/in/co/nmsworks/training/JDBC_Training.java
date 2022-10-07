package in.co.nmsworks.training;

import java.sql.*;
public class JDBC_Training
{

    public void insert1()  {
        try
        {
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost/training");
            String queries[] = new String[5];
            queries[0] = "insert into Todolist values(1,'Dhivya','Code to Project','2022-10-06 13:23:44')";
            queries[1] = "insert into Todolist values(2,'Thirumagal','Prepare  IAS Exam','2022-10-06 13:23:44')";
            queries[2] = "insert into Todolist values(3,'Rithika','Prepare NEET eXAM','2022-10-06 13:23:44')";
            queries[3] = "insert into Todolist values(4,'Amutha','Going to temple','2022-10-06 13:23:44')";
            queries[4] = "insert into Todolist values(5,'Bharathi','Going to Lunch','2022-10-06 13:23:44')";

            for (int i=0;i< queries.length;i++)
            {
                PreparedStatement st = con.prepareStatement( queries[i]);
                st.executeUpdate();

            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        JDBC_Training jdbcTraining = new JDBC_Training();
        jdbcTraining.insert1();
    }
}
