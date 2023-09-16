package src.strategy;

import src.factory.CreadorJuguete;
import src.factory.CreadorJuguetePeluche;

public class AccionCrearPeluche implements Accion{

     @Override
    public void aplicar() {
        CreadorJuguete creadorJuguete = new CreadorJuguetePeluche();
        creadorJuguete.crear();
        
    }

    @Override
    public int getOpcion() {
        return 2;
    }

    
}
