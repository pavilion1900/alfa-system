package ru.alfabank.ufr.rsm;

import org.junit.jupiter.api.Test;
import ru.alfabank.ufr.rsm.App;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
