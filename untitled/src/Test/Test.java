package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {
    public static void main(String[] args) {


    }

    public int squareDigits(int n) {

        String string = Integer.toString(n);
        char[] charArray = string.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            int value = Character.getNumericValue(charArray[i]);
            Math.sin(2.5);
        }

        return n;
    }

}
