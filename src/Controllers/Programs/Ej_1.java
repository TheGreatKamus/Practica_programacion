package Controllers.Programs;

import java.util.Scanner;
import Controllers.util.*;

public class Ej_1 {

    public static Scanner sc = new Scanner(System.in);
    public static double Sueldo = 2500.00;
    public static int autos_vendidos = 0;
    public static float suma_carro_costo = 0.0f;
    public static int indice = 1;
    public static float comicion_1 = 0.0f;

    public static void Venta_Autos() {// llamar este
        System.out.println("");
        System.out.println("--Bienvenido--");
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("");
        System.out.println("Hola, " + nombre);

        Contar_autos();
        Mostrar_todo();
    }

    public static void Contar_autos() {
        int salida = 1;
        do {
            System.out.println("Para el auto " + indice + ", Cuanto costo? ");
            float carro_costo = sc.nextFloat();

            suma_carro_costo += carro_costo;

            if (carro_costo > 10000) {
                comicion_1 += 250;
            }

            autos_vendidos++;
            indice++;

            System.out.println("Desea agregar mas autos: (1) para SI y cualquier otro nmero para NO");
            salida = sc.nextInt();

        } while (salida == 1);
    }

    public static void Mostrar_todo() {
        System.out.println("");
        System.out.println("Vendio: " + autos_vendidos + " autos");
        System.out.println("El total de las ventas suma: " + Utilidades.Redondear_float(suma_carro_costo) + " dolares");
        System.out.println("");
        System.out.println("Su sueldo base es: " + Sueldo + " dolares");
        System.out.println("Su comision por autos mayores a 10,000 dolares es: "
                + Utilidades.Redondear_float(comicion_1) + " dolares");
        System.out.println("Su comision dada por el 5% del total de autos vendidos es: "
                + Utilidades.Redondear_double(suma_carro_costo * 0.05) + " dolares");
        System.out.println("");
        System.out.println("Este mes usted cobro: "
                + Utilidades.Redondear_double(Sueldo + comicion_1 + (suma_carro_costo * 0.05)) + " dolares");
        System.out.println("");
    }
}
