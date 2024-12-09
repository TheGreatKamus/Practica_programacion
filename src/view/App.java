package view;

import java.util.Scanner;

import Controllers.Programs.*;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {
            System.out.println("1. Autos Vendidos");
            System.out.println("2. Telefono Clave");
            System.out.println("3. Agua Potable Cobranza");
            System.out.println("4. Serie");
            System.out.println("5. Salir");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    Ej_1.Venta_Autos();
                    break;
                case 2:
                    Ej_2.Telefono_Clave();
                    break;
                case 3:
                    Ej_3.Agua_Potable_Cobranza();
                    break;
                case 4:
                    Ej_4.Serie_ejecutar();
                    break;
                case 5:
                    System.out.println("adios :,v");
                    break;

                default:
                    System.out.println("numero no valido");
                    break;
            }
        } while (op != 5);
    }

}
