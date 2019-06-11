package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public Customer getCustomerByName(@RequestParam(value = "first_name") String firstName) {
        return userService.getCustomer(firstName);
    }

    @RequestMapping("/users")
    public List<Customer> getCustomers() {
        return userService.getCustomers();
    }
}
