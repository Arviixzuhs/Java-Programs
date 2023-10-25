import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        float resultado;
        String unidad, option = "";

        do {
            System.out.println("Ingresa el numero que quieres convertir");
            numero = scanner.nextInt();
        } while (numero <= 0);

        do {
            System.out.println(numero + " " + "que?");
            System.out.println("s: segundos\nm: minutos\nh: horas\nd: dias\n\n");
            unidad = scanner.nextLine();
        } while (!unidad.equals("s") && !unidad.equals("m") && !unidad.equals("h") && !unidad.equals("d"));

        do {
            System.out.println(
                    "Puedes convertir " + numero + option + " a:\n\ns: segundos\nm: minutos\nh: horas\nd: dias\n\n");
            option = scanner.nextLine();
        } while (!option.equals("s") && !option.equals("m") && !option.equals("h") && !option.equals("d"));

        switch (unidad) {
            case "s":
                if (option.equals("s")) {
                    System.out.println("No puedes convertir segundos a segundos\n\n");
                }

                if (option.equals("m")) {
                    resultado = (float) (numero / 60.0);
                    System.out.println(numero + " segundos son " + resultado + " minutos\n\n");
                }

                if (option.equals("h")) {
                    resultado = (float) (numero / 3600.0);
                    System.out.println(numero + " segundos son " + resultado + " horas\n\n");
                }

                if (option.equals("d")) {
                    resultado = (float) (numero / 86400.0);
                    System.out.println(numero + " segundos son " + resultado + "dias\n\n");
                }
                break;

            case "m":
                if (option.equals("m")) {
                    System.out.println("No puedes convertir minutos a minutos\n\n");
                }

                if (option.equals("s")) {
                    resultado = numero * 60;
                    System.out.println(numero + " minutos son " + resultado + " segundos\n\n");
                }

                if (option.equals("h")) {
                    resultado = (float) (numero / 60.0);
                    System.out.println(numero + " minutos son " + resultado + " horas\n\n");
                }

                if (option.equals("d")) {
                    resultado = (float) (numero / 1440.0);
                    System.out.println(numero + " minutos son " + resultado + "dias\n\n");
                }
                break;

            case "h":
                if (option.equals("h")) {
                    System.out.println("No puedes convertir horas a horas\n\n");
                }

                if (option.equals("s")) {
                    resultado = (float) (numero * 3600.0);
                    System.out.println(numero + " horas son " + resultado + "segundos\n\n");
                }

                if (option.equals("m")) {
                    resultado = (float) (numero * 60.0);
                    System.out.println(numero + " horas son " + resultado + " minutos\n\n");
                }

                if (option.equals("d")) {
                    resultado = (float) (numero / 24.0);
                    System.out.println(numero + " horas son " + resultado + "dias\n\n");
                }
                break;

            case "d":
                if (option.equals("d")) {
                    System.out.println("No puedes dias a dias\n\n");
                }

                if (option.equals("s")) {
                    resultado = numero * 86400;
                    System.out.println(numero + "dias son " + resultado + "segundos\n\n");
                }

                if (option.equals("m")) {
                    resultado = (float) (numero * 1440.0);
                    System.out.println(numero + "dias son " + resultado + " minutos\n\n");
                }

                if (option.equals("h")) {
                    resultado = (float) (numero / 24.0);
                    System.out.println(numero + " dias son " + resultado + " horas\n\n");
                }
                break;
            default:
                System.out.println(numero + " unidad ingresada no es valida\n\n");
                break;
        }

    }
}
