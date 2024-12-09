package Controllers.Programs;

import java.util.Scanner;
import Controllers.util.Utilidades;

public class Ej_3 {
    public static Scanner sc = new Scanner(System.in);

    public static float Pago_base = 3.0f;
    public static float Impuesto = 0.35f;
    public static float Basura = 0.75f;
    public static float Prosesador_Datos = 0.50f;
    public static float agua_consumida = 0.0f;
    public static float pagar_base = 0.0f;
    public static float descuento_T = 0.0f;
    public static float descuento_D = 0.0f;
    public static float pagar_total = 0.0f;

    public static void Agua_Potable_Cobranza() {// llamar este
        Mayor_cero();
        Valorar_agua();
        Descuento_tercera_edad();
        Descuento_discapacidad();
        Imprimir();
    }

    public static void Mayor_cero() {
        System.out.println("");
        System.out.println("El municipio de Loja presenta:");
        System.out.println("--Sistema de cobranza de agua potable--");

        do {
            System.out.println("Ingrese la cantidad de agua consumida en metros cubicos: ");
            agua_consumida = sc.nextFloat();

            if (agua_consumida < 0) {
                System.out.println("Valor negativo...");
            }
        } while (agua_consumida < 0);
    }

    public static void Valorar_agua() {

        if (agua_consumida <= 15) {
            pagar_base = Pago_base;
        } else if (agua_consumida <= 25) {
            pagar_base = Pago_base + (agua_consumida - 15) * 0.10f;
        } else if (agua_consumida <= 40) {
            pagar_base = Pago_base + (10 * 0.10f) + (agua_consumida - 25) * 0.20f;
        } else if (agua_consumida <= 60) {
            pagar_base = Pago_base + (10 * 0.10f) + (15 * 0.20f) + (agua_consumida - 40) * 0.30f;
        } else {
            pagar_base = Pago_base + (10 * 0.10f) + (15 * 0.20f) + (20 * 0.30f) + (agua_consumida - 60) * 0.35f;
        }
    }

    public static void Descuento_tercera_edad() {
        System.out.println("");
        System.out.println(
                "El dueño del medidor de agua pertenece a la tercera edad: (1) para SI, cualquier otro numero para NO:");
        int op_T = sc.nextInt();

        if (op_T == 1) {
            if (agua_consumida <= 15) {
                descuento_T = 0.50f * pagar_base;
            } else {
                descuento_T = 0.30f * pagar_base;
            }
        } else {
            System.out.println("Lo sentimos, no puede acceder al descuento por tercera edad");
        }
    }

    public static void Descuento_discapacidad() {
        System.out.println("");
        System.out.println(
                "El dueño del medidor de agua posee algun porcentaje de discapacidad: (1) para SI, cualquier otro numero para NO:");
        int op_D = sc.nextInt();

        if (op_D == 1) {
            System.out.println("Ingrese el porcentaje de discapacidad del dueño del medidor:  ");
            float porcentaje_D = sc.nextFloat();

            if (agua_consumida > 15) {
                System.out.println("");
                System.out.println(
                        "Lo sentimos, su consumo de agua excede el primer rango del rubro 'SERVICIO DE AGUA POTABLE'");
                System.out.println("Este descuento no aplica para usted");
            } else {
                descuento_D = (porcentaje_D / 100) * pagar_base;
            }
        } else {
            System.out.println("Lo sentimos, no puede acceder al descuento por discapacidad");
        }

        pagar_total = pagar_base - descuento_T - descuento_D + (pagar_base * Impuesto) + Basura + Prosesador_Datos;
    }

    public static void Imprimir() {
        System.out.println("");
        System.out.println("De base, usted debe: " + pagar_base + " $ por el consumo de " + agua_consumida
                + " metros cubicos de agua");
        System.out.println("Descuento por tercera edad: " + descuento_T + " $");
        System.out.println("Descuento por discapacidad: " + descuento_D + " $");
        System.out.println("En total, usted debe: " + Utilidades.Redondear_double(pagar_total)
                + " $, sumando los impuestos de alcantarillado, basura y procesador de datos");
        System.out.println("");
    }
}
