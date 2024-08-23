package calculadora.main;

import calculadora.logica.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String opcion = "";

        do {
            try {
                System.out.println("Digite un valor: ");
                Double numero1 = sc.nextDouble();
                System.out.println("Digite otro valor: ");
                Double numero2 = sc.nextDouble();
                System.out.println("Digite el símbolo de la operación a realizar");
                String simbolo = sc.next();
                Double resultado = calculadora.calcular(numero1, numero2, simbolo);
                System.out.println("El resultado es: " + resultado);
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("¿Desea hacer otra operación? s/n");
            opcion = sc.next();
        }while (opcion.equals("s"));

    }
}