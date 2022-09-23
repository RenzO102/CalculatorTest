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

    public class ParametrizeTest {

    }

        @Parameterized.Parameters
        public static Iterable<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"1+2", 3},
                    {"2+6", (8)},
                    {"18*2", (36)},
                    {"15-1", (14)},
                    {"15/3", (5)}
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

            assertThat( 3-2, is(1));
        }

        @Test
        public void testMultiplication() {

            assertThat(12*5, is(60));

        }
    @Test
    public void testParametr() {

        assertThat(expression, is(result));
    }
    }

























