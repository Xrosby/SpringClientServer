package hello;

public class UserDTO {

    private String name;
    private Address address;
    private String birthday;
    private int id;

    public UserDTO(String name, Address address, String birthday, int id) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " | " + address.toString() + " | " + birthday + " | " + id;
    }
}
