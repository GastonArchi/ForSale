package domain;

public class Venta extends Operacion {


    private static double porcentajeDeComision = 1.5;

    public Venta(Inmueble inmueble) {
        super(inmueble);
    }

    public double calcularComision(){


        return  (inmueble.precioTotalInmueble()*porcentajeDeComision)/100;


    }

}
