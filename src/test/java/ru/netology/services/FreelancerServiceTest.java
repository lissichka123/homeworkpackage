package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
<<<<<<< HEAD

public class FreelancerServiceTest {
    @Test
    public void testCalculate1() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCalculate2() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
=======
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelancerServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "10000,3,3000,20000",
//            "100000,2,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/freelancer.csv")
    public void testCalculate(int income, int expected, int expenses, int threshold) {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(income, expenses, threshold);
        // int expected = 3;
>>>>>>> 89ce737 (initial)

        Assertions.assertEquals(expected, actual);

    }

}