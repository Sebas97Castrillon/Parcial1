package src.factory;

import src.Carrito;

import java.util.Scanner;

public class JugueteCarrito implements Juguete{

    private static Scanner entradaUsuario = new Scanner(System.in);

    @Override
    public Juguete crear() {
        String color;
        String marca;
        int numeroPuertas;

        System.out.println("Ingrese el color del carrito");
        color = entradaUsuario.nextLine();
        System.out.println("Ingrese el marca del carrito");
        marca = entradaUsuario.nextLine();
        System.out.println("Ingrese el número de puertas del carrito");
        numeroPuertas = entradaUsuario.nextInt();
        Carrito carrito = Carrito.builder(color, numeroPuertas, marca).build();


        return carrito;
    }
}
