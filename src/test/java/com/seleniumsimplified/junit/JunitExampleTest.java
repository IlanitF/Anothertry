package com.seleniumsimplified.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitExampleTest {
// in this example we won't use any selenium or WebDriver
    @Test

    public void twoPlusTwoEqualsFour(){
        assertEquals("2+2=4", 4, 2+2);
    }


}
