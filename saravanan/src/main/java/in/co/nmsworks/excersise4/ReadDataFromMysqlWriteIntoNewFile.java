package in.co.nmsworks.excersise4;

import java.io.FileWriter;
import java.sql.*;

public class ReadDataFromMysqlWriteIntoNewFile
{
    public static void main(String[] args)
    {
         try(FileWriter writeIntoMaleDetails = new FileWriter("/home/nmsadmin/Downloads/userdetailsofmaleonly.txt");
             FileWriter writeIntoFemaleDetails = new FileWriter("/home/nmsadmin/Downloads/userdetailsfemaleonly.txt");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/saro");
            PreparedStatement sts = con.prepareStatement("select * from user_details"))
         {

             ResultSet resultTable = sts.executeQuery();
            // ResultSetMetaData columnName = resultTable.getMetaData();
             while (resultTable.next())
             {
                // int sqlColumn1 = resultTable.getInt(1);
                 String sqlColumn2 = resultTable.getString(2);
                 String sqlColumn3 = resultTable.getString(3);
                 String sqlColumn4 = resultTable.getString(4);
                 String sqlColumn5 = resultTable.getString(5);
                 if(sqlColumn5.equalsIgnoreCase("male"))
                      writeIntoMaleDetails.write(sqlColumn2+"  "+sqlColumn3 +" "+sqlColumn4+" "+sqlColumn5+"\n");
                 else
                     writeIntoFemaleDetails.write(sqlColumn2+"  "+sqlColumn3 +" "+sqlColumn4+" "+sqlColumn5+"\n");
             }
         }
         catch (Exception e)
         {
             System.out.println("does not read a data and store into new file");
         }
    }

}
