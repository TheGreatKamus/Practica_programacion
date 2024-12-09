package Preguntas_control;

import java.util.Scanner;

public class pregunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int salida = 0;

        do {
            System.out.println("Hola, para salir presione 2");
            salida = sc.nextInt(); 

            if (salida == 2) {
                bandera = false;
            }

        } while (bandera);
    }
}
