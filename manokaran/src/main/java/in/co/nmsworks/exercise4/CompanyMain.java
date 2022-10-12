package in.co.nmsworks.exercise4;
// Get Company name and Company CEO if input Sector equals Company sector
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sector : ");
        String inputSector = input.next();
        System.out.print("Enter noOfEmployees : ");
        Integer inputEmp = input.nextInt();
        String filepath = "/home/nmsadmin/Downloads/Fortune_1000_companies.csv";
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
        {
            br.readLine();
            List<Company> companyList = new ArrayList<>();
            while ((line = br.readLine()) != null)
            {
                String[] row = line.split(",");
                if(row.length == 6)
                {
                    Company c = new Company(row[0],Integer.parseInt(row[1]),Double.parseDouble(row[2]),Integer.parseInt(row[3]),row[4],row[5]);
                    companyList.add(c);
                }
                else
                {
                    Company c = new Company(row[0],Integer.parseInt(row[1]),Double.parseDouble(row[2]),Integer.parseInt(row[3]),row[4],null);
                    companyList.add(c);
                }
            }
            for (Company company : companyList)
            {
                if(company.getSector().equals(inputSector) && company.getNoOfEmployees() > inputEmp)
                {
                    System.out.println("Company Name : " + company.getCompanyName() + " // " + "Company CEO : " + company.getCEO());
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
