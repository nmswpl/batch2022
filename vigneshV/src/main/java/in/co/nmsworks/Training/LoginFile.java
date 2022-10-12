package in.co.nmsworks.Training;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginFile
{
    public static void loginTimeFile(Statement st) throws SQLException, IOException
    {
        String userNameQuery = "SELECT user_name FROM user_login";
        ResultSet s = st.executeQuery(userNameQuery);

        try(BufferedWriter loginFileWriter = new BufferedWriter(new FileWriter("/home/nmsadmin/git/batch2022/vigneshV/src/main/java/in/co/nmsworks/Training/loginuser.txt")))
        {
            while (s.next())
                System.out.println(s.getString(1));
        }


    }


}
