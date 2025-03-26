package inmueble;
public class ApartamentoFamiliar extends Apartamento{
    public ApartamentoFamiliar(double valor, double valorAdministracion, int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(valorAdministracion, identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    public double calcularValor(){
        return area * 20000000;
    }
    
    
}
