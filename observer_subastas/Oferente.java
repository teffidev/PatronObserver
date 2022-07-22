package semana_9.observer_subastas;

public class Oferente implements Observador{

    private String nombre;
    private String apellido;
    private Integer dni;
    private Double montoTope;


    public Oferente(String nombre, String apellido, Integer dni, Double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println("El participante " + getApellido() + ", " + getNombre() + " Ofrece: " + montoTope);

    }

    public void accionar(){
        if (this.montoTope < 250000.0){
            System.out.println("El participante " + getDni() + ", " + getNombre() + " Ofrece: " + montoTope);
        }

    }

}
