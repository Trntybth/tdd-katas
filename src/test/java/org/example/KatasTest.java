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

    @Test
    @DisplayName("Test mean is calculated for 3 numbers")
    public void checkReturnsMeanOfThreeNumbers(){
        Katas katas = new Katas();
        double result = katas.calculateMean(new int[]{1, 2, 3});

        assertEquals(2, result);
    }

    @Test
    @DisplayName("Test mean is calculated for 4 numbers")
    public void checkReturnsMeanOfFourNumbers(){
        Katas katas = new Katas();
        float result = katas.calculateMean(new int[]{40, 16, 5, 8});

        assertEquals(17.25, result, 0.001);
    }

    @Test
    @DisplayName("Test mean is calculated for awkward numbers")
    public void checkReturnsMeanOfAwkwardNumbers(){
        Katas katas = new Katas();
        float result = katas.calculateMean(new int[]{5, 2, 3});

        assertEquals(3.3, result, 0.1);
    }

    @Test
    @DisplayName("Test to calculate sum of ascii characters from a String")
    public void calculateSumAscii(){
        Katas katas = new Katas();

        int result = katas.calculateAsciiSum("northcoders");

        assertEquals(1195, result);
   }

   @Test
    @DisplayName("Test the overall student rating for one like")
    public void testOneLikeStudentRating(){
       Katas katas = new Katas();

       Katas.Rating result = katas.studentRating(new Katas.Rating[]{Katas.Rating.LIKE});

       assertEquals(Katas.Rating.LIKE,result);
   }

    @Test
    @DisplayName("Test the overall student rating for two likes")
    public void testTwoLikesStudentRating(){
        Katas katas = new Katas();

        Katas.Rating result = katas.studentRating(new Katas.Rating[]{Katas.Rating.LIKE, Katas.Rating.LIKE});

        assertEquals(Katas.Rating.NEUTRAL,result);
    }

}

