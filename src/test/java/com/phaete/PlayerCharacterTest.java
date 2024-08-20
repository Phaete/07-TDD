package com.phaete;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_returns0() {
        assertEquals(0, PlayerCharacter.getX());
    }

    @Test
    void getY_returns0() {
        assertEquals(0, PlayerCharacter.getY());
    }

    @Test
    void move_increaseY_whenCalledWithW() {
        // reset character to 0,0
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        // move character up
        PlayerCharacter.move('w');
        // check if behaviour is as expected
        assertEquals(1, PlayerCharacter.y);
    }
    @Test
    void move_decreaseY_whenCalledWithS() {
        // reset character to 0,0
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        // move character down
        PlayerCharacter.move('s');
        // check if behaviour is as expected
        assertEquals(-1, PlayerCharacter.y);
    }
    @Test
    void move_increaseX_whenCalledWithD() {
        // reset character to 0,0
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        // move character to the right
        PlayerCharacter.move('d');
        // check if behaviour is as expected
        assertEquals(1, PlayerCharacter.x);
    }
    @Test
    void move_decreaseX_whenCalledWithA() {
        // reset character to 0,0
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
        // move character to the left
        PlayerCharacter.move('a');
        // check if behaviour is as expected
        assertEquals(-1, PlayerCharacter.x);
    }

}