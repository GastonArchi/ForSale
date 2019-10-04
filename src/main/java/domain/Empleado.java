package domain;

public class Empleado {


    public void reservarInmueble(Operacion unaOperacion, Cliente unCliente){

        unaOperacion.serReservada(unCliente, this);


    }


}
