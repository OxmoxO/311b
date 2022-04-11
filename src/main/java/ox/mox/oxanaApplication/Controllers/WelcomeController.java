package ox.mox.oxanaApplication.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping
    public String printWelcome() {
        return "index";
    }
}
