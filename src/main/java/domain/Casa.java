package domain;

public class Casa extends Inmueble {

    private double valorBase;

    public Casa(int metrosCuadrados, int ambientes, Zona zona, Operacion operacion, int valorCasa) {
        super(metrosCuadrados, ambientes, zona, operacion);
        valorBase = valorCasa;
    }


    public double precioTotalInmueble() {
        return this.valorBase+precioPlus();
    }
}
