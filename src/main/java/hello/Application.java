package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class Application implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(Application.class);

  @Autowired
  UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    log.info("Application started 🏎");
  }

  @Override
  public void run(String... strings) throws Exception {
    userService.initialize();
    userService.getCustomer("Josh");
  }
}
