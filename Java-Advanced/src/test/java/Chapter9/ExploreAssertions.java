package Chapter9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 */
public class ExploreAssertions {

    static int num1,num2;
    @BeforeAll
    static void SetUp(){
        num1 = 5;
        num2 = 3;
    }

    @Test
    @DisplayName("The Sum of Two Numbers")
    void testSumOfTwoNumbers(){
        //Arrange
        int expected = 8;

        //Act-Actual
        int actual = num1 + num2;

        //Assert
        assertTrue(expected ==actual, "The Sum of " + num1 + " " + num2 + " Is " + expected);

    }

    @Test
    @DisplayName("Test Difference of Two Numbers")
    void testDifferenceOfTwoNumbers(){
       //Arrange
        int expected = 2;
        //Actual
        int actual = num1 - num2;
        //Assert
        assertTrue(expected == actual,"The difference between " + num1 + " " + num2+ " Is " + expected);
    }

    @Test
    @DisplayName("Compute sum, difference and product")
    void testComputationOfTwoNumbers(){
        //Arrange
        int expectedSum = 8;
        int expectedDiff = 2;
        int expectedProduct = 15;

        //Actual
        int actualSum = num1 + num2;
        int actualDiff = num1 - num2;
        int actualProduct = num1 * num2;

        //Assert

        assertAll(
                () ->assertEquals(expectedDiff,actualDiff),
                () ->assertEquals(expectedProduct,actualProduct),
                () ->assertEquals(expectedSum,actualSum)
        );




    }
}
