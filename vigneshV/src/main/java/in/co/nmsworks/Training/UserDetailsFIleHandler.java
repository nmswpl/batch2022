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

        try
                (
                BufferedWriter maleFileWriter = new BufferedWriter(new FileWriter("/home/nmsadmin/git/batch2022/vigneshV/src/main/java/in/co/nmsworks/Training/Male.txt"));
                BufferedWriter femaleFileWriter = new BufferedWriter(new FileWriter("/home/nmsadmin/git/batch2022/vigneshV/src/main/java/in/co/nmsworks/Training/Female.txt"))
                )
        {
            while (s.next())
            {
                    if(s.getString(5).equals("Male"))
                    {
                        String userName = s.getString(2);
                        String firstName = s.getString(5);
                        String lastName = s.getString(4);



                        maleFileWriter.write( userName+" "+firstName+" "+" "+lastName+"\n");
                    }
                    else
                    {
                        String userName = s.getString(2);
                        String firstName = s.getString(5);
                        String lastName = s.getString(4);
                        femaleFileWriter.write( userName+" "+firstName+" "+" "+lastName+"\n");
                    }
                }
            }
            st.close();
            con.close();
        }
    }



