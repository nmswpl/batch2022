package in.co.nmsworks.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NumbersFile {
    public List<Integer> readData(String filepath)  {
        List<Integer> list1 = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));

            String lines;
            while ((lines = br.readLine()) != null) {
                int number = Integer.parseInt(lines);
//                lines = br.readLine();
                list1.add(number);
//            int c = Integer.parseInt(br.readLine());
            }
            br.close();
            System.out.println("file content " + list1);
//            for (int i = 0; i < list1.size(); i++)
//            {
//                for (int j = i + 1; j < list1.size(); j++)
//                {
//                    if (list1.get(i).equals(list1.get(j)))
//                    {
//                        System.out.print(list1.get(i)+" ");
//                    }
//                }
//            }


        } catch (Exception e) {
            e.printStackTrace();

        }

        return list1;
    }

}
