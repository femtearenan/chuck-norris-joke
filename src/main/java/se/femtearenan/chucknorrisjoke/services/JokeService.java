package se.femtearenan.chucknorrisjoke.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    String getJoke();
}
