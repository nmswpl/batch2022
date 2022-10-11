package in.co.nmsworks.excercise3;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Count
{
  public int count(List<Integer> num) throws Exception {
      Map<Integer, Integer> map1 = new HashMap<>();
      for (int i : num) {
          if (map1.containsKey(i)) {
              int count = map1.get(i);
              map1.put(i, count + 1);
          } else
          {
              map1.put(i, 1);
          }
      }
      System.out.println(map1);
      return map1.size();
  }

    public static void main(String[] args)throws Exception {

        ReadFile createFile =new ReadFile();
        String filePath="/home/nmsadmin/Downloads/Numbers.txt";
        List<Integer> a= ReadFile.readFile(filePath);
        System.out.println(a);

        Count number=new Count();
        System.out.println(number.count(a));
    }
  }


