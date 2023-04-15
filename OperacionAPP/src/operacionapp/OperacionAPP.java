package operacionapp;

import operacionapp.operacion.Operacion;

public class OperacionAPP {

    public static void main(String[] args) {

        
        Operacion op2 = new Operacion(12, 18);
        op2.sumar();

        Operacion op = new Operacion();

        op.crearOperacion();

        op.sumar();
        op.restar();
        op.mult();
        op.div();

    }

}
