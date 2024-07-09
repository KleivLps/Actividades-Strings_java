import java.util.Scanner;



public class palabra {
    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");

        String palabraCaracter = palabra.nextLine();

        //ingresando el caracter:

        System.out.println("Ingresa un caracter: ");
        char Caracter = palabra.next().charAt(0);

        //ñaadiendo el indexof para buscar el caracter en la palabra:

        int caracterPalabra = palabraCaracter.indexOf(Caracter);

        //Mostrando el mensaje en la consola:

        if (caracterPalabra != -1) {

            System.out.println("El caracter ' " +Caracter+ " ' se encuentra en la palabra ' " +palabraCaracter+ " ' en la posicion " + caracterPalabra + ".");
        } else {
            System.out.println("El caracter ' " +Caracter+ " ' no se encuentra en la palabra ' " + palabraCaracter + "' .");
        }
        palabra.close();
    }

}
