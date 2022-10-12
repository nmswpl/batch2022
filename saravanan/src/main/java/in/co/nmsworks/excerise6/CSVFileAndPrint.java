package in.co.nmsworks.excerise6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFileAndPrint
{
    public static void main(String[] args)
    {
         List<CompanyClass> l =new ArrayList<>();
         CompanyClass obj = null;
        Scanner sc =new Scanner(System.in);
     //   System.out.println("enter the no of emp");
        int emp =1000;
      //  System.out.println("enter the sector");
         String  sector="Energy";

        try
        {
            FileReader fr = new FileReader("/home/nmsadmin/Downloads/Fortune_1000_companies.csv");
            BufferedReader r = new BufferedReader(fr);
            String s;
            r.readLine();
            while ((s=r.readLine())!=null)
            {   String[] split =s.split(",");
                String temp;
                try
                {
                    temp = split[5];
                }
                catch (Exception e)
                {
                   temp = "";
                }
                obj= new CompanyClass(split[0],Integer.parseInt(split[1]),Integer.parseInt(split[3]),Float.parseFloat(split[2]),split[4],temp);
                l.add(obj);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < l.size(); i++)
        {
           String com =l.get(i).sector;
           int  ce =l.get(i).noOfEmp;
           String c =l.get(i).company;
           String q=l.get(i).ceo;
           if(com.equals(sector)&& emp <= ce )
           {
               System.out.println(c+" "+" "+q);
           }
        }



    }

}
