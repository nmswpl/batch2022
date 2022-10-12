package in.co.nmsworks.excersise5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User_detailsAndUser_loginCheck
{
    public static void main(String[] args)
    {
        List<String> l= new ArrayList<>();
        Map<String,List<String>> m =new HashMap<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/saro");
            PreparedStatement sts = con.prepareStatement("select * from user_details");
            PreparedStatement sr = con.prepareStatement("select * from user_login"))
        {
            ResultSet login_user =sr.executeQuery();
            ResultSet details_user = sts.executeQuery();
            while (login_user.next())
            {
                String user_login_col = login_user.getString(2);
                l.add(user_login_col);
            }
            while (details_user.next())
            {
                String user_details_col = details_user.getString(2);
                String firstName =details_user.getString(3);
                String secondName =details_user.getString(4);
                List<String> mapList=new ArrayList<>();
                mapList.add(firstName);
                mapList.add(secondName);
                m.put(user_details_col,mapList);
            }
            for(int  i=0;i<l.size();i++)
            {
                if(m.containsKey(l.get(i)))
                {
                    System.out.println(m.get(l.get(i)));
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("action is not done");
        }
    }
}
