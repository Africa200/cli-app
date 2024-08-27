package abdoul.net.cliapp;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.stringtemplate.v4.ST;

@ShellComponent
public class MyCustomeCommande {

    @ShellMethod(key = "hello")
    public String hello(@ShellOption(defaultValue = "World") String name,@ShellOption(defaultValue = "1") int cunter) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < cunter; i++) {
            stringBuilder.append(name).append("!"+ i +"\n");
        }
        return stringBuilder.toString();
    }


    @ShellMethod(key = "test")
    public String test(){
        return "test shell";
    }
}
