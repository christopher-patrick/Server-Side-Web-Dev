package edu.cpp.test1.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.*;
@RestController
public class FunRestController {
    Logger log = LoggerFactory.getLogger(FunRestController.class);
    // "/" means the URL is http://localhost:8080/, the output is "Hello World! ..."
    @Value("${adminEmail}")
    private String email;
    @GetMapping("/email")
    public String getEmail(){
        return "Admin email: " + email;
    } // end of getEmail()
    @GetMapping("/")
    public String sayHello() {
        System.out.println("System.out.println(): in sayHello() method.");
        log.info("logging: In sayHello() method.");
        return "Hello World!";
    }
    @GetMapping("/name/{guest}/id/{id}")
    public String hello(@PathVariable String guest, @PathVariable int id, @RequestParam int group) {
        return "Hello " + guest + ", your id is " + id + ", your group number is " + group;
    }

    @GetMapping("/work")
    public String work() {
        return "Make five copies of the memo";
    }
}