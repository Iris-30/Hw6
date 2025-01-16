package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expense, int threshold) {
        int balance = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance = balance - expense;
                balance = balance / 3;
                counter = counter + 1;
            } else {
                balance = balance + income;
                balance = balance - expense;
            }
        }
        return counter;
    }
}
