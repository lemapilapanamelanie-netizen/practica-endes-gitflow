package edu.lemaMelanie.endes;
 /** clase donde implementaremos las opereaciones*/
public class Calculadora {
     /** suma de dos numero
      @param a primer numero
      @param b segundo numero
      @return el resultado de sumar a y b
      */
    public double sumar (double a, double b){
        return a+b;
    }
     /**
      * Realizar la resta de dos numeros
      * @param a minuendo
      * @param b sustraendo
      * @return el resultado de restar b a a
      */
     public double restar (double a, double b){
         return a-b;
     }

     /** La multiplicacion de dos numeros
      * @param a primer numero o factor
      * @param b segundo factor
      * @return el resultado de multiplicar a por b
      */
     public double multiplicar (double a, double b){
         return a*b;
     }

     /**
      * La division de dos numeros
      * @param a dividendo
      * @param b divisor
      * @return el resulatado de dividir a entre b
      * @throws IllegalArgumentException si el divisor es 0
      */
     public double dividir (double a, double b){
         if (b ==0){
             throw new IllegalArgumentException("No se puede dividir entre cero");
         }
         return a/b;
     }
 }
