package ox.mox.oxanaApplication.CONTROLLERS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeCONTROLLER {

    @GetMapping
    public String printWelcome() {
        return "index";
    }
}
