package awe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest1 {
    @Test
    void add() {
        assertEquals(2,new Calc().Add());
    }
}