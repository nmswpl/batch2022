package in.co.nmsworks.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValuesInTable
{
    public static void main(String[] args)
    {
        String createquery = "CREATE TABLE companyList ("+
                "companyName VARCHAR(50),"+
                "id INT,"+
                "revenue DOUBLE,"+
                "noOfEmployees INT,"+
                "sector VARCHAR(50),"+
                "CEO VARCHAR(50))";
        String insertquery = "INSERT INTO companyList VALUES(?,?,?,?,?,?)";
        String filepath = "/home/nmsadmin/Downloads/Fortune_1000_companies.csv";
        String line;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement createstmt = conn.prepareStatement(createquery);
            PreparedStatement insertstmt = conn.prepareStatement(insertquery);
            BufferedReader br = new BufferedReader(new FileReader(filepath))
            )
        {
            createstmt.executeUpdate();
            br.readLine();
            while ((line = br.readLine()) != null)
            {
                String[] row = line.split(",");
                if(row.length == 6)
                {
                    insertstmt.setString(1,row[0]);
                    insertstmt.setInt(2,Integer.parseInt(row[1]));
                    insertstmt.setDouble(3,Double.parseDouble(row[2]));
                    insertstmt.setInt(4,Integer.parseInt(row[3]));
                    insertstmt.setString(5,row[4]);
                    insertstmt.setString(6,row[5]);
                    insertstmt.executeUpdate();
                }
                else
                {
                    insertstmt.setString(1,row[0]);
                    insertstmt.setInt(2,Integer.parseInt(row[1]));
                    insertstmt.setDouble(3,Double.parseDouble(row[2]));
                    insertstmt.setInt(4,Integer.parseInt(row[3]));
                    insertstmt.setString(5,row[4]);
                    insertstmt.setString(6,null);
                    insertstmt.executeUpdate();
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
