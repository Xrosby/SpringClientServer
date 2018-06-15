package hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserManagement implements IUserManageable {

    private HashMap<Integer, UserDTO> users;

    public UserManagement() {
        users = createUserLibrary();
    }


    @Override
    public void deleteUser(int id) {
        users.remove(id);
        System.out.println("User with id " + id + ", has been deleted");

    }

    @Override
    public void addUser(UserDTO user) {
        users.put(user.getId(), user);
        System.out.println(user.toString() + "\n" + user.getName() + " has been added to the repository");
    }

    @Override
    public ArrayList<UserDTO> getUsers() {
        return getSpoofUsers();
    }

    @Override
    public UserDTO getUser(int id) {
        return users.get(id);
    }

    public HashMap<Integer, UserDTO> createUserLibrary() {

        HashMap<Integer, UserDTO> users = new HashMap<>();

        Address address1 = new Address("Odense", "Lolstreet", 17);
        Address address2 = new Address("Karlslunde", "Karlsgade", 10);
        Address address3 = new Address("Kolleren", "Ternevej", 4);
        Address address4 = new Address("Frede", "Falkevej", 100);

        UserDTO user1 = new UserDTO("Mads", address1, "171091", 1);
        UserDTO user2 = new UserDTO("Martin", address2, "180589", 2);
        UserDTO user3 = new UserDTO("Siftrolla", address3, "201016", 3);
        UserDTO user4 = new UserDTO("Lasse", address4, "091001", 4);


        users.put(user1.getId(), user1);
        users.put(user2.getId(), user2);
        users.put(user3.getId(), user3);
        users.put(user4.getId(), user4);

        return users;

    }

    private ArrayList<UserDTO> getSpoofUsers() {

        ArrayList<UserDTO> userList = new ArrayList<>();

        for(Map.Entry<Integer, UserDTO> user : users.entrySet()) {
            userList.add(user.getValue());
        }

        return userList;

    }
}
