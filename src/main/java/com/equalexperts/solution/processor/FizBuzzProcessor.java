package com.equalexperts.solution.processor;

public class FizBuzzProcessor {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";
    public static final String LUCKY = "lucky";
    public static final String INTEGER = "integer";

    public String getFizzBuzzOutput(int value) {
        String result = getOutputByValue(value);
        result += " ";
        return result;
    }

    public String getFizzBuzzAndLuckyOutput(int value) {
        String result;
        String checkHasThree = "" + value;

        if (checkHasThree.contains("3")) {
            result = LUCKY;
        } else {
            result = getOutputByValue(value);
        }

        result += " ";

        return result;
    }

    private String getOutputByValue(int value) {
        String result;
        if (((value % 3) == 0) && ((value % 5) == 0)) {
            result = FIZZBUZZ;
        } else if ((value % 3) == 0) {
            result = FIZZ;
        } else if ((value % 5) == 0)  {
            result = BUZZ;
        } else {
            result = "" + value;
        }

        return result;
    }
}
