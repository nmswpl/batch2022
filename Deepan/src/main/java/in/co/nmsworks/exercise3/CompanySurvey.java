package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanySurvey {

    public static List<Company> CSVParser(String path){

        //Object collection of Company
        List<Company> companyList = new ArrayList<>();


        //Parsing the CSV File
        File file = new File(path);
        try(FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader))
        {
            br.readLine();
            String line;
            while ( (line = br.readLine()) != null)
            {
                String[] column = line.split(",");

                //Using try catch to skip the missing index(column)
                try
                {
                    String tempCompany = column[0];
                    int tempId  = Integer.parseInt(column[1]);
                    double tempRevenue = Double.parseDouble(column[2]);
                    int tempEmployeeCount = Integer.parseInt(column[3]);
                    String tempSector = column[4];
                    String tempCeo = column[5];

                    Company company = new Company(tempCompany,tempId,tempRevenue,tempEmployeeCount,tempSector,tempCeo);
                    companyList.add(company);
                }
                catch (Exception e)
                {
                    String tempCompany = column[0];
                    int tempId  = Integer.parseInt(column[1]);
                    double tempRevenue = Double.parseDouble(column[2]);
                    int tempEmployeeCount = Integer.parseInt(column[3]);
                    String tempSector = column[4];
                    String tempCeo = null;
                    System.out.println("Some Index is not there");
                    Company company = new Company(tempCompany,tempId,tempRevenue,tempEmployeeCount,tempSector,tempCeo);
                    companyList.add(company);
                }

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return companyList;
    }

    public static void writeIntoDB(List<Company> companyList) throws SQLException {
        PreparedStatement stmt = null;
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/Training"))
        {
            stmt = connection.prepareStatement("insert into Companies values (?,?,?,?,?,?)");
            for (Company cmp : companyList)
            {
                stmt.setString(1,cmp.getCompanyName());
                stmt.setInt(2,cmp.getId());
                stmt.setDouble(3,cmp.getRevenue());
                stmt.setInt(4,cmp.getNoOfEmployees());
                stmt.setString(5,cmp.getSector());
                stmt.setString(6,cmp.getCeo());

                stmt.executeUpdate();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            if (stmt != null)
                stmt.close();
        }
    }

    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        String path = "/home/nmsadmin/Downloads/Fortune_1000_companies.csv";
        List<Company> companyList =  CSVParser(path);

        try
        {
            writeIntoDB(companyList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        //Sorting the Company Objects respective to the user input
        System.out.println("Enter the Sector: ");
        String sector = get.nextLine();
        System.out.println("Enter the Employee count: ");
        int empCount = get.nextInt();

        for (Company comp : companyList)
        {
            if (comp.getSector().equals(sector) && comp.getNoOfEmployees() >= empCount)
            {
                System.out.println("Company Name: " +comp.getCompanyName()+ "       CEO: "+comp.getCeo());
            }
        }

    }
}
