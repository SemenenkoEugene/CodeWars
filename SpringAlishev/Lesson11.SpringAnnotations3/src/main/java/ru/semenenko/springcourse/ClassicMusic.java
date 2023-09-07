package ru.semenenko.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
