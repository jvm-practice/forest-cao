package com.forest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.add(1,1));
    }

}
