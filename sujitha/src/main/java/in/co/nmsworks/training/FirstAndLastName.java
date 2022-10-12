package in.co.nmsworks.training;

import java.sql.*;
import java.util.*;

public class FirstAndLastName
{
    public static void main(String[] args) throws SQLException
    {
        Map<String,List<String>> userWithFirstAndLastName = new HashMap<>();
        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training");
             PreparedStatement stmt=con.prepareStatement("select username,first_name,last_name from user_details");
             PreparedStatement stmt1 = con.prepareStatement("select uname from user_login");
             )
        {
            ResultSet userLastFirstName=stmt.executeQuery();
            while (userLastFirstName.next())

            {
                List<String> fnameLname=new ArrayList<>();
                fnameLname.add(userLastFirstName.getString(2));
                fnameLname.add(userLastFirstName.getString(3));
                userWithFirstAndLastName.put(userLastFirstName.getString(1), fnameLname);

            }

            ResultSet userNameInUserLogin = stmt1.executeQuery();
            List<String> username=new ArrayList<>();

            while(userNameInUserLogin.next())
            {
                username.add(userNameInUserLogin.getString("uname"));
            }

           for(String uname:username)
            {
               if(userWithFirstAndLastName.containsKey(uname))
                {
                    System.out.println(userWithFirstAndLastName.get(uname));
                }
            }

        }

    }

}
