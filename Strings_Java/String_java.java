import java.util.Scanner;

public class String_java {
    public static void main(String[] args) {

        System.out.println("por favor escribe una palabra");

        Scanner Letras = new Scanner(System.in);

        String palabra = Letras.nextLine();

        System.out.println("La longitud de la palabra "+palabra+" es de " +palabra.length()+ " letras");
        System.out.println(palabra.substring(0, 4));
        palabra = String.valueOf(2031123);
        System.out.println(palabra);

        Letras.close();
    }
}