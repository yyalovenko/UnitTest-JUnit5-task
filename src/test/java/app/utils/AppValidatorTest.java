package app.utils;

import app.exceptions.TemperatureException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppValidatorTest {

    AppValidator validator;

    @BeforeEach
    void setUp() {
        validator = new AppValidator();
    }

    @Test
    @DisplayName("Test if temperature is valid")
    void test_If_Temperature_Is_Valid() throws TemperatureException {
        assertEquals("Temperature is OK. Data can be obtained.",
                validator.validateTemperature(25));
    }

    @Test
    @DisplayName("Test that invalid temperature throws exception")
    void test_That_Invalid_Temperature_Throws_Exception() {
        assertThrows(TemperatureException.class, () -> validator.validateTemperature(-20),
                "No exception");
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }
}