package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testCase1() {
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expense, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expense, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}