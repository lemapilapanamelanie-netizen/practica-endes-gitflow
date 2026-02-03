package edu.lemaMelanie.endes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class conversorTemperaturatest {
    @Test
    void testCelsiusAFahrenheit() {
        conversorTemperatura c = new conversorTemperatura();
        assertEquals(32.0, c.celsiusAFahrenheit(0.0));
        assertEquals(212.0, c.celsiusAFahrenheit(100.0));
        assertEquals(-40.0, c.celsiusAFahrenheit(-40.0));
    }

    @Test
    void testFahrenheitACelsius() {
        conversorTemperatura c = new conversorTemperatura();
        assertEquals(0.0, c.FahrenheitACelsius(32.0));
        assertEquals(100.0, c.FahrenheitACelsius(212.0));
        assertEquals(-40.0, c.FahrenheitACelsius(-40.0));
    }
}
