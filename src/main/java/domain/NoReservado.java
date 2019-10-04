package domain;

public class NoReservado extends EstadoDeOperacion {

    public boolean puedoReservar(){

        return true;

    }

    public void reservar(Cliente unCliente, Empleado unEmpleado, Operacion unaOperacion) {

        unaOperacion.setEstado(new Reservado());
    }

}
