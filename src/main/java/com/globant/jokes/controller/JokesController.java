package com.globant.jokes.controller;

import com.globant.jokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokesController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping("/")
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getQuote());
        return "index";
    }


}
