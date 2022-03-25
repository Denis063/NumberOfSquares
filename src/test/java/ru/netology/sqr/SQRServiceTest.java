package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void BelowLoverLimit() {
        SQRService counter = new SQRService();
        int expected = 3;
        int actual = counter.occurrenceOfCount (10, 99, 399,  500);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Limit() {
        SQRService counter = new SQRService();
        int expected = 3;
        int actual = counter.occurrenceOfCount(10, 99, 400, 500);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void OverLoverLimit() {
        SQRService counter = new SQRService();
        int expected = 2;
        int actual = counter.occurrenceOfCount(10, 99, 401, 500);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void BelowUpperLimit() {
        SQRService counter = new SQRService();
        int expected = 3;
        int actual = counter.occurrenceOfCount(10, 99, 400, 499);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void OverUpperLimit() {
        SQRService counter = new SQRService();
        int expected = 3;
        int actual = counter.occurrenceOfCount(10, 99, 400, 501);
        Assertions.assertEquals(expected, actual);
    }
}