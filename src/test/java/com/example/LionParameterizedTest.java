package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private String sex;
    private boolean expectedHasMane;

    public LionParameterizedTest (String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

        @Test
        public void lionReturnsHasMane () throws Exception {
            // Arrange
            Lion lion = new Lion(sex);

            // Act
            boolean actualHasMane = lion.hasMane;

            // Assert

            assertEquals(expectedHasMane, actualHasMane);

        }

    }

