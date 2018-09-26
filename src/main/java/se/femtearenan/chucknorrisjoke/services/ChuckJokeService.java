package se.femtearenan.chucknorrisjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckJokeService implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckJokeService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
