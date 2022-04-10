package ox.mox.oxanaApplication.CONTROLLERS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ox.mox.oxanaApplication.MODEL.User;
import ox.mox.oxanaApplication.BISNESS_LOGIC.UserSERVICE;

@Controller
@RequestMapping("/users")
public class UsersCONTROLLER {

    private final UserSERVICE userService;

    @Autowired
    public UsersCONTROLLER(UserSERVICE userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @GetMapping("/save")
    public String saveUserForm(@ModelAttribute("user") User user) {
        return "save";
    }

    @PostMapping
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "update";
    }

    @PatchMapping("/update/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.update(id, user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "show";
    }
}
