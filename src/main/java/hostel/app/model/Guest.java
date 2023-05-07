package hostel.app.model;
public class Guest {
    private String name;
    private String lastName;
    private Information information;

    public Guest() {
        this("");
    }
    public Guest(String name){
        this(name, "");
    }

    public Guest(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.information=new Information();
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.length() > 2) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdress(String adress)
    {
        information.setAdress(adress);
    }
    public String getZipCode(){return information.getZipCode();}
    public void setZipCode(String zipCode){information.setZipCode(zipCode);};
    public String getCountry(){return information.getCountry();}
    public void setCountry(String country){information.setCountry(country);}
    public String getCity(){return information.getCity();}
    public void setCity(String city){information.setCity(city);}
    public String getNumberAdress(){return information.getNumberAdress();}
    public void setNumberAdress(String numberAdress){information.setNumberAdress(numberAdress);}
    public String getContact(){return information.getContact();}
    public void setContact(String contact){information.setContact(contact);}
}