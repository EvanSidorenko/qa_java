package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private String animalKind;
    private List<String> expectedFood;

    public FelineParameterizedTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Хищник", List.of("Животные" , "Птицы" , "Рыба") },
                {"Травоядное", List.of ("Трава", "Различные растения")},
        };

    }
    @Test
    public void getFoodReturnsFood() throws Exception {
        // Arrange
        Animal animal = new Animal();

        // Act
        List<String> actualAnimalFood= animal.getFood(animalKind);

        // Assert
        Assert.assertEquals("Это сообщение появляется в случае ошибки", expectedFood, actualAnimalFood);
    }
}
