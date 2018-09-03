package com.cice;
import com.cice.ejemplo1.*;

public class Main {

    public static void main(String[] args) {

        //Suma, resta, multiplicación y división

        IFuncional suma = (a, b) -> a+b;
        System.out.println(suma.calculo(7,1));

        IFuncional resta = (a,b) -> a-b;
        System.out.println(resta.calculo(7,1));

        IFuncional multiplicacion = (a,b) -> a*b;
        System.out.println(multiplicacion.calculo(7,1));

        IFuncional division = (a,b) -> a/b;
        System.out.println(division.calculo(1,7));

        System.out.println("======================");

        IFuncional operacion = (a, b) -> a+b;
        System.out.println(operacion.calculo(7,1));

        operacion = (a,b) -> a-b;
        System.out.println(operacion.calculo(7,1));

        operacion = (a,b) -> a*b;
        System.out.println(operacion.calculo(7,1));

        operacion = (a,b) -> a/b;
        System.out.println(operacion.calculo(1,7));

        System.out.println("======================");

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.suma(1,5));
        System.out.println(calculadora.resta(1,5));
        System.out.println(calculadora.multiplicacion(1,5));
        System.out.println(calculadora.division(1,5));


    }
}
