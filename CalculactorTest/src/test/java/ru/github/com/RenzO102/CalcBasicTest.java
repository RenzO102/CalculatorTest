package ru.github.com.RenzO102;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;



@RunWith(Parameterized.class)
public class CalcBasicTest {
    private final int v1;
    private final int v2;
    private final int v3;
    private static java.util.Arrays Arrays;

    public CalcBasicTest(int v1, int v2, int v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3},
                {2, 6, 8},
                {18, 18, 36},
                {15, 1, 16},
                {15, 3, 18},

        });
    }


    private Calculator calc;


    @Before
    public void initCalculator() {
        calc = new Calculator();
    }


    @Test
    public void testMultiply() {

        assertThat(3 - 2, is(1));
    }

    @Test
    public void testMultiplication() {

        assertThat(12 * 5, is(60));

    }

    @Test
    public void testParametersum() {

        assertThat("dsdfsd", calc.sum(v1, v2), is(v3));

    }

    @Test
    public void testParameterminus() {

        assertThat("dsdfsd", calc.minus(v3, v2), is(v1));


    }
}










































