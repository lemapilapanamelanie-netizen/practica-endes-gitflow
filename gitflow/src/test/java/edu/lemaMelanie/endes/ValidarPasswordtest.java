package edu.lemaMelanie.endes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidarPasswordtest {
    @Test
    void passwordValida(){
        ValidarPassword v = new ValidarPassword();
        assertTrue(v.validar("Password12"));
        assertTrue(v.validar("Password123"));
    }
    @Test
    void passwordInvalida(){
        ValidarPassword v = new ValidarPassword();
        assertFalse(v.validar("Password123"));
    }

    @Test
    void passwordInvalidaPorMayusculas(){
        ValidarPassword v = new ValidarPassword();
        assertFalse(v.validar("password123"));//Sin mayuscula
    }

    @Test
    void passwordInvalidaPorNumero(){
        ValidarPassword v = new ValidarPassword();
        assertFalse(v.validar("password"));// sin numero

    }
    @Test
    void passwordNula(){
        ValidarPassword v = new ValidarPassword();
        assertFalse(v.validar(null));
    }
}
