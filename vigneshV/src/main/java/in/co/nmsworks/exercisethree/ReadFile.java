package in.co.nmsworks.exercisethree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
        public List<Integer> fileParser(String filepath) throws IOException
        {
        FileReader read = new FileReader(filepath);
        BufferedReader br = new BufferedReader(read);
        String i;
        List<Integer> numbersList = new ArrayList<>();
        ArrayList<Integer> duplicateNumbers = new ArrayList<>();
        while ((i = br.readLine()) != null)
        {
            numbersList.add(Integer.valueOf(i));
        }


        br.close();
        return numbersList;
    }
}
