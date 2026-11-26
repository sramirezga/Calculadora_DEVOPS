package com.zubiri;

public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }/// COmentario

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(2, 3));
    }

}
