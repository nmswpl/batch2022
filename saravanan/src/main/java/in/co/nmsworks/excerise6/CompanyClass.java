package in.co.nmsworks.excerise6;

import java.util.List;
import java.util.Objects;

public class CompanyClass
{
      String company;
      String ceo;
      String sector;
      int id;
      int noOfEmp;
      float revenue;

    public CompanyClass(String a,int b,int c,float d,String e,String f)

    {
       this.company = a;
       this.id=b;
       this.noOfEmp=c;
       this.revenue=d;
       this.sector=e;
       this.ceo =f;
    }

    public String getCompany() {
        return company;
    }

    public String getCeo() {
        return ceo;
    }

    public String getSector() {
        return sector;
    }

    public int getId() {
        return id;
    }

    public int getNoOfEmp() {
        return noOfEmp;
    }

    public float getRevenue() {
        return revenue;
    }
}
