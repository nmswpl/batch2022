package in.co.nmsworks.exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class UserList
{
    public static void writeFile(File filepath,PreparedStatement stmt)
    {
        try(BufferedWriter br=new BufferedWriter(new FileWriter(filepath)))
        {
            ResultSet rs= stmt.executeQuery();
            br.write("User Name                 " +"First Name                   "+"Last Name\n");
            br.write("----------------------------------------------------------------------------\n");
           while(rs.next())
           {

                   String values = (rs.getString(2) + "                 " + rs.getString(3) + "                       " + rs.getString(4) + "\n");
                   br.write(values);

           }

        }
        catch (Exception e)
        {
            System.out.println("Not connected" );
        }
    }

    public static void main(String[] args)
    {
        File maleDetails=new File("/home/nmsadmin/Documents/UserList/Male.txt");
        File femaleDetails=new File("/home/nmsadmin/Documents/UserList/Female.txt");

        String query1="SELECT * FROM user_details where gender='male' ";
        String query2="SELECT * FROM user_details where gender='female';";
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
                PreparedStatement stmt= con.prepareStatement(query1);
                PreparedStatement stmt2= con.prepareStatement(query2);) {

            UserList.writeFile(maleDetails, stmt);
            UserList.writeFile(femaleDetails, stmt2);
        }
        catch(Exception e)
        {
            System.err.println("Error Occured");
        }




    }
}
