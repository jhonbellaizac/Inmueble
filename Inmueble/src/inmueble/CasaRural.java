package inmueble;
public class CasaRural extends Inmueble{
    protected double distanciaCabecera;
    protected double altitud;

    public CasaRural(double distanciaCabecera, double altitud, int identificadorInmobiliario, int area, String direccion) {
        super(identificadorInmobiliario, area, direccion);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    
    public double calcularValor(){
    return area * 1500000;
}


















    
}
