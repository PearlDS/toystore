package applicationpackage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

    @GetMapping("hi")
    public String helloMethod(){
        return "test";
    }

    //old ass code don't use
    @GetMapping("hoi")
    public ModelAndView helloMethod2(){
        String text = "Hello Mars!";
        return new ModelAndView("test", "message", text);
    }

    @GetMapping("hoihoi")
    public String helloMethod3(Model model){
        String text = "Hello Venus!";
        model.addAttribute("message2",text);
        model.addAttribute("message", "Hello Pluto");
        return "test";
    }

}
