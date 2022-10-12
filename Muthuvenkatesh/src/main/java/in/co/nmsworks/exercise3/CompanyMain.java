package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sector name ");
        String sector = input.nextLine();
        System.out.print("Enter number of employee ");
        Double noOfEmployee = input.nextDouble();
        String filePath="/home/nmsadmin/Downloads/Fortune_1000_companies.csv";
        File file = new File(filePath);
        FileReader read = new FileReader(file);
        BufferedReader buffer = new BufferedReader(read);
        String line;
        buffer.readLine();
        List<Company> companies = new ArrayList<>();
        while((line = buffer.readLine())!=null){
            String[] split = line.split(",");
            Company company = new Company();
            try{
                if(split.length==6){
                    company.setName(split[0]);
                    company.setId(Integer.parseInt(split[1]));
                    company.setRevenue(Float.parseFloat(split[2]));
                    company.setNumOfEmployees(Double.parseDouble(split[3]));
                    company.setSector(split[4]);
                    company.setCeo(split[5]);
                    companies.add(company);
                }
                else {
                    company.setName(split[0]);
                    company.setId(Integer.parseInt(split[1]));
                    company.setRevenue(Float.parseFloat(split[2]));
                    company.setNumOfEmployees(Double.parseDouble(split[3]));
                    company.setSector(split[4]);
                    companies.add(company);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        //System.out.println(companies);
        for(Company c : companies){
            if(c.getSector().equals(sector) && c.getNumOfEmployees()>=noOfEmployee){
                System.out.println(c.getName()+" | " + c.getCeo());
            }
        }
        buffer.close();
    }
}