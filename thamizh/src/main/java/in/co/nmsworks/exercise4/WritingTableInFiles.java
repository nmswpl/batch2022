package in.co.nmsworks.exercise4;

import com.mysql.cj.xdevapi.Collection;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class WritingTableInFiles {

    public static void readingWriting() throws Exception
    {


        File fileMale=new File("/home/nmsadmin/Pictures/male.txt");
        File fileFemale=new File("/home/nmsadmin/Pictures/Female.txt");

        try(Connection c= DriverManager.getConnection("jdbc:mysql://localhost/Training");

            Statement s= c.createStatement();

            FileWriter writingMale=new FileWriter(fileMale);
            FileWriter writingFemale=new FileWriter(fileFemale))

        {

            fileFemale.createNewFile();
            fileFemale.createNewFile();

            ResultSet resultOfUsr= s.executeQuery("select user_id,username,first_name,last_name,gender,password,status from user_details ");

            while (resultOfUsr.next())
            {

                int sno=resultOfUsr.getInt(1);
                String usrName= resultOfUsr.getString(2);
                String firstName= resultOfUsr.getString(3);
                String secondName= resultOfUsr.getString(4);
                String gender=resultOfUsr.getString(5);
                String pass=resultOfUsr.getString(6);
                int status=resultOfUsr.getInt(7);

                if(gender.equals("Male")) {
                    writingMale.write(usrName + " ," + firstName + " ," + secondName);
                    writingMale.write(System.getProperty("line.separator"));
                }
                else {
                    writingFemale.write(usrName + " ," + firstName + " ," + secondName);
                    writingFemale.write(System.getProperty("line.separator"));
                }

            }



        }
        }

    public static void main(String[] args) {

        try {

            readingWriting();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    }



