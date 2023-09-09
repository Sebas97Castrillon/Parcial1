package src.strategy;

public class AccionCrear implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Crear");

    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
