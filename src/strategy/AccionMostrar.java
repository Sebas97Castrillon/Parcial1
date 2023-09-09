package src.strategy;

public class AccionMostrar implements Accion{

    @Override
    public void aplicar() {
        System.out.println("Mostrar");

    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
