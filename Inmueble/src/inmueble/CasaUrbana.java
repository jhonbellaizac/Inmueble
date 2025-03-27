package inmueble;
public class CasaUrbana extends Casa{
    protected boolean conjuntoCerrado;
    protected double valorAdministracion;
    protected double areasComunes;
    

    public CasaUrbana(boolean conjuntoCerrado, double valorAdministracion, double areasComunes, int pisos, int identificadorInmobiliario, int area, String direccion) {
        super(pisos, identificadorInmobiliario, area, direccion);
        this.conjuntoCerrado = conjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
    }
    
public double calcularValor(){
    double valorMetroCuadrado;
    
    if (conjuntoCerrado){
        valorMetroCuadrado = 2500000;
    }else {
        valorMetroCuadrado = 3000000;
    }
    return area * valorMetroCuadrado;
}   
}
