package com.equalexperts.solution.service;

import com.equalexperts.solution.processor.FizBuzzProcessor;

public class FizBuzzServiceImpl implements FizzBuzzService {
    private FizBuzzProcessor processor;

    public FizBuzzServiceImpl() {
        this.processor = new FizBuzzProcessor();
    }

    @Override
    public String getSolutionStepOne(int range) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= range; i++) {
            builder.append(processor.getFizzBuzzOutput(i));
        }
        return builder.toString().trim();
    }

    @Override
    public String getSolutionStepTwo(int range) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= range; i++) {
            builder.append(processor.getFizzBuzzAndLuckyOutput(i));
        }
        return builder.toString().trim();
    }

    @Override
    public String getSolutionStepThree(int range) {
        StringBuilder builder = new StringBuilder();
        int countFizz = 0;
        int countBuzz = 0;
        int countFizzBuzz = 0;
        int countLucky = 0;
        int countInteger = 0;

        for (int i = 1; i <= range; i++) {
            String output = processor.getFizzBuzzAndLuckyOutput(i).trim();
            switch (output) {
                case FizBuzzProcessor.FIZZ:
                    countFizz++;
                    break;
                case FizBuzzProcessor.BUZZ:
                    countBuzz++;
                    break;
                case FizBuzzProcessor.FIZZBUZZ:
                    countFizzBuzz++;
                    break;
                case FizBuzzProcessor.LUCKY:
                    countLucky++;
                    break;
                default:
                    countInteger++;
            }
            builder.append(processor.getFizzBuzzAndLuckyOutput(i));
        }

        return builder.append(" [REPORT] - ").append(FizBuzzProcessor.FIZZ).append(": ").append(countFizz)
            .append(", ").append(FizBuzzProcessor.BUZZ).append(": ").append(countBuzz)
            .append(", ").append(FizBuzzProcessor.FIZZBUZZ).append(": ").append(countFizzBuzz)
            .append(", ").append(FizBuzzProcessor.LUCKY).append(": ").append(countLucky)
            .append(", ").append(FizBuzzProcessor.INTEGER).append(": ").append(countInteger).toString();
    }
}
