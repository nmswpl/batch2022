package in.co.nmsworks.exercise3;

public class Company {
    private String name;
    private int id;
    private Float revenue;
    private Double numOfEmployees;
    private String sector;
    private String ceo;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getRevenue() {
        return revenue;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public Double getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(Double numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", revenue=" + revenue +
                ", numOfEmployees=" + numOfEmployees +
                ", sector='" + sector + '\'' +
                ", ceo='" + ceo + '\'' +"\n";
    }
}
