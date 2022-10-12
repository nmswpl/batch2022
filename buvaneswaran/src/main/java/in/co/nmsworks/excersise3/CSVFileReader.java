package in.co.nmsworks.excersise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFileReader {
    public static void companyDetails(String filePath) {
        Scanner sc = new Scanner(System.in);
        double noOfEmployee= sc.nextDouble();sc.nextLine();
        String sector= sc.nextLine();

        List<Company> list = new ArrayList<>();

        File file = new File(filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            br.readLine();
            while ((s = br.readLine()) != null) {
                String[] arr = s.split(",");
                String ceo;
                try {
                    ceo = arr[5];
                } catch (Exception e) {
                    ceo = "";
                }
                Company company1 = new Company(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), arr[4], ceo);
                list.add(company1);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        for (int i=0;i<list.size();i++)
        {
           if (list.get(i).sector.equals(sector) && list.get(i).numOfEmployees == noOfEmployee)
           {
               System.out.println(list.get(i).company + " , " + list.get(i).ceo);
           }
        }
    }


        public static void main(String[] args)
        {
            CSVFileReader.companyDetails("/home/nmsadmin/Downloads/Fortune_1000_companies.csv");
        }
}
