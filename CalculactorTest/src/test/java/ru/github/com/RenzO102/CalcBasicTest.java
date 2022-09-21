package ru.github.com.RenzO102;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CalcBasicTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"3+2", 5},
                {"12.2*5", 61},
        });
    }

    @Parameterized.Parameter
    public String expression;

    @Parameterized.Parameter(value = 1)
    public double result;

    private Calculator calc;

    @Before
    public void initCalculator() {
        calc = new Calculator();
    }

    @Test
    public void testMultiply() {

        assertThat("Error", calc.evaluate1("3+2"), is(5));
    }

    @Test
    public void testMultiplication() {

        assertThat("Error", calc.evaluate2("12.2*5"), is(61));

    }

    @Test
    public void testParametr() {

        assertThat("Error", calc.evaluate2(expression), is(result));


    }
}












