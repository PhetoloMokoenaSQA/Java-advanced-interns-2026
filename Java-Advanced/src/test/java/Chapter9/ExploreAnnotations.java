package Chapter9;

import org.junit.jupiter.api.*;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 * This class demonstrates the use of different annotations from JUnit 5
 * <ol>
 *     <li>
 *         Sanity Test: Test for basic functionality after a fix, change or addition of a feature
 *     </li>
 *     <li>
 *         Regression Test: Test unchanged parts of the system
 *     </li>
 *     <li>
 *         Intergration Test: Testing individual units when they are connected to internal or external component
 *     </li>
 *
 * </ol>
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExploreAnnotations {

    @BeforeAll
    static void setup(){
        System.err.println("SetUP");
    }

    @AfterAll
    static void teardown(){
        System.err.println("Releasing all resources");
    }

    @BeforeEach
    void beforeAnyTest(){
        System.err.println("Before a test case ");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("After Each Test Case");
    }

    @Test
    @DisplayName("TC1 - First Test")
    @Order(1)
    @Tag("Sanity")
    void firstTest(){
        System.out.println("===========First test Method===========");
    }

    @Test
    @DisplayName("TC2 - Second Test")
    @Order(2)
    @Tag("Regression")
    @Tag("Intergration")
    void secondTest(){
        System.out.println("=======Second Test======");
    }

    @Test
    @DisplayName("TC3 - Third Test")
    @Order(3)
    @Tag("Sanity")
    void ThirdTest(){
        System.out.println("=======ThirdTest======");
    }

    @Test
    @DisplayName("TC4 - Test Sum")
    @Order(4)
    @Tag("Intergration")
    void testSum(){
        //Arrange - inputs and expected results
        int num1 = 6;
        int num2 = 3;
        int expectedSum = 9;
        System.out.println("Test Sum");


    }

}
