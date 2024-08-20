package com.phaete;

public class FizzBuzz {

    /**
     * Spielregel: FizzBuzz
     * 1. Zahl durch 3 teilbar? -> return Fizz
     * 2. Zahl durch 5 teilbar? -> return Buzz
     * 3. Zahl durch 3 & 5 teilbar? -> return FizzBuzz
     * 4. Sonst -> return Zahl
     *
     * @param i Die nächste Zahl in der Reihe
     * @return String Fizz, Buzz, FizzBuzz oder die Zahl selbst
     */

    public static String play(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
