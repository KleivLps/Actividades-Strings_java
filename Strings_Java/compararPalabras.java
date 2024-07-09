import java.util.Scanner;



public class compararPalabras {

    public static void main(String[] args) {
        Scanner comparacion = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra: ");
        String palabra1 = comparacion.nextLine();

        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = comparacion.nextLine();

        if (palabra1.equals((palabra2))) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println(" Las palabras son diferentes.");
        }
        comparacion.close();
    }
}
