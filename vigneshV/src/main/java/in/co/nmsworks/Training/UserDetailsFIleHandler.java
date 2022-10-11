package in.co.nmsworks.Training;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class UserDetailsFIleHandler
{
    public static void main(String[] args) throws SQLException, IOException
    {

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Training");
        Statement st = con.createStatement();

        ResultSet s = st.executeQuery("select * from user_details");

        ResultSetMetaData rsmd = s.getMetaData();
        int columnsNumber = rsmd.getColumnCount();


        try
                (
                BufferedWriter maleFileWriter = new BufferedWriter(new FileWriter("/home/nmsadmin/git/batch2022/vigneshV/src/main/java/in/co/nmsworks/Training/Male.txt"));
                BufferedWriter femaleFileWriter = new BufferedWriter(new FileWriter("/home/nmsadmin/git/batch2022/vigneshV/src/main/java/in/co/nmsworks/Training/Female.txt"))
                )
        {
            while (s.next())
            {
                for(int i = 1 ; i <= columnsNumber; i++)
                {
                    if(s.getString(5).equals("Male"))
                    {
                        maleFileWriter.write(s.getString(i) +" ");
                        if(i==columnsNumber)
                            maleFileWriter.write('\n');

                    }
                    else
                    {
                        femaleFileWriter.write(s.getString(i)+' ');
                        if(i==columnsNumber)
                            femaleFileWriter.write('\n');
                    }
                }
            }
            st.close();
            con.close();
        }
    }
}


