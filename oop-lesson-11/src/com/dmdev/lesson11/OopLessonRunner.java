package com.dmdev.lesson11;

public class OopLessonRunner {
    public static void main(String[] args) {
        Ssd ssd = new Ssd(1024);
        Ram ram = new Ram(500);

//        Computer computer = new Computer(ssd, ram);
//        computer.load();

        Laptop laptop = new Laptop(new Ssd(250),new Ram(512),2);
        laptop.open();
        laptop.load();
        System.out.println(laptop);
    }
}
