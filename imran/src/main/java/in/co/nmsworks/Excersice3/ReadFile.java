package in.co.nmsworks.Excersice3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile
{
    public static List<Integer> readfile(String str)
    {
        try( BufferedReader br = new BufferedReader(new FileReader(str)))
        {

            List<Integer> mylist = new ArrayList<>();
            String ans;
            int value;
            while ((ans =br.readLine()) != null)
            {
                value = Integer.parseInt(ans);
                mylist.add(value);
            }

//            System.out.println(mylist);
            
//            Set myset = new HashSet();
//            for ( int i : mylist)
//            {
//                  myset.add(i);
//            }
//            System.out.println(myset);
            return mylist;
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

}
