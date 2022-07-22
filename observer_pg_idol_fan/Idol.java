package semana_9.observer_pg_idol_fan;

import java.util.ArrayList;

public class Idol implements Observable {

    private boolean enVlive;
    private ArrayList<Observador> observadores = new ArrayList<>();


    @Override
    public void agregar(Observador o) {
        observadores.add(o);

    }

    @Override
    public void quitar(Observador o) {
        observadores.remove(o);

    }

    @Override
    public void notificar(String msg) {
        for (Observador o : observadores){
            o.actualizar(msg);
        }
    }

    public void transmitir(){
        enVlive= true;
        notificar("Esta transmitiendo en vivo en www.link.com");
    }


    public void finalizarTransmision(){
        enVlive= false;
        notificar("Vlive finalizó, gracias a quienes pudieron participar. 고맙습니다");
    }

}
