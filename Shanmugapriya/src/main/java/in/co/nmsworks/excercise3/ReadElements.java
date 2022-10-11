package in.co.nmsworks.excercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadElements {
    public static List<Integer> readFile(String filepath) throws Exception {

            List<Integer> integer = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String text;
        try {
            while ((text = br.readLine()) != null) {
                integer.add(Integer.parseInt(text));
            }
            //  System.out.println(integer);
            br.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
        return integer;

    }
}
