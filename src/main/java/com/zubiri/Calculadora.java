package com.zubiri;

public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("La suma es: " + calculadora.suma(2, 3));

        System.out.println("La resta es: " + calculadora.resta(8, 3));

        System.out.println("La multplicación es: " + calculadora.multiplicacion(5, 3));

    }

}
