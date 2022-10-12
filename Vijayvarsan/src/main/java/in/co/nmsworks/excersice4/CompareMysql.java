package in.co.nmsworks.excersice4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareMysql {
    public static void main(String[] args) {


        try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training"))
        {
            System.out.println("Connected Successfully");
            PreparedStatement userLog= con.prepareStatement("select username from user_login;");
            ResultSet userLogSet =userLog.executeQuery();
            List<String> userNameList =new ArrayList<>();
            while (userLogSet.next())
            {
                userNameList.add(userLogSet.getString(1));
            }
            System.out.println(userNameList);

            PreparedStatement userDetail=con.prepareStatement("select username,first_name,last_name from user_details;");
            ResultSet detailSet=userDetail.executeQuery();
            Map<String,List<String>> mapOfDetails=new HashMap<>();

            while (detailSet.next())
            {
               for (String username:userNameList)
               {
                   if(username.equals(detailSet.getString(1)))
                   {
                       List<String> name =new ArrayList<>();
                       name.add(detailSet.getString(2));
                       name.add(detailSet.getString(3));
                       mapOfDetails.put(detailSet.getString(1),name);
                   }
               }
            }
            System.out.println(mapOfDetails);

        }
        catch (Exception e)
        {
            System.err.println("NOT CONNECTED");
        }
    }
}
