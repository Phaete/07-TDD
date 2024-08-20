package com.phaete;

public class PlayerCharacter {

    static int x = 0;
    static int y = 0;


    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static void move(char move) {
        if (move == 'w') {
            y++;
        } else if (move == 's') {
            y--;
        } else if (move == 'a') {
            x--;
        } else if (move == 'd') {
            x++;
        }
    }
}
