package hostel.app.model;

public class Information {
    private String adress;
    private String zipCode;
    private String country;
    private String city;
    private String numberAdress;
    private String contact;
    public String getAdress()
    {
        return adress;
    }
    public void setAdress(String adress)
    {
        this.adress = adress;
    }
    public String getZipCode(){return zipCode;}
    public void setZipCode(String zipCode){this.zipCode = zipCode;}
    public String getCountry(){return country;}
    public void setCountry(String country){this.country = country;}
    public String getCity(){return city;}
    public void setCity(String city){this.city=city;}
    public String getNumberAdress(){return numberAdress;}
    public void setNumberAdress(String numberAdress){this.numberAdress = numberAdress;}
    public String getContact(){return contact;}
    public void setContact(String contact){this.contact = contact;}
}
