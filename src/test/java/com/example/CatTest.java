package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline;
    @Test
    public void getSoundReturnsMeow() {
        // Arrange
        Cat cat = new Cat(feline);
        String expectedString = "Мяу";

        // Act
        String actualSound = cat.getSound();

        // Assert
        assertEquals(expectedString, actualSound);

    }




}
