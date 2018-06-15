import java.util.ArrayList;

public interface IClient {

    public ArrayList<UserDTO> getUsers();
    public UserDTO getUser(int id);
    public void addUser(UserDTO user);
    public void deleteUser(int id);

}
