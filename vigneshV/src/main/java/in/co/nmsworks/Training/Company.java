package in.co.nmsworks.Training;

public class Company
{
    private String companyName;
    private int id;
    private float revenue;
    private int numofemp;

    private String sector;
    private String ceo;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public void setNumofemp(int numofemp) {
        this.numofemp = numofemp;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public float getNumofemp() {
        return numofemp;
    }

    public String getSector() {
        return sector;
    }
    public String getCeo() {
        return ceo;
    }
    public Company(String companyName, int id, float revenue, int numofemp, String sector, String ceo) {
        this.companyName = companyName;
        this.id = id;
        this.revenue = revenue;
        this.numofemp = numofemp;
        this.sector = sector;
        this.ceo = ceo;

    }
}
