package src;

import src.strategy.Accion;
import src.strategy.AccionHandler;

import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner entradaUsuario = new Scanner(System.in);
    public static int salir = 1000;

    public static void main(String[] args) {
        Map<Integer, Accion> strategy = new AccionHandler().getStrategy();
        int opcion;
        do {
            System.out.println("Ingrese una opción");
            opcion = entradaUsuario.nextInt();
            entradaUsuario.nextLine();
            Accion accion = strategy.get(opcion);

            if (opcion == salir) {
                continue;
            }

            if (accion == null) {
                System.out.println("Opción Inválida");
            } else {
                accion.aplicar();
            }
        }while(opcion != salir);
    }
}
