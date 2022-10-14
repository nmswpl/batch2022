package in.co.nmsworks.excercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyDetails {
    public static void main(String[] args) throws IOException {

        List<Company> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader("/home/nmsadmin/Downloads/Fortune_1000_companies.csv");
             BufferedReader br = new BufferedReader(fileReader)) {
            br.readLine();
            String str;
            while ((str = br.readLine()) != null) {
                String[] details = str.split(",");
                try
                {
                            list.add(new Company(details[0],
                            Integer.parseInt(details[1]),
                            Integer.parseInt(details[2]),
                            Integer.parseInt(details[3]),
                            details[4],
                            details[5]));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.err.println("Error");
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sector name : ");
        String sector = input.nextLine();
        System.out.println("\nEnter noOfEmployeesInput : ");
        int noOfEmp = input.nextInt();

        filter(list,sector,noOfEmp);

    }
    public static void filter(List<Company> list, String sector, int noOfEmp) {
        for(Company c : list) {
            if(c.getSector().equals(sector) && c.getNoOfEmp()==(noOfEmp)) {
                System.out.println("Name : " + c.getCompany() + ", CEO : " + c.getCEO());
            }
        }
    }
}
