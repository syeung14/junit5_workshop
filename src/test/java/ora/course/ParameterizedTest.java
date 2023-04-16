package ora.course;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][] {
            { 2, 1, 1 },
            { 3, 2, 1 },
            { 4, 3, 1 },
            });
    }

    public ParameterizedTest(double expetecd, double valueOne, double valueTwo) {
        this.expected = expetecd;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum() {
        Calculator ca = new Calculator();
        System.out.println(expected);
        assertEquals(expected, ca.add(valueTwo, valueOne), 0);
    }

}
