package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {
        SQRService counter = new SQRService();
        final int FIRST_NUMBER_RANGE = 10;
        final int LAST_NUMBER_RANGE = 99;
        final int LOWER_LIMIT = 400;
        final int UPPER_LIMIT = 500;


        System.out.println("Результат: "
                + counter.occurrenceOfCount(FIRST_NUMBER_RANGE, LAST_NUMBER_RANGE, LOWER_LIMIT, UPPER_LIMIT));
    }
}

