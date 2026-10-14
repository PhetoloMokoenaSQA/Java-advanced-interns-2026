package Chapter9;

import com.sun.jdi.Value;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import  org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Project: Java-Advanced
 * Date  : 10/14/2026
 *
 * @author: Phetolo Mokoena
 */
public class DataDrivenTests {
    @ParameterizedTest(name = "Test Exam Score - [{Index}] : {arguments}")
    @ValueSource(doubles = {77.5, 63.8, 66.8, 57.8,78.9})
    void testExamScore(double examMark){

        boolean actual = examMark >=65;

        //assertEquals(true,actual);
        assertTrue(actual,"Pass mark Should be 65 or above, Your Mark is [" + examMark + "]");
    }
    @ParameterizedTest
    @ValueSource(strings = {"Phete", "Jessica", "Skwishi","Mokoena","Modau"})
    void testNameStratsWith(String name){
        assertTrue(name.startsWith("J"),name + " Doesn't start with J");
    }

    @ParameterizedTest
    @CsvSource(value = {"Milk,20.00,50", "Bread,18.55,25", "Cheese,55.38,17","Eggs,80.55,60"})
    void testLowStockProducts(String product,double price, int qtyInStock){
        assertTrue(qtyInStock < 50, "There is Enough stock for [" + product + "]");

        System.out.println("product = " + product + ", price = " + price + ", qtyInStock = " + qtyInStock);
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testEvenNumbers(int numbers){
        assertTrue(numbers %2 ==0, numbers + "is not even");

    }
@ParameterizedTest
@MethodSource("Chapter9.DataStore#randomNumbers")
void testExternalRandomNumbers(int number){
        assertTrue(number >=45, number + " Is Less than 45");

}

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Student Results.csv", numLinesToSkip = 1)
    void testExamMark(String module, int testMark){
        assertTrue(testMark >= 65, "You Have failed [" + module +"] with [" + testMark + "] o hloka 65");
    }

    static List<Integer> randomNumbers(){
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();

        int count = rnd.nextInt(5,12);
        for (int i = 0; i < count;i++){
            numbers.add(rnd.nextInt(10,70));

        }
        return numbers;
    }

}
