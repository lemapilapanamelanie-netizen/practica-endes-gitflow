package edu.lemaMelanie.endes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {
    @Test
    void testSumar(){
        Calculadora c = new Calculadora();
        assertEquals(5,c.sumar(2,3));
    }

    @Test
    void testRestar(){
        Calculadora c = new Calculadora();
        assertEquals(20,c.restar(30,10));
        assertEquals(10,c.restar(15,5));
    }
    @Test
    void testMultiplicar(){
        Calculadora c = new Calculadora();
        assertEquals(6,c.multiplicar(2,3));
        assertEquals(10,c.multiplicar(5,2));
    }
    @Test
    void testDividir(){
        Calculadora c = new Calculadora();
        assertEquals(2,c.dividir(6,3));
        assertEquals(7,c.dividir(35,5));
    }
    @Test
    void testDividirEntreCero(){
        Calculadora c = new Calculadora();
        assertThrows(IllegalArgumentException.class,
                () -> c.dividir(5,0));
    }
}
