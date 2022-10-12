package in.co.nmsworks.excersise3;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company
{
    String company;
    double id;
    double revenue;
    double numOfEmployees;
    String sector;
    String ceo;
    public Company( String company,double id,double revenue,double numOfEmployees,String sector,String ceo)
    {
        this.company=company;
        this.id=id;
        this.revenue=revenue;
        this.numOfEmployees=numOfEmployees;
        this.sector=sector;
        this.ceo=ceo;
    }

    public String getCompany() {
        return company;
    }

    public double getId() {
        return id;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getNumOfEmployees() {
        return numOfEmployees;
    }

    public String getSector() {
        return sector;
    }

    public String getCeo() {
        return ceo;
    }
}