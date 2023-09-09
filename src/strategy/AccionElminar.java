package src.strategy;

public class AccionElminar implements Accion{

    @Override
    public void aplicar() {
        System.out.println("Eliminar");

    }
    @Override
    public int getOpcion() {
        return 3;
    }
}
