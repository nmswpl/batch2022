package in.co.nmsworks.exercise3;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {


    public static void main(String[] args) throws Exception
    {

        FileRead file = new FileRead();
        List<Integer> list = file.fileRead("/home/nmsadmin/Downloads/Numbers.txt");
        duplicateNumber(list);
    }


    public static void duplicateNumber(@NotNull List<Integer> list)
    {
        Set<Integer> uniq = new HashSet<>();
       int count = 0;

       // for(Integer num :list)
        //if (uniq.contains(num))

        for (int i = 0; i < list.size(); i++)
        {
             if (uniq.contains(list.get(i)))
             {
                System.out.println(list.get(i));
                count++;
              }
            else {
                uniq.add(list.get(i));

            }
        }
        System.out.println("Duplicate count is : "+count);

    }
}