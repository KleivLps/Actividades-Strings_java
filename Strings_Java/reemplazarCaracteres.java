import java.util.Scanner;

public class reemplazarCaracteres {
    public static void main(String[] args) {
        Scanner Reemplazo = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = Reemplazo.nextLine();

        System.out.println("Ingrese el primer caracter a reemplazar:");
        char caracter1 = Reemplazo.next().charAt(0);

        System.out.println("Ingrese el segundo caracter:");
        char caracter2 = Reemplazo.next().charAt(0);

        String fraseModificada = frase.replace(caracter1,caracter2);

        System.out.println("Frase resultante: " +fraseModificada);

        Reemplazo.close();
    }

}
