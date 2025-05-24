package com.deepak.learning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    // @RequestMapping("/add")
    // public String add(HttpServletRequest req, HttpSession session){
    //     int input1=Integer.parseInt(req.getParameter("input1"));
    //     int input2=Integer.parseInt(req.getParameter("input2"));
    //     int result=input1+input2;
    //     session.setAttribute("result", result);
    //     return "add.jsp"; 
    // }

    // @RequestMapping("/add")
    // public String add(HttpServletRequest req, Model model){
    //     int input1=Integer.parseInt(req.getParameter("input1"));
    //     int input2=Integer.parseInt(req.getParameter("input2"));
    //     int Result=input1+input2;
    //     model.addAttribute("result", Result);
    //     return "add"; 
    // }

    @RequestMapping("/add")
    public String alien(@ModelAttribute Alien alien, Model model){
        model.addAttribute("course", "Java");
        return "add";
    }


    // @RequestMapping("/add")
    // public ModelAndView add(int input1, int input2, ModelAndView mv){
    //     int Result=input1+input2;
    //     mv.addObject("result",Result);
    //     mv.setViewName("add");
    //     return mv; 
    // }

    
}
