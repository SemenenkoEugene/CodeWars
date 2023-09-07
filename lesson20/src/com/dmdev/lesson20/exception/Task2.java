package com.dmdev.lesson20.exception;

public class Task2 {
    public static void main(String[] args) {
        int[] value = {1, 2, 5, 6, 8};
        try {
            for (int i = 0; i <= value.length; i++) {
                System.out.println(value[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Catch");
            e.printStackTrace();
        }

    }
}
