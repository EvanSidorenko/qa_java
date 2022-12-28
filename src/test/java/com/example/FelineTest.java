package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Feline feline;

    @Test
    public void getFamilyReturnsWithMockDoggy() {
    // Arrange
    Mockito.when(feline.getFamily()).thenReturn("Собачьи");
    String expectedFamily = "Собачьи";

    // Act
    String actualFamily = feline.getFamily();

    // Assert
    assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getFamilyReturnsFeline() {
        // Arrange
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        // Act
        String actualFamily = feline.getFamily();

        // Assert
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void eatMeatReturnsFoodKind() throws Exception {
    // Arrange
    Feline feline = new Feline();
    List <String> expectedFoodKind = List.of("Животные", "Птицы", "Рыба");

    // Act
    List<String> actualFoodKind = feline.eatMeat();

    // Assert
    assertEquals("Это сообщение появляется в случае ошибки", expectedFoodKind,actualFoodKind);

    }
    @Test
    public void getKittensReturnsNumber() {
        // Arrange
        Feline feline = new Feline();
        int expectedNumber = 2;
        // Act
        int actualNumber = feline.getKittens(2);
        // Assert
        assertEquals(expectedNumber, actualNumber);
    }



}
