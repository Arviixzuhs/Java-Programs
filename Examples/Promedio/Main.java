import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sumatoria = 0;
        double promedio;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el numero #" + i);
            int number = scanner.nextInt();
            Numbers.add(number);
        }

        for (int i = 0; i < 5; i++) {
            sumatoria += Numbers.get(i);
        }

        promedio = sumatoria / 5;

        System.out.println("El promedio es: " + promedio);
    }
}