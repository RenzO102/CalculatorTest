package ru.github.com.RenzO102;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcBasicTest {
    private static java.util.Arrays Arrays;
 @Parameterized.Parameters(name = "{index}: {0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {2, 6, 8},
                {18, 18, 36},
                {15, 1, 16},
                {15, 3, 18},
        });
    }
    
     @Parameterized.Parameter
    public int firstSummand;

    @Parameterized.Parameter
    public int secondSummand;

    @Parameterized.Parameter
    public int sum;

    private Calculator calc;
    
    @Before
    public void initCalculator() {
        calc = new Calculator();
    }
    
    @Test
    public void shouldBeTestParameterSum() {
        assertThat("Should be a different amount", firstSummand + secondSummand,is(sum));
    }
    
    @Test
    public void shouldBeTestParameterSubtraction() {
        assertThat("Should  be another difference", firstSummand - secondSummand,is(sum));
    }
}
