package domain;

public class PH extends Inmueble {

    private static double precioPorMetroCuadrado = 14000;
    private static double precioMinimo = 14000;



    public PH(int metrosCuadrados, int ambientes, Zona zona, Operacion operacion) {
        super(metrosCuadrados, ambientes, zona, operacion);
    }

    public double precioTotalInmueble() {
        return PH.precioMinimo+(PH.precioPorMetroCuadrado*this.getMetrosCuadrados());
    }


}
