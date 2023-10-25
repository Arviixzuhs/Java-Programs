import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<User> userList = new ArrayList<>();

    public static int searchUser(String name) {
        Boolean isUser = false;
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.name.equals((name))) {
                isUser = true;
                return i;
            }
        }

        if (!isUser) {
            System.out.println("Usuario no encontrado");
            return -1;
        }

        return 0;
    }

    public static void showUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario:");

        String name = scanner.nextLine();
        int userIndex = searchUser(name);

        if (userIndex != -1) {
            final User user = userList.get(userIndex);
            System.out.println("Datos del usuario:");
            System.out.println("Nombre: " + user.name);
            System.out.println("Edad: " + user.age);
            System.out.println("Email: " + user.email);
        }
    }

    public static void addUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario:");
        String name = scanner.nextLine();

        System.out.println("Ingrese el email del usuario:");
        String email = scanner.nextLine();

        System.out.println("Ingrese la edad del usuario:");
        int age = scanner.nextInt();
        scanner.nextLine();

        User user = new User(name, email, age);
        userList.add(user);

        System.out.println("El usuario se ha agregado exitosamente.");
    }

    public static void removeUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario que quieres editar");
        String name = scanner.nextLine();
        int userIndex = searchUser(name);

        if (userIndex != -1) {
            userList.remove(userIndex);
            System.out.println("Usuario eliminado correctamene");
        }
    }

    public static void editUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario que quieres editar");
        String name = scanner.nextLine();
        int userIndex = searchUser(name);

        if (userIndex != -1) {
            final User user = userList.get(userIndex);

            System.out.println("Ingresa el nuevo nombre");
            String newName = scanner.nextLine();

            System.out.println("Ingresa el nuevo email");
            String newEmail = scanner.nextLine();

            System.out.println("Ingresa la nueva edad");
            int newAge = scanner.nextInt();

            user.name = newName;
            user.email = newEmail;
            user.age = newAge;
            System.out.println("Usuario editado correctamene");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU");
            System.out.println("------------------");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Eliminar usuarios");
            System.out.println("4. Editar usuarios");
            System.out.println("5. Buscar usuarios");
            System.out.println("6. Salir");
            System.out.println("------------------");
            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    listUsers();
                    break;
                case 3:
                    removeUser();
                    break;
                case 4:
                    editUser();
                    break;
                case 5:
                    showUser();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void listUsers() {
        if (userList.isEmpty()) {
            System.out.println("No se han agregado usuarios.");
        } else {
            System.out.println("Lista de usuarios:");
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }
}

class User {
    String name;
    String email;
    int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + " | Email: " + email + " | Edad: " + age;
    }
}