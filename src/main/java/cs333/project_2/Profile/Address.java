package cs333.project_2.Profile;

public class Address
{
    String Street;
    String City;
    String State;
    int Zipcode;

    //constructor

    public Address(String street,String city,String state,int zipcode){
        this.Street = street;
        this.City = city;
        this.State = state;
        this.Zipcode = zipcode;
    }

    //getters

    public String getStreet(){
        return this.Street;
    }

    public String getCity(){
        return this.City;
    }

    public String getState(){
        return this.State;
    }

    public int getZipcode(){
        return this.Zipcode;
    }

    //setters

    public void setStreet(String street){
        this.Street = street;
    }

    public void setCity(String city){
        this.City = city;
    }

    public void setState(String state){
        this.State = state;
    }

    public void setZipcode(int zipcode){
        this.Zipcode = zipcode;
    }

}