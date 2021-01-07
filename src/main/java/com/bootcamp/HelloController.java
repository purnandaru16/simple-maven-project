package com.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The Class HelloController
 *
 * @author Kris Sunu Purnandaru
 */
@RequestMapping("")
@Controller
public class HelloController {

    @GetMapping(value = "/homepage")
    public String home(Model model) {
        model.addAttribute("message", "Welcome!!!");

        String pesan = "Ini Homepage";
        model.addAttribute("welcome", pesan);
        return "home";
    }
}
