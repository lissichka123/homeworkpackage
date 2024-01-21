package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.FreelancerService;

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

        Assertions.assertEquals(expected, actual);

    }

}