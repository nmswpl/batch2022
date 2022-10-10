package in.co.nmsworks.Excersice2;

import java.sql.Time;

public  class check
{
    public static void main(String[] args)
    {
        String str = "8459761203";
        String ans =  "5439";
        char ch;
        char ch1;
        int max = 0;
        int op  = 0;
        for (int i = 0  ;  i  < ans.length(); i++)
        {
            ch = ans.charAt(i);
            for (  int j = 0 ;  j < str.length(); j++)
            {
                ch1 = str.charAt(j);
                if(ch == ch1)
                {
//                    if(max <  str.indexOf(ch1))
//                    {
//                        max = str.indexOf(ch1);
//                    }
                    op += str.indexOf(ch1);
                }

            }
        }
//        op = op - max ;
        System.out.println(op);


    }

}