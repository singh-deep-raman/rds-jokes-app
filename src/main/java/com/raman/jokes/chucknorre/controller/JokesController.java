package com.raman.jokes.chucknorre.controller;

import com.raman.jokes.chucknorre.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    // this is context root mapping, means this method will be called when we hit default url
    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris"; // view name
    }
}
