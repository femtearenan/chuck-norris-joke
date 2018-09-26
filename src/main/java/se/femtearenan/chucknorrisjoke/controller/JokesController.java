package se.femtearenan.chucknorrisjoke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import se.femtearenan.chucknorrisjoke.services.JokeService;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "jokes";
    }
}
