import java.util.Scanner;

public class extraccionSubCadena {
    public static void main(String[] args) {

        Scanner Letras = new Scanner(System.in);

        System.out.println("¡¡Hola!! ingresa una frase porfavor :");
        String frase = Letras.nextLine();

        System.out.println("ingresa el indice inicial en donde se va a empezar a contar (Numeros enteros): ");

        int numeroInicial = Letras.nextInt();

        System.out.println("ingresa el indice final donde se va a finalizar el conteo (Numeros enteros): ");

        int numeroFinal = Letras.nextInt();

        if (numeroInicial < 0 || numeroFinal > frase.length() || numeroInicial > numeroFinal ) {

            System.out.println("numeros no validos. Asegurese de que el numero inicial sea menor o igual que el numero final");

            return;

        }

        String subcadena = frase.substring(numeroInicial, numeroFinal);

        System.out.println("La subcadena extraida es: " +subcadena);
        

        Letras.close();
    }
}
    

