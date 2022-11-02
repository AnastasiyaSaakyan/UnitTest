package org.example.UnitTest;

import org.example.SalesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {
    @DisplayName("Тест на max число")
    @Test
    public void testMax() {
        SalesManager manager = new SalesManager(new long[]{10, 20, 30, 40});
        Assertions.assertEquals(40, manager.max());
    }

    @DisplayName("Тест min число")
    @Test
    public void testСutArithmeticMean() {
        SalesManager salesManager = new SalesManager(new long[]{10, 20, 30, 40});
        Assertions.assertEquals(10, salesManager.min());
    }

    @DisplayName("Тест на max число c объектом равным null")
    @Test
    public void testMaxNullArgumentException() {
        SalesManager salesManager = null;
        Assertions.assertThrows(NullPointerException.class, () -> salesManager.avgTrimmed());
    }

}