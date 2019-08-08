package calculadora;

import java.util.Scanner;


public class Calculadora2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int condicion = 1 ;
        Double nro1,nro2,resultado = 0.0;
        char ope;
        System.out.println("Ing. nro1");
        nro1 = ingreso.nextDouble();
        while (condicion ==1) {
            System.out.println("Ingresa el operador");
            ope = ingreso.next().charAt(0);
            System.out.println("Ingresa el siguiente numero");
            nro2 = ingreso.nextDouble();
            switch(ope){
            case '+': resultado = (double) (nro1 + nro2); break;
            case '-': resultado = (double) (nro1 - nro2); break;
            case '*': resultado = (double) (nro1 * nro2); break;
            case '/': resultado = (double) (nro1 / nro2); break;
        }
  
        }
        System.out.println("Deseas seguir: SI-1, NO-2");
        condicion = ingreso.nextInt();
        nro1=resultado;
        System.out.println("Deseas seguir"+resultado);
    }
}
