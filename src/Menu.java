package src;

import src.factory.Juguete;
import src.strategy.AccionHandler;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static Menu instancia;

    private List<Juguete> juguetes = new ArrayList<>();

    private Menu(){};

    static Menu getInstance() {
        if (instancia == null) {
            instancia = new Menu();
        }
        return instancia;
    }
}
