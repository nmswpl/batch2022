package in.co.nmsworks.Training;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class CompanyFile
{
    public static void main(String[] args) throws IOException
    {


        String filePath ="/home/nmsadmin/Downloads/Fortune_1000_companies.csv";
        List<Company> company = fileReader(filePath);

       searchSector(company);


    }

    private static void searchSector(List<Company> company)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sector: ");
        String sector = sc.nextLine();
        System.out.println("Enter Employee count: ");
        int empCount = sc.nextInt();

        for(Company c:company)
        {
            if(c.getSector().equalsIgnoreCase(sector) && c.getNumofemp()>=empCount)
                System.out.println("Name : " + c.getCompanyName() + ", CEO : " + c.getCeo());

        }
    }

    private static List<Company> fileReader(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String strCurrentLine;

        List<Company> companyList = new ArrayList<>();

        br.readLine();
        while ((strCurrentLine = br.readLine()) != null)
        {
            String[] currentLine  = strCurrentLine.split(",");
            companyList.add(new Company(currentLine[0],Integer.parseInt(currentLine[1]),Float.parseFloat(currentLine[2]),Integer.parseInt(currentLine[3]),currentLine[4],currentLine[3]));
        }

        return companyList;
    }
    public static void saveCompanyDetails(List<Company> companies) throws Exception {
        String createQuery = "CREATE TABLE company_details (Name VARCHAR(100), " +
                "id INT," +
                "Revenue DOUBLE," +
                "No_of_employees INT," +
                "Sector VARCHAR(50)," +
                "CEO VARCHAR(50))";

        String insertQuery = "INSERT INTO company_details VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Training");
            PreparedStatement createStmt = conn.prepareStatement(createQuery);
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

            createStmt.executeUpdate();

            for(Company c : companies) {
                insertStmt.setString(1, c.getCompanyName());
                insertStmt.setInt(2, c.getId());
                insertStmt.setDouble(3, c.getRevenue());
                insertStmt.setFloat(4, c.getNumofemp());
                insertStmt.setString(5, c.getSector());
                insertStmt.setString(6, c.getCeo());

                insertStmt.executeUpdate();
            }
        }
    }
}
