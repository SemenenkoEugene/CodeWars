package ru.semenenko.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Рок-музыка";
    }
}
