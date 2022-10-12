package in.co.nmsworks.exercise4;

public class Company
{
    private String companyName;
    private Integer id;
    private Double revenue;
    private Integer noOfEmployees;
    private String sector;
    private String CEO;

    public Company(String companyName, Integer id, Double revenue, Integer noOfEmployees, String sector, String CEO) {
        this.companyName = companyName;
        this.id = id;
        this.revenue = revenue;
        this.noOfEmployees = noOfEmployees;
        this.sector = sector;
        this.CEO = CEO;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getId() {
        return id;
    }

    public Double getRevenue() {
        return revenue;
    }

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public String getSector() {
        return sector;
    }

    public String getCEO() {
        return CEO;
    }
}
