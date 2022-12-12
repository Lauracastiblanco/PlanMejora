package loveCalculator;

import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        calculadora ronda = new calculadora(); 
        int opcion;
        do {
            Scanner lector = new Scanner(System.in);
            System.out.println("----------LOVE CALCULATOR----------");
            System.out.print("Ingresa tu nombre: ");
            ronda.setNombre(lector.next());
            System.out.print("Ingresa su nombre: ");
            ronda.setCrushNombre(lector.next());
            ronda.loveCalculator();
            ronda.mostrarDatos();
            System.out.println("¿Desea seguir jugando o terminar el juego? Digite 1 para jugar y 2 para finalizar");
            opcion = lector.nextInt();
        } while (opcion == 1);
    }
}
