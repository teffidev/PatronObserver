package semana_9.observer_subastas;

public class Main {
    public static void main(String[] args) {
        Subasta subasta = new Subasta(5000.0, "Armario 80's");
        Oferente luis = new Oferente("Luis", "López", 5812, 3500.0);
        Oferente pedro = new Oferente("Pedro", "Ortiz", 5713, 251000.0);

        subasta.agregar(luis);
        subasta.agregar(pedro);

        subasta.getMontoPesos();
        subasta.notificar("Estas perdido");

        luis.accionar();
        pedro.accionar();
    }

}
