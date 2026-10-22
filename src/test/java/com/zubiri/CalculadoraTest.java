
package com.zubiri;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    @Test
    public void sumaTest() {
        // 1. Preparación (Arrange)
        Calculadora calc = new Calculadora();
        // 2. Ejecución (Act)
        int resultado = calc.suma(2, 3);
        // 3. Verificación (Assert)
        assertEquals(5, resultado, "La suma 2 + 3 debería ser 5");
    }

    @Test
    public void restaTest() {
        Calculadora calculadora = new Calculadora();
        int rest = calculadora.resta(10, 4);

        assertEquals(6, rest, "La resta de diez menos cuatro debe ser 6");
    }

    @Test
    public void multiplicacionTest() {
        Calculadora calculadora = new Calculadora();
        int rest = calculadora.multiplicacion(5, 5);
        assertEquals(25, rest, "La multiplicación de 5 x 5 debe ser 25");
    }
}