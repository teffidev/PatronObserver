package semana_9.observer_precio_del_oro;

public interface Observable {

    void agregar(Observador o);

    void quitar(Observador o);

    void notificar(String cambio);
}
