import java.util.Scanner;

public class eliminarEspacios {

    public static void main(String[] args) {

        Scanner espacios = new Scanner(System.in);

        System.out.println("Ingrese una frase con espacios en blanco al principio y al final:");

        String frases = espacios.nextLine();

        String noEspacios = frases.trim();

        System.out.println("frase sin espacios : '" +noEspacios + "'");

        espacios.close();
    }

}
