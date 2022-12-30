import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        Random alea = new Random();
        String[] jugadas = {" Piedra ", " Papel ", " Tijera "};

        System.out.println(" ================== Dijite El nombre del Jugador==============");
        nombre = entrada.nextLine();

        for(int i = 0; i < jugadas.length; i++)
        {
            jugadas[i] += jugadas[i] + alea.nextInt(1);
        }
        System.out.println(jugadas);
    }
}
