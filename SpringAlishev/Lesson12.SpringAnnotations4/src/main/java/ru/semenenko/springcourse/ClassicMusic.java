package ru.semenenko.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Инициализация");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Уничтожение");
    }
    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
