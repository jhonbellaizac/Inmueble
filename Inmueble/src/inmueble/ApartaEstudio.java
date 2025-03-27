package inmueble;
public class ApartaEstudio extends Apartamento{

    public ApartaEstudio(double valorArea, double valorAdministracion, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(valorAdministracion, identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    public double calcularValor (){
        return area *1500000;
    }
}
