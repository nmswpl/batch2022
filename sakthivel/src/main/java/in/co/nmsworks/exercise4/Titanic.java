package in.co.nmsworks.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Titanic {
    public static void readingCSV(String filepath)
    {
        float classCountOne = 0;
        float classCountTwo = 0;
        float classCountThree = 0;

        float classOneSurvived = 0;
        float classTwoSurvived = 0;
        float classThreeSurvived = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int userAge = sc.nextInt();

        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            List<Passenger> listOfPassenger = new ArrayList<>();
            br.readLine();
            String[] fileLine = new String[0];
            while ((line = br.readLine()) != null) {
                fileLine = line.split(",");

              //  System.out.println(Arrays.toString(fileLine));
                Passenger p = new Passenger();
                p.setPassengerId(Integer.parseInt(fileLine[0]));
                p.setSurvived(Integer.parseInt(fileLine[1]));
                p.setpClass(Integer.parseInt(fileLine[2]));
                p.setName(fileLine[3]+fileLine[4]);
                p.setSex(fileLine[5]);
                p.setAge(Float.parseFloat(fileLine[6]));
                listOfPassenger.add(p);
            }

            for (Passenger a : listOfPassenger) {
                if (a.getAge()<=userAge)
                {
                    System.out.println(a.getPassengerId()+ "  "+a.getName());
                }
            }
            for(Passenger a : listOfPassenger) {
                if (a.getpClass() == 1) {
                    classCountOne++;
                    if (a.getSurvived() == 1) {
                        classOneSurvived++;
                    }
                } else if (a.getpClass() == 2) {
                    classCountTwo++;
                    if (a.getSurvived() == 1) {
                        classTwoSurvived++;
                    }
                } else {
                    classCountThree++;
                    if (a.getSurvived() == 1) {
                        classThreeSurvived++;
                    }
                }
            }
            System.out.println(" class One Average : "+(classOneSurvived/classCountOne)*100);
            System.out.println(" class Two Average : "+(classTwoSurvived/classCountTwo)*100);
            System.out.println(" class Three Average : "+(classThreeSurvived/classCountThree)*100);
        }
        catch (Exception er)
        {
            er.printStackTrace();
        }

    }

    public static void main(String[] args) {
        readingCSV("/home/admin/Downloads/titanic.csv");
    }


}
