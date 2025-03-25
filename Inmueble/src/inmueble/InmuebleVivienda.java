package inmueble;
public class InmuebleVivienda extends Inmueble{


protected int numeroHabitaciones;
protected int numeroBaños;


    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
}
