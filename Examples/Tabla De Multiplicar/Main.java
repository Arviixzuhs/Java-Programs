import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero para saber su tabla de multiplicar");
        int numero = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
