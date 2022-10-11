package in.co.nmsworks.excercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
    public static void main(String[] args) throws Exception {

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession"))
        {

            PreparedStatement stm = con.prepareStatement("Select * from user_details where gender = ? ");

            List<File> folder = new ArrayList<>();
            File fileFemale = new File("/home/nmsadmin/Downloads/FemaleName.txt");
            File fileMale = new File("/home/nmsadmin/Downloads/MaleName.txt");
            folder.add(fileFemale);
            folder.add(fileMale);



            for(File f : folder)
                try(FileWriter writer = new FileWriter(f);
                BufferedWriter buffer = new BufferedWriter(writer))
                {
                    if(f.equals(fileFemale))
                    {
                        stm.setString(1,"female");
                    }
                    else
                    {
                        stm.setString(1,"male");
                    }

                    ResultSet resultSet = stm.executeQuery();


                    String line = "";
                    while(resultSet.next())
                    {

                    line += resultSet.getString("username");
                    line += ",";
                    line += resultSet.getString("first_name");
                    line += ",";
                    line += resultSet.getString("last_name");
                    line += "\n";

                    }
                    buffer.write(line);

                    System.out.println(f+" written Successfully");
                }
                catch (IOException e)
                {
                    throw new RuntimeException(e);
                }

        }


    }
}
