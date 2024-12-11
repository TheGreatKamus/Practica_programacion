package Controllers.Programs;

import java.util.Scanner;
import java.lang.Math;
import Controllers.util.*;

public class Ej_4 {

    public static Scanner sc = new Scanner(System.in);

    public static void Serie_ejecutar() {// llamar este

        int salida = 0;

        do {
            System.out.println("");
            System.out.println("Ingrese el numero de pasos de la serie:");
            int paso_serie = sc.nextInt();

            if (paso_serie > 0) {
                System.out.println(Mostrar_serie(paso_serie));
                salida = 1;
                break;
            } else
                System.out.println("El numero ingresado es menor a 0...");
                Serie_ejecutar();
        } while (salida == 1);

    }

    public static int Figonachi(int paso_serie) { // numerador

        int a = 1;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= paso_serie; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }    
      

    public static int Numeros_impar(int paso_serie) {// denominador
        int impar = 0;
        for (int i = 1; i <= paso_serie; i++) {
            impar = ((2 * i) - 1);

        }
        return impar;
    }
    

    public static int Expo_mul_dos(int paso_serie) {// exponente

        int m_dos = 0;
        for (int i = 1; i <= paso_serie; i++) {

            m_dos = (2 * i);

        }
        return m_dos;

    }

    public static String Mostrar_serie(int paso_serie) {

        System.out.println("");

        String serie = "S = ";
        int signo = -1;
        double resp = (Math.pow((Figonachi(paso_serie + 1) / Numeros_impar(paso_serie + 1)), Expo_mul_dos(paso_serie + 1)));
        
        for (int i = 1; i < paso_serie + 1; i++) {

            int figo = Figonachi(i);
            int mul2 = Numeros_impar(i);
            int expo = Expo_mul_dos(i);

            switch (signo) {
                case -1:
                    serie += "(" + figo + "/" + mul2 + ")" + "^" + expo + "" + " + ";
                    signo++;
                    break;
                case 0:
                    serie += "(" + figo + "/" + mul2 + ")" + "^" + expo + "" + " - ";
                    signo++;
                    break;
                case 1:
                    serie += "(" + figo + "/" + mul2 + ")" + "^" + expo + "" + " - ";
                    signo++;
                    break;
                case 2:
                    serie += "(" + figo + "/" + mul2 + ")" + "^" + expo + "" + " + ";
                    signo = -1;
                default:
                    break;
            }

        }

        return "La serie es:" + "\n" + serie + "\n" + "Y el resulatdo es: " + Utilidades.Redondear_double(resp);

    }
}
