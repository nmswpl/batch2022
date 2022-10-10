package in.co.nmsworks.exercise3;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate
{
  public static List<Integer> toFindDuplicate(List<Integer> a)
  {
     List<Integer> dupli=new ArrayList<>();
      for (int i = 0; i < a.toArray().length; i++)
      {
          for (int j = i + 1; j < a.toArray().length; j++)
          {
              if (a.get(i) .equals( a.get(j)))
              {
                  dupli.add(a.get(j));
              }
          }
      }
      return dupli;
  }
}
