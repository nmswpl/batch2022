package in.co.nmsworks.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAFile {

    public List<Integer> fileParse(String filePath) {
        List<Integer> list = new ArrayList<>();
        try {

            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String str;

            while ((str = br.readLine()) != null) {
                list.add(Integer.parseInt(str));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;



    }

}
