package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void MeasureTest(){

        assertEquals(0.01, Logic.Measure(3,10));
        assertEquals(10, Logic.Measure(1,10));
        assertEquals(0.001, Logic.Measure(2,1000));
        assertEquals(1000, Logic.Measure(4,1));
        assertEquals(100, Logic.Measure(5,1));

    }

    @Test
    void MeasureChose(){

        assertEquals(0, Logic.Measure(10,10));
    }


}