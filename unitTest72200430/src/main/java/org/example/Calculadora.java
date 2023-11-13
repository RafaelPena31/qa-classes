package org.example;

public class Calculadora{
    double resultado = 0;

    public double somar(double n1, double n2) {
        resultado = n1 + n2;
        return resultado;
    }

    public double subtrair (double n1, double n2) {
        resultado = n1 - n2;
        return resultado;
    }

    public double multiplicar (double n1, double n2) {
        resultado = n1 * n2;
        return resultado;
    }


    public double dividir (double n1, double n2) {
        resultado = n1 / n2;
        return resultado;
    }

    public double raiz (double n1) {
        resultado = Math.sqrt(n1);
        return resultado;
    }

    public double potencia (double n1, double n2) {
        resultado = Math.pow(n1, n2);
        return resultado;
    }

    public double fibonacci(double n1) {
        if (n1 <= 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        resultado = 0;

        while (a <= n1) {
            resultado += a;
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return resultado;
    }
}
