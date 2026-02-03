package edu.lemaMelanie.endes;

/**
 * La clase convensorTemperatura convierte
 * los valores de Temperatura entre
 * grados Celsius y grados Fahrenheit
 */


public class conversorTemperatura {
    /**
     * Converimos una temperatura de grados Celsius
     * a grados Fahrenheit
     * Formula:
     * Fahrenheit =(Celsius *9/5(1.8))+32
     * @param celsius te,èratura en grado Celsius
     * @return temperatura equivalente en grados Fahrenheit
     */
    public double celsiusAFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }

    /**
     * Convertir una temperatura de grados Fahrenheit
     * @return temperatura equivalente en grados Celsius
     */
    public double FahrenheitACelsius(double fahrenheit){
        return (fahrenheit - 32)*5/9 ;
    }
}
