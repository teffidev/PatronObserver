package semana_9.observer_subastas;

import java.util.ArrayList;

public class Subasta implements Observable {
    private Double montoPesos;
    private String descripcion;
    private ArrayList<Observador> subastadores = new ArrayList<>();

    public Subasta(Double montoPesos, String descripcion) {
        this.montoPesos = 250000.0;
        this.descripcion = descripcion;
    }

    public Double getMontoPesos() {
        return montoPesos;
    }


    @Override
    public void agregar(Observador o) {
        subastadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        subastadores.remove(o);
    }

    @Override
    public void notificar(String s) {
        for (Observador o : subastadores){
            o.actualizar(s);
        }
    }
}
