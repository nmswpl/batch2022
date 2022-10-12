package in.co.nmsworks.training;

public class Company
{
    private String company;
    private long id;
    private float revenue;
    private long noOfEmployees;
    private String sector;
    private String ceo;

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setRevenue(float revenue)
    {
        this.revenue = revenue;
    }

    public void setNoOfEmployees(long noOfEmployees)
    {
        this.noOfEmployees = noOfEmployees;
    }

    public void setSector(String sector)
    {
        this.sector = sector;
    }

    public void setCeo(String ceo)
    {
        this.ceo = ceo;
    }

    public String getCompany()
    {
        return company;
    }

    public long getId()
    {
        return id;
    }

    public float getRevenue()
    {
        return revenue;
    }

    public long getNoOfEmployees()
    {
        return noOfEmployees;
    }

    public String getSector()
    {
        return sector;
    }

    public String getCeo()
    {
        return ceo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", id=" + id +
                ", revenue=" + revenue +
                ", noOfEmployees=" + noOfEmployees +
                ", sector='" + sector + '\'' +
                ", ceo='" + ceo + '\'' +
                '}';
    }
}
