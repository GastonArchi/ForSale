package domain;

public class Cliente {

    private String nombre;

    public void solicitarReserva(Operacion unaOperacion, Empleado unEmpleado){

        unEmpleado.reservarInmueble(unaOperacion, this);

    }

}
