package in.co.nmsworks.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CompanyMain
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("sector: ");
        String sector=sc.nextLine();
        System.out.println("enter no of employees");
        int employeeCount=sc.nextInt();
            String rows;
            List<Company> companyList = new ArrayList<>();
            try(BufferedReader br = new BufferedReader(new FileReader("/home/nmsadmin/Downloads/Fortune_1000_companies.csv")))
            {
                rows = br.readLine();

                while ((rows = br.readLine()) != null)
                {
                    String[] words = rows.split(",");
                    Company c = new Company();
                    c.setCompany(words[0]);
                    c.setId(Long.parseLong(words[1]));
                    c.setRevenue(Float.parseFloat(words[2]));
                    c.setNoOfEmployees(Long.parseLong(words[3]));
                    c.setSector(words[4]);
                    try {
                        c.setCeo(words[5]);
                    }
                    catch (Exception e)
                    {
                        c.setCeo("ceo not found");
                    }
                    companyList.add(c);
                }
               // System.out.println(companyList);

               for (Company com:companyList)
               {
                    if(com.getSector().equalsIgnoreCase(sector)&&com.getNoOfEmployees()>=employeeCount)
                    {
                        System.out.println(com.getCompany()+" - "+com.getCeo());
                    }
               }
            }
    }
}
