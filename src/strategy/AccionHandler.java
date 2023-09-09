package src.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionHandler {

    private static final List<Accion> acciones = List.of(new AccionCrear(), new AccionClonar(), new AccionElminar(), new AccionMostrar());

    public static Map<Integer, Accion> getStrategy() {
        Map<Integer, Accion> strategy = new HashMap<>();
        for (Accion accion : acciones) {
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;
    }
}
