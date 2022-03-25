package ru.netology.sqr;

public class SQRService {
    public int occurrenceOfCount(int firstNumberRange, int lastNumberRange, int lowerLimit, int upperLimit) {
        int numberOccurrence = 0;
        for (int i = firstNumberRange; i <= lastNumberRange; i++) {
            if (lowerLimit <= i * i && i * i <= upperLimit) {
                System.out.print("число= " + i + ", квадрат числа = " + i * i + "\n");
                numberOccurrence++;
            }
        }
        return numberOccurrence;
    }
}



