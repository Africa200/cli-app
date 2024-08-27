package abdoul.net.cliapp;

import org.jline.utils.AttributedString;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.jline.PromptProvider;

@Configuration
public class CustomeShellPrompt implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return new AttributedString("abdoul> ");
    }
}
