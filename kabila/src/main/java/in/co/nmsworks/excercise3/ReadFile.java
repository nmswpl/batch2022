package in.co.nmsworks.excercise3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
    public class ReadFile
    {
        public  static List<Integer> readFile(String filePath) throws Exception
        {
            List<Integer> arr=new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String strg;
            while((strg = reader.readLine())!=null)
            {
                arr.add(Integer.parseInt(strg));
            }

            System.out.println(arr);
            reader.close();
            return arr;
        }

        public static void main(String[] args) throws Exception
        {
            ReadFile file1 = new ReadFile();
            List<Integer> cls = file1.readFile("/home/nmsadmin/Downloads/Numbers.txt");
        }
    }



