package in.co.nmsworks.exercise3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompareTwoTablesAndPrintTheFirstNameAndSecondName {
    public static void main(String[] args) {

        try(

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Training"))
        {
            PreparedStatement stmtForUserDetails = con.prepareStatement("select*from user_details");
            ResultSet resultSet = stmtForUserDetails.executeQuery();

            PreparedStatement stmtForUserLogin=con.prepareStatement("select*from user_login");
            ResultSet resultSet1=stmtForUserLogin.executeQuery();



            Map<String, List<String>> unameDetails = new HashMap<>();
            List<String> unameLogin = new ArrayList<>();


            while(resultSet.next()){
                List<String>list=new ArrayList<>();
                list.add(resultSet.getString("first_name")+" "+resultSet.getString("last_name"));
                unameDetails.put(resultSet.getString("username"),list);
            }

            while(resultSet1.next()){

                unameLogin.add(resultSet1.getString("u_name"));
                System.out.println(unameDetails);
                System.out.println(unameLogin);
            }
            for (String element : unameLogin)
            {
                if (unameDetails.containsKey(element))
                {
                    System.out.println("username of " + element + " is" + unameDetails.get(element));
                }
            }






        }
        catch (Exception e){
            e.printStackTrace();


        }

    }
}
