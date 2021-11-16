package applicationpackage.controllers;

import applicationpackage.data.User;
import applicationpackage.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("login")
    public String goToLoginPage(Model model){
        model.addAttribute("user", new User("","",null));

        return "login";
    }

    @PostMapping("login2")
    public String reDiederiektToLoginPage(@ModelAttribute("user") User userReceived){
        System.out.println(userReceived.getUserName());
        System.out.println(userReceived.getPassWord());

        User user = userService.getUserByUserNameAndPassWord(userReceived.getUserName(), userReceived.getPassWord());

        if(user!=null) return "test";
        else return "login";
    }


}
