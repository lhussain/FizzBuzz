package com.equalexperts.solution;

import com.equalexperts.solution.service.FizBuzzServiceImpl;
import com.equalexperts.solution.service.FizzBuzzService;

public class PrintSolution {
    public static void main(String[] args) {
        int range = 20;
        FizzBuzzService fixture = new FizBuzzServiceImpl();
        System.out.println(fixture.getSolutionStepOne(range));
        System.out.println();
        System.out.println(fixture.getSolutionStepTwo(range));
        System.out.println();
        System.out.println(fixture.getSolutionStepThree(range));
    }
}