package domain;

public abstract class Inmueble {


    private int metrosCuadrados;
    private int ambientes;
    private Zona zona;


    public Inmueble(int metrosCuadrados, int ambientes, Zona zona, Operacion operacion) {
        this.metrosCuadrados = metrosCuadrados;
        this.ambientes = ambientes;
        this.zona = zona;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public double precioPlus(){

        return this.zona.getPlus();

    }

    public double calcularPrecioBase(){
        return 0;
    }


    public double precioTotalInmueble(){
       return 0;
    }

}


