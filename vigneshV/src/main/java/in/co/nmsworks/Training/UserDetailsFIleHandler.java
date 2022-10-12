package in.co.nmsworks.Training;



import java.io.IOException;
import java.sql.*;


public class UserDetailsFIleHandler
{
    public static void main(String[] args) throws SQLException, IOException
    {

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Training");
        Statement st = con.createStatement();
        CreateFiles.genderFile(st);
        CreateFiles.loginTimeFile(st);

        st.close();
        con.close();


        }
    }



