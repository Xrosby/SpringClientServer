import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        GreetingDTO greeting = restTemplate.getForObject("http://localhost:8080/greeting?name=Mads", GreetingDTO.class);

        System.out.println("Her er et print af din greeting:\n" +
        greeting.toString());
        log.info(greeting.toString());
    }


}
