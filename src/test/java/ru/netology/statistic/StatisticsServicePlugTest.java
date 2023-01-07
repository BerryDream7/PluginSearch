package ru.netology.statistic;

        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServicePlugTest {

    @Test
    void findMax() {
        StatisticsServicePlug service = new StatisticsServicePlug();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheMiddle() {
        StatisticsServicePlug service = new StatisticsServicePlug();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 665, 11, 11, 12};
        long expected = 665;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}