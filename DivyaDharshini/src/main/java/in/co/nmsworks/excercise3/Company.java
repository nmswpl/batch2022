package in.co.nmsworks.excercise3;

public class Company {
    private final String  company;
    private final int id;
    private final int revenue;
    private final int noOfEmp;
    private final String sector;
    private final String CEO;

    public Company(String company, int id, int revenue, int noOfEmp, String sector, String CEO) {
        this.company = company;
        this.id = id;
        this.revenue = revenue;
        this.noOfEmp = noOfEmp;
        this.sector = sector;
        this.CEO = CEO;
    }
    public String getCompany() {
        return company;
    }
    public int getId(){
        return id;
    }
    public int getRevenue(){
        return revenue;
    }
    public int getNoOfEmp() {
        return noOfEmp;
    }
    public String getSector() {
        return sector;
    }
    public String getCEO() {
        return CEO;
    }

}
