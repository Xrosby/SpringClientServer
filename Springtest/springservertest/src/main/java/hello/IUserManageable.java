package hello;

import java.util.ArrayList;

public interface IUserManageable {

    public void deleteUser(int id);
    public void addUser(UserDTO user);
    public ArrayList<UserDTO> getUsers();
    public UserDTO getUser(int id);
}
