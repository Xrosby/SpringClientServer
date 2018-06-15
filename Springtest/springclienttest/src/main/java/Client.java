import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class Client implements IClient {


    /*
            RestTemplate restTemplate = new RestTemplate();
        GreetingDTO greeting = restTemplate.getForObject("http://localhost:8080/greeting?name=Mads", GreetingDTO.class);

        System.out.println("Her er et print af din greeting:\n" +
        greeting.toString());
        log.info(greeting.toString());

     */
    @Override
    public ArrayList<UserDTO> getUsers() {
        RestTemplate restTemplate = new RestTemplate();
        ArrayList<UserDTO> users = restTemplate.getForObject("http://localhost:8080/users/getAll", ArrayList.class);
        users.forEach(user -> System.out.println(user.toString()));
        return users;
    }

    @Override
    public UserDTO getUser(int id) {
        return null;
    }

    @Override
    public void addUser(UserDTO user) {

    }

    @Override
    public void deleteUser(int id) {

    }
}
