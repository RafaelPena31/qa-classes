package org.example;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculadora calc = new Calculadora();

        int n1 = 5;
        int n2 = 6;
        double result=0;

        result = calc.somar(n1,n2);
        System.out.println("Soma: " +result);
    }
}