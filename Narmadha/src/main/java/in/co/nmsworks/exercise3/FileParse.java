package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FileParse {

    public static List<Integer> readTheFile(String filePath) throws Exception {
        File file = new File(filePath);
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String text;
        while ((text = br.readLine()) != null) {
            list.add(Integer.valueOf(text));

        }
        br.close();
        return list;
    }
    }























