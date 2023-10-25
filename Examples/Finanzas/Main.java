import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<User> userList = new ArrayList<>();

    public static int searchUser(String name) {
        boolean isUser = false;

        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.name.equals(name)) {
                isUser = true;
                return i;
            }
        }

        if (!isUser) {
            System.out.println("No se encontro al usuario");
            return -1;
        }
        return 0;
    }

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        float money = 100;
        System.out.println("Ingresa el nombre del usuario");
        String name = scanner.nextLine();

        System.out.println("Ingresa el apellido del usuario");
        String lastName = scanner.nextLine();

        User user = new User(name, lastName, money);
        userList.add(user);
        System.out.println("Registro completo");
    }

    public static void totalMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario");
        String name = scanner.nextLine();
        int userIndex = searchUser(name);

        if (userIndex != -1) {
            final User user = userList.get(userIndex);
            System.out.println("El dinero de " + user.name + " " + user.lastName + " es" + user.money);
        }
    }

    public static void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario");
        String name = scanner.nextLine();
        int userIndex = searchUser(name);

        if (userIndex != -1) {
            final User user = userList.get(userIndex);
            System.out.println("Ingresa la cantidad a depositar");
            int cantidad = scanner.nextInt();
            user.money += cantidad;
        }
    }

    public static void removeMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario");
        String name = scanner.nextLine();
        int userIndex = searchUser(name);

        if (userIndex != -1) {
            System.out.println("Ingresa la cantidad de dinero a retirar");
            int cantidad = scanner.nextInt();
            final User user = userList.get(userIndex);
            if (cantidad < user.money) {
                user.money -= cantidad;
                System.out.println("Retiraste: " + cantidad);
                System.out.println("Tu saldo es: " + user.money);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
    }

    public static void mainMenu() {
        System.out.println("Sistema Bancario\n");
        System.out.println("1) Registrar usuario");
        System.out.println("2) Ver cantidad de dinero");
        System.out.println("3) Depositar dinero");
        System.out.println("4) Retirar dinero");
        System.out.println("5) Salir");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            mainMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    register();
                    break;
                case 2:
                    totalMoney();
                    break;
                case 3:
                    addMoney();
                    break;
                case 4:
                    removeMoney();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (true);
    }
}

/**
 * User
 */
class User {
    String name;
    String lastName;
    Float money;

    public User(String name, String lastName, float money) {
        this.name = name;
        this.lastName = lastName;
        this.money = money;
    }
}