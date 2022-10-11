package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FetchData {
    public static List<Integer> readFileAndGetIntList(String path) {
        List<Integer> arrayList = new ArrayList<>();

        try ( FileReader fileReader = new FileReader(path);
              BufferedReader bf = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bf.readLine()) != null) {

                arrayList.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arrayList;
    }
}
