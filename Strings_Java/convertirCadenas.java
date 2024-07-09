import java.util.Scanner;
import java.util.SimpleTimeZone;

public class convertirCadenas {

    public static void main(String[] args) {
        Scanner cadena =new Scanner(System.in);


        //Ingresando la cadena de texto:

        System.out.println("Ingresa una cadena de texto: ");

        String conversionCadena = cadena.nextLine();

        //convertiendo la cadena a mayuscula y minuscula:

        String cadenaMayuscula = conversionCadena.toUpperCase();
        String cadenaMinuscula = conversionCadena.toLowerCase();

        //Mostrando la conversion:
        System.out.println("Cadena en mayusculas: " +cadenaMayuscula);
        System.out.println("Cadena en minusculas: " +cadenaMinuscula);

        cadena.close();
    }
}
