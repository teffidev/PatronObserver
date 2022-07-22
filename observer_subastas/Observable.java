package semana_9.observer_subastas;

public interface Observable {

    void agregar(Observador o);
    void quitar(Observador o);
    void notificar(String s);

}
