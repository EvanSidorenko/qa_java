package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    @Test
    public void doesHaveManeReturnsTrue() throws Exception {
        //Arrange
        Feline feline = new Feline();
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        boolean expectedDoesHaveMane = true;

        // Act
        boolean actualDoesHaveMane = lion.doesHaveMane();

        // Assert
        assertEquals(expectedDoesHaveMane,actualDoesHaveMane);

    }

    @Test
    public void getFoodReturnsFoodForPredator() throws Exception {
        // Arrange
        String sex = "Самец";
        Feline feline = new Feline();
        Lion lion = new Lion(sex, feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        // Act
        List<String> actualFood = lion.getFood();

        // Assert
        assertEquals(expectedFood, actualFood);
    }
}
