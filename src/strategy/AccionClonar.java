package src.strategy;

public class AccionClonar implements Accion{

    @Override
    public void aplicar() {
        System.out.println("Clonar");

    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
