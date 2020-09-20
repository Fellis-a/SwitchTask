package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    @Test
    void MeasureTestKilo(){

        assertEquals(10, Logic.Measure(1,10));
    }
    @Test
    void MeasureTestGram(){

        assertEquals(0.01, Logic.Measure(3,10));
    }
    @Test
    void MeasureTestMilligram(){

        assertEquals(0.001, Logic.Measure(2,1000));
    }
    @Test
    void MeasureTestCent(){

        assertEquals(1000, Logic.Measure(4,1));
    }
    @Test
    void MeasureTestTon(){

        assertEquals(100, Logic.Measure(5,1));
    }
    @Test
    void MeasureChose(){

        assertEquals(0, Logic.Measure(10,10));
    }


}