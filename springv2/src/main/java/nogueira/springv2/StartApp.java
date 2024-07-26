package nogueira.springv2;

import nogueira.springv2.model.User;
import nogueira.springv2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Claudio nogueira");
        user.setUsername("squallv777");
        user.setPassword("*******");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }

    }
}
