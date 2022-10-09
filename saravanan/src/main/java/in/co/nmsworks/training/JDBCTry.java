package in.co.nmsworks.training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.time.LocalDate;
public class JDBCTry
{
    public static void main(String[] args)
    {
       JDBCTry jdbc = new JDBCTry();
       jdbc.setMySQLData();
    }
    private void setMySQLData()
    {   Connection con=null;
        PreparedStatement ss=null;
        try
        {   String student;
             con = DriverManager.getConnection("jdbc:mysql://localhost/saro");
             ss = con.prepareStatement("insert into studentDetails values(?,?,?,?)");
            BufferedReader detailOfStudent = new BufferedReader(new FileReader("/home/nmsadmin/Downloads/StudentsList.csv"));
            System.out.println(detailOfStudent.readLine());
            while((student=detailOfStudent.readLine())!=null)
            {
                String[] studentDetailsArray=student.split(",");
                //for (int i=0;i< studentDetailsArray.length;i++)

                    ss.setInt(1, Integer.parseInt(studentDetailsArray[0]));
                    ss.setString(2,studentDetailsArray[1]);
                    ss.setString(3,studentDetailsArray[2]);
                    ss.setString(4,studentDetailsArray[3] );
                    ss.executeUpdate();
            }
            detailOfStudent.close();
        }
        catch (Exception e)
        {
            System.out.println("row cannot be inserted");
            e.printStackTrace();
        }
        finally
        {  try {
            if (ss != null) {
                ss.close();
            }
            if (con != null) {
                con.close();
            }
           }
           catch (Exception e)
           {
               System.out.println("Error in prepare statement ans connection");
           }
        }
    }
}
