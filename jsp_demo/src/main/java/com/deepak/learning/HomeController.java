package com.deepak.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        int arr[]={1,2,3,4,5};
        model.addAttribute("arr", arr);
        Alien aliens[]={
                new Alien("Alien1", 1),
                new Alien("Alien2", 2),
                new Alien("Alien3", 3),
                new Alien("Alien4", 4),
                new Alien("Alien5", 5)
            };
            model.addAttribute("aliens", aliens);
        return "index";
    }
}
