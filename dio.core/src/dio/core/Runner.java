package dio.core;

import dio.utils.operations.Calculadora;


public class Runner {
    public static void main(String[] args) {
// estes metodos foram permitidos atraves do modulo uutils
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(1,3));
        System.out.println(calculadora.div(8,2));
        System.out.println(calculadora.mult(5,5));
        System.out.println(calculadora.sub(12,10));


    }
}
