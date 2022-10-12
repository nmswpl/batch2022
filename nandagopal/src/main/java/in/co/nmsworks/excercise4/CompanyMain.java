package in.co.nmsworks.excercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. create objects for each row in csv files.
// 2. loop through list of objects and get specific object based on condition
// 3. put objects values in new mysql table.

public class CompanyMain {
    public static void filterCompanies(List<Company> companies, String sector, int employeeCount) {
        for(Company c : companies) {
            if(c.getSector().equals(sector) && c.getNoOfEmployees() > employeeCount) {
                System.out.println("Name : " + c.getName() + ", CEO : " + c.getCeo());
            }
        }
    }
    public static List<Company> getCompanyListFromFile(String filePath) {
        List<Company> companies = new ArrayList<>();

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            br.readLine(); // for skip header row

            String line;
            while ((line = br.readLine()) !=null) {
                String[] details = line.split(",");

                try {
                    companies.add(new Company(details[0],
                            Integer.parseInt(details[1]),
                            Double.parseDouble(details[2]),
                            Integer.parseInt(details[3]),
                            details[4],
                            details[5]));
                }
                catch (Exception e) {
                    System.err.println("Some column values are missing");
                }

            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return companies;
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
                insertStmt.setString(1, c.getName());
                insertStmt.setInt(2, c.getId());
                insertStmt.setDouble(3, c.getRevenue());
                insertStmt.setInt(4, c.getNoOfEmployees());
                insertStmt.setString(5, c.getSector());
                insertStmt.setString(6, c.getCeo());

                insertStmt.executeUpdate();
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "/home/nmsadmin/Desktop/Training/assetFiles/Fortune_1000_companies.csv";
        List<Company> companies = getCompanyListFromFile(filePath);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter sector name : ");
        String sectorInput = in.nextLine();
        System.out.println("\nEnter noOfEmployeesInput : ");
        int noOfEmployeesInput = in.nextInt();

        filterCompanies(companies, sectorInput, noOfEmployeesInput);

        try{
            saveCompanyDetails(companies);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
