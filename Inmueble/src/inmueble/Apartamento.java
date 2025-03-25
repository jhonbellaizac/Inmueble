package inmueble;
public class Apartamento extends InmuebleVivienda{
    protected double valorAdministracion;

    public Apartamento(double valorAdministracion, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
    
public double calcularValor(){
    return area * 2000000;
}
}
