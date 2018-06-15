package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class UserController {



    private AtomicLong counter = new AtomicLong(4);
    private IUserManageable userManagement = new UserManagement();


    @RequestMapping(value = "/users/get", method = RequestMethod.GET)
    public ResponseEntity<UserDTO> getUser(@RequestParam int id) {
        UserDTO user = userManagement.getUser(id);
        return new ResponseEntity<UserDTO>(user, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/users/getAll", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<UserDTO>> getUsers() {
        ArrayList<UserDTO> users = userManagement.getUsers();
        return new ResponseEntity<ArrayList<UserDTO>>(users, HttpStatus.ACCEPTED);
    }



    //Vi skal finde ud af hvorfor det ikke virker når vi adder PUT og DELETE
    @RequestMapping(value = "/users/addUser")
    public ResponseEntity<String> addUser(@RequestParam String name, @RequestParam String city, @RequestParam String street, @RequestParam int streetNumber, @RequestParam String birthday) {

        System.out.println("YOU GOT THIS FAR");

        UserDTO user = new UserDTO(name, new Address(city, street, streetNumber), birthday, (int)counter.incrementAndGet());
        userManagement.addUser(user);
        return new ResponseEntity<String>(user.getName() + " was succesfully added", HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/users/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam int id) {
        String user = userManagement.getUser(id).getName();
        userManagement.deleteUser(id);
        return new ResponseEntity<String>(user + " has been deleted", HttpStatus.ACCEPTED);
    }



}
