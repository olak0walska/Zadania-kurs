package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void shouldAddTwoValues2and2()
    {
        int sum = calculator.sum(2,2);
        Assertions.assertEquals(4,sum);
    }

    @Test
    void shouldSubtractfirstValueFromSecondValue()
    {
        int subtract = calculator.subtract(5,3);
        Assertions.assertEquals(2,subtract);
    }

    @Test
    void shouldMultiplyFirstValueWithSecondValue()
    {
        int multiply = calculator.multiply(4,3);
        Assertions.assertEquals(12,multiply);
    }

    @Test
    void shouldDivideFirstValueBySecondValue()
    {
        double division = calculator.division(8,2);
        Assertions.assertEquals(4,division);
    }
}