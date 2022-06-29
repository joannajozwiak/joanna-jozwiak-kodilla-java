package com.kodilla.good.patterns.food2door;

public class Producent implements IProducent{
    private String companyName;
    private String comapnyAdress;

    public Producent(String companyName, String comapnyAdress) {
        this.companyName = companyName;
        this.comapnyAdress = comapnyAdress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getComapnyAdress() {
        return comapnyAdress;
    }

    @Override
    public void process () {
        System.out.println("Zrealizuj zamówienie");

    }
}
