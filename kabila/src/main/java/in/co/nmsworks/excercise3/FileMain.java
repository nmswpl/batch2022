package in.co.nmsworks.excercise3;
import java.util.List;

public class FileMain
    {
        public static void main(String [] args) throws Exception
        {
            ReadFile createFile =new ReadFile();
            String filePath="/home/nmsadmin/Downloads/Numbers.txt";
            List<Integer> a= createFile.readFile(filePath);
            System.out.println(a);
            DuplicateFile duplicate=new DuplicateFile();
            System.out.println(duplicate.duplicateFile(a));
        }

    }

