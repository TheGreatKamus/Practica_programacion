package Controllers.Programs;

import java.util.Scanner;
 
public class Ej_2 {

    public static Scanner sc = new Scanner(System.in);

    public enum Zona {
        AMERICA_DEL_NORTE(12, 2.75f), AMERICA_CENTRAL(15, 1.89f),
        AMERICA_DEL_SUR(18, 1.60f), EUROPA(19, 3.50f),
        ASIA(23, 4.5f), AFRICA(25, 3.10f), OCEANIA(29, 3.0f), RESTO_DEL_MUNDO(31, 6.0f);

        private int claves = 0;// donde se guarda
        private float precios = 0;

       private Zona(int valor_clave, float valor_precio) {// para guardar cada clave
            claves = valor_clave;
            precios = valor_precio;
        }

        public int getClave() {// dar la clave
            return claves;
        }

        public float getPrecio() {
            return precios;
        }
    }


    public static void Telefono_Clave() {// lamar este
        int op = 0;
        int salida = 0;

        do {
            Mostrar_claves();

            System.out.println("");
            System.out.println("Ingrese la zona en la que quiere revisar el precio por minuto: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    Amenica_norte();
                    salida = 1;
                    break;
                case 2:
                    America_central();
                    salida = 1;
                    break;
                case 3:
                    America_sur();
                    salida = 1;
                    break;
                case 4:
                    Europa();
                    salida = 1;
                    break;
                case 5:
                    Asia();
                    salida = 1;
                    break;
                case 6:
                    Africa();
                    salida = 1;
                    break;
                case 7:
                    Oceania();
                    salida = 1;
                    break;
                case 8:
                    Resto_mundo();
                    salida = 1;
                    break;
                default:
                    System.out.println("Valor fuera del rango...");
                    break;
            }
        } while (salida == 0);

    }

    public static void Mostrar_claves() {
        int i = 1;
        System.out.println("");
        for (Zona e : Zona.values()) {
            System.out.println(i + ". " + e.toString());
            i++;
        }
    }

    public static void Amenica_norte() {
        System.out.println("");
        System.out.println(Zona.AMERICA_DEL_NORTE);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.AMERICA_DEL_NORTE.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + Zona.AMERICA_DEL_NORTE.getPrecio() + " $");
        System.out.println("");
    }

    public static void America_central() {
        System.out.println("");
        System.out.println(Zona.AMERICA_CENTRAL);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.AMERICA_CENTRAL.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + Zona.AMERICA_CENTRAL.getPrecio() + " $");
        System.out.println("");
    }

    public static void America_sur() {
        System.out.println("");
        System.out.println(Zona.AMERICA_DEL_SUR);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.AMERICA_DEL_SUR.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + Zona.AMERICA_DEL_SUR.getPrecio() + " $");
        System.out.println("");
    }

    public static void Europa() {
        System.out.println("");
        System.out.println(Zona.EUROPA);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.EUROPA.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + Zona.EUROPA.getPrecio() + " $");
        System.out.println("");
    }

    public static void Asia() {
        System.out.println("");
        System.out.println(Zona.ASIA);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.ASIA.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + Zona.ASIA.getPrecio() + " $");
        System.out.println("");
    }

    public static void Africa() {
        System.out.println("");
        System.out.println(Zona.AFRICA);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.AFRICA.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + Zona.AFRICA.getPrecio() + " $");
        System.out.println("");
    }

    public static void Oceania() {
        System.out.println("");
        System.out.println(Zona.OCEANIA);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.OCEANIA.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + (int)Zona.OCEANIA.getPrecio() + " $");
        System.out.println("");
    }

    public static void Resto_mundo() {
        System.out.println("");
        System.out.println(Zona.RESTO_DEL_MUNDO);
        System.out.println("");
        System.out.println("Tiene de clave " + Zona.RESTO_DEL_MUNDO.getClave());
        System.out.println("");
        System.out.println("Tiene un precio de " + (int)Zona.RESTO_DEL_MUNDO.getPrecio() + " $");
        System.out.println("");

    }

}


