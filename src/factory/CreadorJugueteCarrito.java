package src.factory;

public class CreadorJugueteCarrito implements CreadorJuguete{

    @Override
    public Juguete crear() {
        return new JugueteCarrito();
    }
}