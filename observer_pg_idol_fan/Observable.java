package semana_9.observer_pg_idol_fan;

public interface Observable {

    void agregar(Observador o);
    void quitar (Observador o);
    void notificar(String s);

}
