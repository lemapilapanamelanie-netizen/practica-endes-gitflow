package edu.lemaMelanie.endes;

/**
 * Esta clase es para validar las contraseñas
 * las reglas son :
 * - La contraseña no puede ser null
 * - Debe tener al menos 8 caracteres
 * -Debe contener al menos una letra mayúscula
 * -Debeb contener al menos un número
 */

public class ValidarPassword {
/**
 * Validamos una contraseña segun las reglas establecidas
 * @param password la contraseña es validar
 * @return true si la contraseña es válida, false en caso contrario
  */
public boolean validar (String password){
    if (password == null){
        return false;
    }

    /**
     * expresion :
     * (?=.*[A-Z])  -> al menos una mayúscula
     * (?=.*\\d)    -> al menos un número
     *.{8,}        -> mínimo 8 caracteres
      */
    String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    return password.matches(regex);

    }
}
