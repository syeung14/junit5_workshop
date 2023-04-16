package ora.course;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;


/**
 * https://www.tutorialspoint.com/junit/junit_parameterized_test.htm
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
            {2, true},
            {6, false},
            {19, true},
            {22, false},
            {23, true}
        });
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized number is " + inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));

    }
}
