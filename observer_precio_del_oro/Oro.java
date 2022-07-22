package semana_9.observer_precio_del_oro;

public class Oro implements Observador{


    @Override
    public String actualizar() { return this + "> Cambio de estado: "; }
}
