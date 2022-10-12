package in.co.nmsworks.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CsvFileCompare {
    public static void main(String[] args)
    {
       CsvFileCompare o = new CsvFileCompare();
       o.compareValue();
    }

    public void compareValue() {
        try {

            File file = new File("/home/nmsadmin/Downloads/Fortune_1000_companies.csv");
            FileReader reader = new FileReader(file);

            BufferedReader br = new BufferedReader(reader);


            List<Company> list = new ArrayList<>();
            String s;
            String[] c = new String[0];
            br.readLine();
            String ceo;


            while ((s = br.readLine()) != null) {

                c = s.split(",");

                Company obj = new Company();
                obj.setCompany_Name(c[0]);
                obj.setId(Integer.parseInt(c[1]));
                obj.setRevenue(Float.parseFloat(c[2]));
                obj.setNo_of_employee(Integer.parseInt(c[3]));
                obj.setSector(c[4]);
                try {
                    ceo = c[5];
                } catch (Exception e) {
                    ceo = "";
                }
                obj.setCeoName(ceo);

                list.add(obj);

            }
//            System.out.println(list);
            Scanner p = new Scanner(System.in);
            System.out.println("Enter sector:");
            String val = p.next();
            System.out.println("Enter no of Employees:");
            int no_emp = p.nextInt();

            for (Company company : list) {
//
//
                if ((val.equals(company.getSector())) && (company.getNo_of_employee()>=no_emp)) {
                    System.out.println(company.getCompany_Name()+"  "+company.getCeoName());
                }


//

//
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.err.println("error");

        }


//
//        }

    }
}


