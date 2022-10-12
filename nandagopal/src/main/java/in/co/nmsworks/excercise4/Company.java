package in.co.nmsworks.excercise4;

public class Company {
    private String name;
    private int id;
    private double revenue;
    private int noOfEmployees;
    private String sector;
    private String ceo;

    public Company(String name, int id, double revenue, int noOfEmployees, String sector, String ceo) {
        this.name = name;
        this.id = id;
        this.revenue = revenue;
        this.noOfEmployees = noOfEmployees;
        this.sector = sector;
        this.ceo = ceo;
    }

    public String getName() {
        return name;
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
