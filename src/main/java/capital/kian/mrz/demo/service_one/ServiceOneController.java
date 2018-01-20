package capital.kian.mrz.demo.service_one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

//    @Value("${second}")
//    private String service2; for showing could resolve config value from another config file

    @Value("${name}")
    private String instanceName;

    @Value("${branch}")
    private String branch;

    @GetMapping("/whoami")
    public String instanceName() {
        return "Instance name: " + instanceName + ", branch: " + branch;
    }
}
