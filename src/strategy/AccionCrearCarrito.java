package src.strategy;
import src.Menu;
import src.factory.CreadorJuguete;
import src.factory.CreadorJugueteCarrito;

public class AccionCrearCarrito implements Accion{

    private static Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        CreadorJuguete creadorJuguete = new CreadorJugueteCarrito();
        menu.juguetes.add(creadorJuguete.crear());
    }
        
    

    @Override
    public int getOpcion() {
        return 1;
    }

    
}
