package in.co.nmsworks.excercise3;

import java.io.*;
import java.sql.*;

public class SqlFileWrite
{
    public static void main(String[] args)
    {
        SqlFileWrite.readingFile("SELECT * FROM user_details");
    }
    public static void readingFile( String query)
    {
        String uname,fname,lname,gender;

        File maleFile=null;
        File femaleFile=null;

        try {
            maleFile = new File("/home/nmsadmin/Desktop/malelist.txt");

            femaleFile = new File("/home/nmsadmin/Desktop/femalelist.txt");

            if (maleFile.createNewFile())
            {
                System.out.println("male file created");
            }
            if (femaleFile.createNewFile())
            {
                System.out.println("Female file Create");
            }
        }
        catch (Exception e)
        {
            System.err.println("file not create");
        }

        try(FileWriter fw1=new FileWriter(maleFile);
            BufferedWriter br1=new BufferedWriter(fw1);
            FileWriter fw2=new FileWriter(femaleFile);
            BufferedWriter br2=new BufferedWriter(fw2))
        {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Training");
            Statement stmt=con.createStatement();
            ResultSet resultSet=stmt.executeQuery(query);
           while (resultSet.next())
           {
               uname=resultSet.getString(2);
               fname=resultSet.getString(3);
               lname=resultSet.getString(4);
               gender=resultSet.getString(5);
               if (gender.equals("Male"))
               {
                   br1.write(uname + " | " + fname + " | " + lname +"\n");
                   br1.flush();
               }
               else
               {
                   br2.write(uname + " | " + fname + " | " + lname +"\n");
                   br2.flush();
               }
           }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
