package domain;

public class Alquiler extends Operacion {


    private int mesesAlquiler;


    public Alquiler(Inmueble inmueble, int mesesAlquiler) {
        super(inmueble);
        this.mesesAlquiler = mesesAlquiler;

    }


    public double calcularComision(){

        return (this.mesesAlquiler*this.inmueble.precioTotalInmueble())/50000;

    }


}
