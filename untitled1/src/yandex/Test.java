package yandex;

import java.util.*;

public class Test extends Thread{
    public static void main(String[] args) {

        Test test = new Test();
        test.start();
        System.out.print("one. ");

        test.start();
        System.out.print("two. ");

    }

    public void run(){
        System.out.print("Thread ");
    }
}