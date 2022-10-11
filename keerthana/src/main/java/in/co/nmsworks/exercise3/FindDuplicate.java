package in.co.nmsworks.exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate
{
  public static List<Integer> toFindDuplicate(List<Integer> list)
  {
     Set<Integer> duplicate=new HashSet<>();

      for(int i:list)
      {
          int count=0;
          if (duplicate.contains(i))
          {
              count++;
              System.out.println("Duplicate:" + i+" ");


          } else
          {
              duplicate.add(i);
          }
      }

      return list;
  }
}
