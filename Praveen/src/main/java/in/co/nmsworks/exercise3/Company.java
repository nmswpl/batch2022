package in.co.nmsworks.exercise3;

public class Company {

    public static void main(String[] args) {


    }
  private String company_Name;
    private int id;
    private float revenue;
    private int no_of_employee;
    private String sector;
    private String ceoName;
    public Company()
    {

    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public int getNo_of_employee() {
        return no_of_employee;
    }

    public void setNo_of_employee(int no_of_employee) {
        this.no_of_employee = no_of_employee;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }
}
