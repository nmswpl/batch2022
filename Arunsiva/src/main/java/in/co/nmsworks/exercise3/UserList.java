package in.co.nmsworks.exercise3;

import java.io.*;
import java.sql.*;

public class UserList {
    public static void main(String[] args) throws Exception {

        File file1 = new File("/home/nmsadmin/Downloads/male.txt");
        File file2 = new File("/home/nmsadmin/Downloads/female.txt");

       try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost/training");

               Statement stm= con.createStatement();

               FileWriter write1=new FileWriter(file1);
               FileWriter write2=new FileWriter(file2))

       {
           file1.createNewFile();
           file2.createNewFile();

           ResultSet usrresult= stm.executeQuery("select username,first_name,last_name,gender from user_details");
           while(usrresult.next())
           {
            String username=usrresult.getString("Username");
            String firstname=usrresult.getString("first_name");
            String lastname= usrresult.getString("last_name");
            String gender=usrresult.getString("gender");
             if(gender.equals("Male"))
             {
                 write1.write(username+"       "+firstname+"          "+lastname+"       "+"\n");


             }
             if(gender.equals("Female"))
               {
               write2.write(username+"       "+firstname+"          "+lastname+"       "+"\n");

           }

           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }




    }
}
