package domain;

public abstract class Operacion {

    protected Inmueble inmueble;
    private EstadoDeOperacion estado;

    public Operacion(Inmueble inmueble) {
        this.inmueble = inmueble;
        this.estado = new NoReservado();
    }

    public void serReservada(Cliente unCliente, Empleado unEmpleado, Operacion unaOperacion){


        estado.reservar(unCliente, unEmpleado, this);


    }

    public void setEstado(EstadoDeOperacion estado) {
        this.estado = estado;
    }

    protected double calcularComision(){

        return 0;

    }
}
