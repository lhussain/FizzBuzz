package com.equalexperts.solution.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzServiceTest {
    private FizzBuzzService fixture;
    private int range;

    @Before
    public void setUp() {
        fixture = new FizBuzzServiceImpl();
        range = 20;
    }

    @Test
    public void testFizzBuzz() {
        String result = fixture.getSolutionStepOne(range);
        assertThat(result, is("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"));
    }

    @Test
    public void testFizzBuzzWithLucky() {
        String result = fixture.getSolutionStepTwo(range);
        assertThat(result, is("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"));
    }

    @Test
    public void testFizzBuzzWithLuckyAndReport() {
        String result = fixture.getSolutionStepThree(range);
        assertThat(result, is("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz  " +
            "[REPORT] - fizz: 4, buzz: 3, fizzbuzz: 1, lucky: 2, integer: 10"));
    }
}