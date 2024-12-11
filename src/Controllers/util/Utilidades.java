package Controllers.util;

public class Utilidades {

    public static boolean validate(String num) {
        boolean band = true;
        if(num.charAt(0) == '-') {
            num = num.substring(1);
        }

        int cont_p = 0;
        for(int i = 0; i < num.length(); i++){
            if(!Character.isDigit(num.charAt(i)) && num.charAt(i) != '.') {
                band = false;
                break;
            } else if(num.charAt(i) == '.')
                cont_p++;
        }
        if(cont_p >= 2 )
            band = false;
        return band;
    }

    public static double transformStringDouble(String num) {
        double resp = 0;
        if(Utilidades.validate(num)) {
            resp = Double.parseDouble(num);
        }
        return resp;
    }

    public static float Redondear_float (float num) {
       float aux = num*100.00f;
       float aux1 = (float)((int)aux); 
       return (aux1/100.00f);
    }

    public static double Redondear_double (double n) {
        double aux = n*100.00;
        double aux1 = (double)((int)aux); 
        return (aux1/100.00); 
    }

}


