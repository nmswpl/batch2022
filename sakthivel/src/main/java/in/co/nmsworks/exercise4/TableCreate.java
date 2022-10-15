package in.co.nmsworks.exercise4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableCreate
{
    public static void main(String[] args)
    {
        try(
        Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training");
        PreparedStatement stmt = con.prepareStatement("select username from userlogin");
        PreparedStatement stmt1 = con.prepareStatement("select username,first_name,last_name from user_details"))
        {

            ResultSet data = stmt.executeQuery();
            System.out.println(data);

            ResultSet name= stmt1.executeQuery();
            System.out.println(name);

            List<String> tableset=new ArrayList<>();
            while (data.next())
            {
                String username = data.getString("username");
                tableset.add(username);

            }
            Map<String,List<String>> mapvalue=new HashMap<>();
            List<String> list1=new ArrayList<>();
            while(name.next())
            {
                String username1 = name.getString("username");
                String firstname = name.getString("first_name");
                String lastname = name.getString("last_name");

                list1.add(firstname+","+lastname);
                mapvalue.put(username1,list1);
            }
            //System.out.println(list1);

         for(String  a : tableset);
            {

                if ( mapvalue.containsKey(tableset))
               {
                    System.out.println(mapvalue.get(tableset));
                }

          }

        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.err.println("error occured");
        }

    }
}
