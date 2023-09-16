package src;

import java.util.ArrayList;
import java.util.List;

import src.factory.Juguete;

public class Menu {

    private static Menu instancia;

    public List<Juguete> juguetes = new ArrayList<>();

    private Menu(){};

    public static Menu getInstance() {
        if (instancia == null) {
            instancia = new Menu();
        }
        return instancia;
    }

    public List<Juguete> getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(List<Juguete> juguetes) {
        this.juguetes = juguetes;
    }

    
}
