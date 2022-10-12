package in.co.nmsworks.exercise3;

import jdk.nashorn.internal.objects.NativeError;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDetails {
    public static void main(String[] args){
        compareStatement();
    }
        public  static  void  compareStatement()  {
       try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/training");
           PreparedStatement statement=connection.prepareStatement("select *from user_login");
        PreparedStatement statement1=connection.prepareStatement("select *from user_details"))
       {
//           File file = new File("/home/nmsadmin/Desktop/user.txt");
//           file.createNewFile();
//           FileWriter fr = new FileWriter(file);

           ResultSet result1 = statement.executeQuery();
           ResultSet result2 = statement1.executeQuery();
           List<String> l1 = new ArrayList<>();
           Map<String, List<String>> map = new HashMap<>();
           String Username = null;
           while (result1.next()) {
               Username = result1.getString("Username");
               l1.add(Username);
           }
           String first_name = null;
           String last_name = null;
           while (result2.next()) {

               String username = result2.getString("username");
               first_name = result2.getString("first_name");
               last_name = result2.getString("last_name");
               List<String> l2 = new ArrayList<>();
               l2.add(first_name);
               l2.add(last_name);
               map.put(username,l2);
           }


               for (int i = 0; i < l1.size(); i++) {
                   if (map.containsKey(l1.get(i)))
                   {

                       System.out.println(map.get(l1.get(i)));
                   }
              
               }



//


       }
       catch (Exception e)
       {
           e.printStackTrace();
//           System.err.println("Error Obtained");
       }

       }

    }

//       {
//
//       }
//    }



