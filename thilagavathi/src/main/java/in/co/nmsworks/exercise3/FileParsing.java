package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParsing {
    public static List<Integer> readFileUsingBufferedReader(String filepath) throws IOException {
        File ff = new File(filepath);
        FileReader fr = new FileReader(ff);
        BufferedReader br = new BufferedReader(fr);
        String lines;
        List<Integer> list = new ArrayList<Integer>();
        while ((lines = br.readLine()) != null) {
            list.add(Integer.parseInt(lines));
        }
        System.out.println("content " + list);
        br.close();
        return list;
      }

    }


