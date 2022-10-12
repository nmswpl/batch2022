package in.co.nmsworks.exercise4;
// Read the table and write male and female list in separate files
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
                    maleFileWriter.write(set.getString(2)+" , " + set.getString(3) + " , " + set.getString(4));
                    maleFileWriter.write("\n");
                }
                else
                {
                    for(int i = 1; i <= columnCount; i ++) {
                        if(i >=2 && i <= 4){row.add(set.getString(i));}
                    }
                    for (String s : row) {
                        femaleFileWriter.write(String.valueOf(s)+ " , ");
                    }
                    femaleFileWriter.write("\n");

                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
