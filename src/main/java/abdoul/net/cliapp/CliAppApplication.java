package abdoul.net.cliapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.command.annotation.EnableCommand;

@SpringBootApplication
public class CliAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CliAppApplication.class, args);
    }

}
