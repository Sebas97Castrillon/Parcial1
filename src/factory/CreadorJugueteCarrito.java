package src.factory;

import java.util.Scanner;

import src.entity.Carrito;

public class CreadorJugueteCarrito implements CreadorJuguete {

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
        Carrito carrito = Carrito.builder().numeroPuertas(numeroPuertas).color(color).marca(marca).build();
        return new JugueteCarrito();
    }
}