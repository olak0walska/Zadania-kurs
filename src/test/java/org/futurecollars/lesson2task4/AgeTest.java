package org.futurecollars.lesson2task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    void shouldSayThatSomeoneIsAdult() {
        boolean isAdult = Age.isAdult(19);
        Assertions.assertEquals(true, isAdult);
    }
    @Test
    void shouldSayThatSomeoneIsNotAdult()
    {
        boolean isAdult = Age.isAdult(15);
        Assertions.assertEquals(false, isAdult);
    }

}