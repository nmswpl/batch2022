package in.co.nmsworks.excercise3;

import java.util.ArrayList;
import java.util.List;

import static in.co.nmsworks.excercise3.ReadElements.readFile;

public class Duplicate
{

    public static void main(String[] args)
    {
        try{

        List<Integer> listofinteger = readFile("/home/nmsadmin/Downloads/Numbers.txt");
        System.out.println("List of Integer :"+listofinteger);

        List<Integer> duplicate = new ArrayList<>();

        List<Integer> noduplicate = new ArrayList<>();


        for( int  integer : listofinteger)
        {
           if(noduplicate.contains(integer))
               duplicate.add(integer);
           else
               noduplicate.add(integer);
        }

        System.out.println("Duplicate = "+duplicate);
        }
        catch(Exception e)
        {
            System.out.println("Error");
            e.printStackTrace;
        }

    }
}