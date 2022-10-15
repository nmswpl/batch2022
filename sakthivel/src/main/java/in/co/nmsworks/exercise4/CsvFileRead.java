package in.co.nmsworks.exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CsvFileRead
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No Of Employee");
         int value1= sc.nextInt();
         System.out.println("Enter the Sector");
          String value2= sc.next();

            List<CompanyName> companylist=new ArrayList<>();
        try (FileReader file  = new FileReader("/home/nmsadmin/Downloads/Fortune_1000_companies.csv");
             BufferedReader br = new BufferedReader(file))
        {
          String str;

            String[] position = new String[0];
            br.readLine();
            while (((str = br.readLine()) != null))
            {
              try {
                  position = str.split(",");

                  CompanyName obj = new CompanyName();
                  obj.setCompany(position[0]);
                  obj.setId(Integer.valueOf(position[1]));
                  obj.setRevenue(Double.valueOf(position[2]));
                  obj.setNoOfEmployee(Integer.valueOf(position[3]));
                  obj.setSector(position[4]);
                  obj.setCeo(position[5]);
                  companylist.add(obj);

              }
                catch(Exception e)
                {
                    CompanyName obj = new CompanyName();
                    obj.setCompany(position[0]);
                    obj.setId(Integer.valueOf(position[1]));
                    obj.setRevenue(Double.valueOf(position[2]));
                    obj.setNoOfEmployee(Integer.valueOf(position[3]));
                    obj.setSector(position[4]);
                    obj.setCeo(" ");
                    companylist.add(obj);

                }


            }
            for (CompanyName a : companylist)
            {
                if (value2.equals(a.getSector()) && (a.getNoOfEmployee() >= value1))
                {
                    System.out.println(a.getCompany() + "" + a.getCeo());
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(" Error Occured ");
        }
    }
}
