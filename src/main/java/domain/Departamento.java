package domain;

public class Departamento extends Inmueble {

    private static double precioPorAmbiente = 350000;

    public Departamento(int metrosCuadrados, int ambientes, Zona zona, Operacion operacion) {
        super(metrosCuadrados, ambientes, zona, operacion);
    }

    public double precioTotalInmueble() {
        return this.getAmbientes()*Departamento.precioPorAmbiente;
    }
}
