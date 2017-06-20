package com.equalexperts.solution.processor;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FizBuzzProcessorTest {
    private FizBuzzProcessor processor;

    @Before
    public void setUp() {
        processor = new FizBuzzProcessor();
    }

    @Test
    public void testValidFizzOutput() {
        assertThat(processor.getFizzBuzzOutput(3).trim(), is("fizz"));
        assertThat(processor.getFizzBuzzOutput(6).trim(), is("fizz"));
        assertThat(processor.getFizzBuzzOutput(9).trim(), is("fizz"));
        assertThat(processor.getFizzBuzzOutput(12).trim(), is("fizz"));
    }

    @Test
    public void testValidBuzzOutput() {
        assertThat(processor.getFizzBuzzOutput(5).trim(), is("buzz"));
        assertThat(processor.getFizzBuzzOutput(10).trim(), is("buzz"));
        assertThat(processor.getFizzBuzzOutput(20).trim(), is("buzz"));
        assertThat(processor.getFizzBuzzOutput(25).trim(), is("buzz"));
    }

    @Test
    public void testValidFizzBuzzOutput() {
        assertThat(processor.getFizzBuzzOutput(15).trim(), is("fizzbuzz"));
        assertThat(processor.getFizzBuzzOutput(30).trim(), is("fizzbuzz"));
        assertThat(processor.getFizzBuzzOutput(45).trim(), is("fizzbuzz"));
        assertThat(processor.getFizzBuzzOutput(60).trim(), is("fizzbuzz"));
    }

    @Test
    public void testValidLuckyOutput() {
        assertThat(processor.getFizzBuzzAndLuckyOutput(3).trim(), is("lucky"));
        assertThat(processor.getFizzBuzzAndLuckyOutput(13).trim(), is("lucky"));
        assertThat(processor.getFizzBuzzAndLuckyOutput(23).trim(), is("lucky"));
        assertThat(processor.getFizzBuzzAndLuckyOutput(33).trim(), is("lucky"));
    }
}
