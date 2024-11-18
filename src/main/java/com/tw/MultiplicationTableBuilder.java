package com.tw;

import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    private static final String STAR = "*";
    private static final String EQUAL = "=";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        System.out.println(builder.printMultiplicationTable(start, end));
    }

    public String printMultiplicationTable(int start, int end) {
        if (!(checkIfStartNumberAndEndNumberAreLegal(start, end) &&
                checkIfStartNumberLessThanOrEqualsToEndNumber(start, end))) {
            return null;
        }
        return generateMultiplicationTable(start, end);
    }

    private boolean checkIfStartNumberAndEndNumberAreLegal(int start, int end) {
        return (start > 1 && start <= 1000) && (end > 1 && end <= 1000);
    }

    private boolean checkIfStartNumberLessThanOrEqualsToEndNumber(int start, int end) {
        return start <= end;
    }

    private String generateMultiplicationTable(int start, int end) {
        StringBuilder multiplicationTable = new StringBuilder();
        IntStream.rangeClosed(start, end).forEach(i -> {
            generateMultiplicationTableForCurrentNumber(multiplicationTable, start, i);
            addLineBreaks(multiplicationTable);
        });
        return multiplicationTable.toString();
    }

    private void generateMultiplicationTableForCurrentNumber(StringBuilder multiplicationTable, int start, int currentNumber) {
        IntStream.rangeClosed(start, currentNumber).forEach(j -> {
            multiplicationTable.append(j).append(STAR).append(currentNumber).append(EQUAL).append(currentNumber * j);
            if (j != currentNumber) {
                multiplicationTable.append(SPACE);
            }
        });
    }

    private void addLineBreaks(StringBuilder multiplicationTable) {
        multiplicationTable.append(System.lineSeparator());
    }

}
