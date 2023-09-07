package ru.semenenko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (genre==MusicGenre.CLASSIC){
            System.out.println("Играет " + classicMusic.getSong().get(randomNumber));
        } else {
            System.out.println("Играет " + rockMusic.getSong().get(randomNumber));
        }
    }
}
