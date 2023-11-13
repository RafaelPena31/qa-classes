import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
    @Test
    public void TestaSoma() {
        double n1 = 10.0;
        double n2 = 10.0;
        double resultadoEsperado = 20;

        Calculadora calc = new Calculadora();
        double resultadoReal = calc.somar(n1, n2);
        assertEquals(resultadoEsperado, resultadoReal,0.001);
    }

    @Test
    public void TestaSubtracao() {
        double n1 = 10.0;
        double n2 = 10.0;
        double resultadoEsperado = 0;

        Calculadora calc = new Calculadora();
        double resultadoReal = calc.subtrair(n1,n2);

        assertEquals(resultadoEsperado, resultadoReal,0.001);
    }


    @Test
    public void TestaMultiplicar() {
        double n1 = 10.0;
        double n2 = 10.0;
        double resultadoEsperado = 100;

        Calculadora calc = new Calculadora();
        double resultadoReal = calc.multiplicar(n1, n2);
        assertEquals(resultadoEsperado, resultadoReal,0.001);
    }

    @Test
    public void TestaDividir() {
        double n1 = 10;
        double n2 = 10;
        double resultadoEsperado = 1;

        Calculadora calc = new Calculadora();
        double resultadoReal = calc.dividir(n1, n2);
        assertEquals(resultadoEsperado, resultadoReal,0.001);
    }


    @Test
    public void TestaRaiz() {
        double n1 = 16;
        double resultadoEsperado = 4;

        Calculadora calc = new Calculadora();
        double resultadoReal = calc.raiz(n1);
        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }


    @Test
    public void TestaPotencia() {
        double n1 = 4;
        double n2 = 3;
        double resultadoEsperado = 64;

        Calculadora calc =  new Calculadora();
        double resultadoReal = calc.potencia(n1, n2);
        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void TestaFibonacci() {
        double n1 = 8;
        double resultadoEsperado = 20;

        // 0 + 1 + 1 + 2 + 3 + 5 + 8

        Calculadora calc = new Calculadora();
        double resultadoReal = calc.fibonacci(n1);
        assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }
}
