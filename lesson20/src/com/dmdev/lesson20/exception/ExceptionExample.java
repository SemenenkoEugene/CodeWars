package com.dmdev.lesson20.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) throws FileNotFoundException, TimeoutException {
        System.out.println("main start");
        try {
            System.out.println(finallyTest());
            unsafe(-10);
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");

    }

    public static int finallyTest(){
        try {
            return 2;
        } catch (Throwable throwable){
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
    }
}
