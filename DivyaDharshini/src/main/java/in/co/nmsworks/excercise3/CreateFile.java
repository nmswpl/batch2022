package in.co.nmsworks.excercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class CreateFile {

    public List<Integer> readFile(String filePath) throws Exception {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        List<Integer> integers=new ArrayList<>();
        while ((str = br.readLine()) != null) {
            integers.add(Integer.valueOf(str));
        }
        return integers;
    }
}
