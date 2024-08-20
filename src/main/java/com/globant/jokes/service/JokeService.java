package com.globant.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {


    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService() {
        this.chuckNorrisQuotes =  new ChuckNorrisQuotes();;
    }

    public String getQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }


}
