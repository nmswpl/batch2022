package in.co.nmsworks.exercise4;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GetMaleFemaleList
{
    public static void main(String[] args) throws SQLException, IOException
    {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
        PreparedStatement stmt = conn.prepareStatement("select * from user_details");
        ResultSet set = stmt.executeQuery();
        ResultSetMetaData metaData = set.getMetaData();
        int columnCount = metaData.getColumnCount();

        try (FileWriter maleFileWriter = new FileWriter("/home/nmsadmin/Downloads/Male.txt");
             FileWriter femaleFileWriter = new FileWriter("/home/nmsadmin/Downloads/Female.txt"))
        {
            while (set.next())
            {
                List<String> row = new ArrayList<>();
                if(set.getString(5).equals("Male"))
                {
                    for(int i = 1; i <= columnCount; i ++) {
                        row.add(set.getString(i));
                    }
                    maleFileWriter.write(String.valueOf(row) + "\n");
                }
                else
                {
                    for(int i = 1; i <= columnCount; i ++) {
                        row.add(set.getString(i));
                    }
                    femaleFileWriter.write(String.valueOf(row) + "\n");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
