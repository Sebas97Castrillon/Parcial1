package src.factory;

import java.util.Scanner;

import src.entity.Peluche;

public class CreadorJuguetePeluche implements CreadorJuguete {

    private static Scanner entradaUsuario = new Scanner(System.in);

    @Override
    public Juguete crear() {
        String materialExterior;
        String relleno;
        String color;

        System.out.println("Ingrese el tipo de material exterior");
        materialExterior = entradaUsuario.nextLine();
        System.out.println("Ingrese el relleno del peluche");
        relleno = entradaUsuario.nextLine();
        System.out.println("Ingrese el color del peluche");
        color = entradaUsuario.nextLine();
        Peluche peluche = Peluche.builder().materialExterior(materialExterior).color(color).relleno(relleno).build();
        return new JugueteCarrito();
    }

}
