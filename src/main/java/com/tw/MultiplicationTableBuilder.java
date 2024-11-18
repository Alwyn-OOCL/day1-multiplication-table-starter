package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
//        String multiplicationTable = builder.printMultiplicationTable(start, end);

//        System.out.println(multiplicationTable);
//        System.out.println(builder.checkIfStartNumberAndEndNumberAreLegal(1, 4));
        System.out.println(builder.checkIfStartNumberLessThanOrEqualsToEndNumber(4, 4));
    }

    public String printMultiplicationTable(int start, int end) {

        return "";
    }

    private boolean checkIfStartNumberAndEndNumberAreLegal(int start, int end) {
        return (start > 1 && start <= 1000) && (end > 1 && end <= 1000);
    }

    private boolean checkIfStartNumberLessThanOrEqualsToEndNumber(int start, int end) {
        return start <= end;
    }
}
