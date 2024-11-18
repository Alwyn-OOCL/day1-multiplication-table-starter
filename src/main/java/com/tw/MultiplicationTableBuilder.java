package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
//        String multiplicationTable = builder.printMultiplicationTable(start, end);

//        System.out.println(multiplicationTable);
//        System.out.println(builder.checkIfStartNumberAndEndNumberAreLegal(1, 4));
//        System.out.println(builder.checkIfStartNumberLessThanOrEqualsToEndNumber(4, 4));
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
        for (int i = start; i <= end; i++) {
            generateMultiplicationTableForCurrentNumber(multiplicationTable, start, i);
            addLineBreak();
        }
        return multiplicationTable.toString();
    }

    private void generateMultiplicationTableForCurrentNumber(StringBuilder multiplicationTable, int start, int currentNumber) {
        for (int j = start; j <= currentNumber; j++) {
            multiplicationTable.append(j).append("*").append(currentNumber).append("=").append(currentNumber * j);
            if (j != currentNumber) {
                multiplicationTable.append(" ");
            }
        }
    }

    private void addLineBreak() {
        System.out.println("line break");
    }

}
