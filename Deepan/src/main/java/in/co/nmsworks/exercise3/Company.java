package in.co.nmsworks.exercise3;
public class Company {

    private String companyName;
    private int id;
    private double revenue;
    private int noOfEmployees;
    private String sector;
    private String ceo;

    public Company(String companyName, int id, double revenue, int noOfEmployees, String sector, String ceo)
    {
        this.companyName = companyName;
        this.id = id;
        this.revenue = revenue;
        this.noOfEmployees = noOfEmployees;
        this.sector = sector;
        this.ceo = ceo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public String getSector() {
        return sector;
    }

    public String getCeo() {
        return ceo;
    }
}
