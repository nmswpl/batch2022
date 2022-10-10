package in.co.nmsworks.excersice3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCreation {
        public List<Integer> fileRead(String filePath) throws Exception {
            File file=new File(filePath);
            BufferedReader fileContent =new BufferedReader(new FileReader(file));
            List<Integer> list=new ArrayList<>();
            String str="";
           while(((str = fileContent.readLine()) != null))
            {

                list.add(Integer.parseInt(str));
            }
//            System.out.println(list);
           fileContent.close();
           return list;
    }

}
