package org.learning.bestoftheyear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/")
public class HomePageController {
@GetMapping
    public String name (Model model) {
    String exampleName = "Renato Valdivia";
    model.addAttribute("myname", exampleName);
    return "homepage";
}

@GetMapping("/movies")
public String movie() {
    return "movies";

@GetMapping ("/songs")
public String song() {
    return "songs";
    }

    }


}
