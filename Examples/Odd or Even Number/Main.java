import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = scanner.nextInt();

        if (numero % 2 != 0) {
            System.out.println("El numero " + numero + " es impar");
        } else {
            System.out.println("El numero " + numero + " es par");
        }
    }
}
