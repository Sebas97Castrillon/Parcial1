package src.factory;

public class CreadorJuguetePeluche implements CreadorJuguete{
    @Override
    public Juguete crear() {
        return new JuguetePeluche();
    }
}
