package in.co.nmsworks.excersice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;



public class FileReading {

    public static void main(String[] args) throws Exception {

        File file1=new File("/home/nmsadmin/Downloads/male.txt");
        file1.createNewFile();
        File file2=new File("/home/nmsadmin/Downloads/female.txt");
        file2.createNewFile();
        try{

            FileWriter fileWriter = new FileWriter(file1);
                BufferedWriter bWrite1 = new BufferedWriter(fileWriter);
                FileWriter fileWriter2=new FileWriter(file2);
            BufferedWriter  bWrite2 =new BufferedWriter(fileWriter2);

            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Training");
            System.out.println("Connected Successfully");
//            PreparedStatement psMale= con.prepareStatement("select * from user_details where gender='male';");
//            PreparedStatement psFemale=con.prepareStatement("select * from user_details where gender='female';");
//            ResultSet resultSet1 = psMale.executeQuery();
//            ResultSet resultSet2= psFemale.executeQuery();
            PreparedStatement ps=con.prepareStatement("select * from user_details;");
                    ResultSet resultSet=ps.executeQuery();
            String row = null;
            String male="Male";
            while (resultSet.next())
            {
               // temp = krish01 + krishna  + ranta
                String userId =resultSet.getString(1);
                String  username = resultSet.getString(2);
                String first_name=resultSet.getString(3);
                String last_name=resultSet.getString(4);
                 String gender=resultSet.getString(5);
                      String password=  resultSet.getString(6);
                String status=resultSet.getString(7);
                row=userId+" | "+username+" | "+first_name+" | "+last_name+" | "+gender+" | "+password+" | "+status+"\n";
             if(gender.equals(male))
             {
                 System.out.println(gender);
                 bWrite1.write(row);
                 bWrite1.flush();
             }
             else
                 bWrite2.write(row);
                bWrite2.flush();
             }

//                System.out.println(row);

//            FileWriter fileWriter2 = new FileWriter(file2);
//            BufferedWriter bWrite2 = new BufferedWriter(fileWriter2);
//            String row2;
//            while (resultSet2.next())
//            {
//                // temp = krish01 + krishna  + ranta
//                row2 =(resultSet2.getString(1) +" | "+ resultSet2.getString(2) +" | "+
//                        resultSet2.getString(3) +" | "+ resultSet2.getString(4) +" | "+
//                        resultSet2.getString(5) +" | "+
//                        resultSet2.getString(6) +" | "+ resultSet2.getString(7)+"\n");
//                System.out.println(row2);
//                bWrite2.write(row2);
//                bWrite2.flush();
//            }


        }

        catch (Exception e)
        {
            System.err.println("NOT CONNECTED");
        }
        finally {

        }

    }
}
