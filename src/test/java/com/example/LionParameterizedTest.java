package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String sex;
    private boolean hasMane;

    public LionParameterizedTest (String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };

        @Test
        public void doesHaveManeReturnsBoolean () {
            // Arrange


            // Act


            // Assert


        }
    }

}
