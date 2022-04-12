package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {

    @Test
    void sumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sumSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSales(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void belowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void aboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.aboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }
}