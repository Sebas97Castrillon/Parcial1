package src.strategy;

import src.Menu;
import src.factory.CreadorJuguete;
import src.factory.CreadorJugueteCarrito;

public class AccionMostrar implements Accion{

    Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        
    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
