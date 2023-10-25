import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> jugadores = new ArrayList<String>();
        jugadores.add("Victor Pandolfi");
        jugadores.add("Ricado Ortiz");
        String jugar = jugadores.get(1);
        System.out.println(jugar);
    }
}