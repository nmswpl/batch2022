package in.co.nmsworks.exercisethree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
        public List<Integer> fileParser(String filepath)
        {
        List<Integer> numbersList = new ArrayList<>();
        try ( FileReader read = new FileReader(filepath);
              BufferedReader br = new BufferedReader(read)){
                String i;
                while ((i = br.readLine()) != null)
                {
                        numbersList.add(Integer.valueOf(i));
                }
        }
        catch (Exception e) {
                e.printStackTrace();
        }
        return numbersList;
    }
}
