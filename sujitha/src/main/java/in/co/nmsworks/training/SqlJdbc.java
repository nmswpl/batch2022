package in.co.nmsworks.training;

import java.io.*;
import java.sql.*;

public class SqlJdbc
{
    public static void main(String[] args) throws SQLException, IOException
    {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");PreparedStatement stmt = con.prepareStatement("select username,first_name,last_name from user_details where gender='Female';");PreparedStatement stmt1 = con.prepareStatement("select username,first_name,last_name from user_details where gender='Male';");)
        {
            File female=new File("/home/nmsadmin/Documents/Female.txt");
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(female)))
            {
                ResultSet s = stmt.executeQuery();
                while (s.next())
                {
                    String userName=s.getString(1);
                    String firstName=s.getString(2);
                    String lastName=s.getString(3);
                    String row=userName+" "+firstName+" "+lastName+"\n";
                    writer.write(row);
                }
            }


            File male=new File("/home/nmsadmin/Documents/Male.txt");
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(male)))
            {
                ResultSet s = stmt1.executeQuery();
                while (s.next())
                {
                    String userName=s.getString(1);
                    String firstName=s.getString(2);
                    String lastName=s.getString(3);
                    String row=userName+" "+firstName+" "+lastName+"\n";
                    writer.write(row);
                }
            }
        }
    }
}
