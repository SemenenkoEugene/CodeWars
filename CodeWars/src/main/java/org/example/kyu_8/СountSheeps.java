package org.example.kyu_8;

public class СountSheeps {
    public static void main(String[] args) {
        Boolean[] arr = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(countSheeps(arr));

    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sum = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep != null) {
                if (arrayOfSheep) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
