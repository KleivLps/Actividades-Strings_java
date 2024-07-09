import java.util.Scanner;

public class LongitudSinEspacios {
    public static void main(String[] args) {

        Scanner longitud = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        String texto = longitud.nextLine();

        int longitudSinEspacios = 0;
        for (int i=0; i < texto.length();i++) {
            if (texto.charAt(i) != ' ') {
                longitudSinEspacios++;
            }
        }

        System.out.println("Longitud de la cadena sin contar espacios: " +longitudSinEspacios);


        longitud.close();
    }
}
