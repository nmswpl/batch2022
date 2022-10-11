package in.co.nmsworks.excercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadElements {
    public static List<Integer> readFile(String filepath) throws Exception {

            List<Integer> integer = new ArrayList<>();
            String text;

        try( FileReader fileReader = new FileReader(filepath);
               BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            while ((text = br.readLine()) != null) {
                integer.add(Integer.parseInt(text));
            }


        }
        return integer;

    }
}
