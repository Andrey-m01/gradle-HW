package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testSumCalc0() {
        Main main = new Main();
        Assertions.assertDoesNotThrow( () -> {
            main.main(new String[]{" ", ""});
        });
    }
}
