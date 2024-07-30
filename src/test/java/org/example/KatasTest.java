package org.example;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class KatasTest {

    // check method returns elements in array except for the highest and lowest
    @Test
    @DisplayName("Tests sum is returned of middle numbers")
        public void checkReturnsSumOfMiddleNumbers() {

            Katas katas = new Katas();
            int result = katas.ReturnsSumOfMiddleNumbers(new int[]{5, 2, 6, 10, 22});

            assertEquals(21, result);

    }

    @Test
    @DisplayName("Tests next sum is returned of middle numbers")
    public void checkReturnsSumOfMiddleNumbers2() {

        Katas katas = new Katas();
        int result = katas.ReturnsSumOfMiddleNumbers(new int[]{1, 2, 3, 4});

        assertEquals(5, result);

    }
}

