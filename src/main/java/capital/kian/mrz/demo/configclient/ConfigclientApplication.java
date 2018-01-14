package capital.kian.mrz.demo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }

    @Value("${name}")
    private String instanceName;

    @Value("${branch}")
    private String branch;


    @GetMapping("/whoami")
    public String instanceName() {
        return "Instance name: " + instanceName + ", branch: " + branch;
    }
}
