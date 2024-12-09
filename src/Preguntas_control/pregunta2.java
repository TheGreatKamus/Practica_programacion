package Preguntas_control;

import java.util.Scanner;

public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= 0;
        int contador = 0;
        System.out.println("Ingrese un numero");
        i = sc.nextInt();

        System.out.println("");

        while (contador <= i) {

            System.out.println(contador);
            contador++;
        }
    }
}
