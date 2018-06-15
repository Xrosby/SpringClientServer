package hello;

public class Address {

    private String city;
    private String street;
    private int streetNumber;

    public Address(String city, String street, int streetNumber) {
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }
}
