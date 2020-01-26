public class Fiaca implements Empleado {
    public Boolean subir(Micro micro){
        return micro.cantidadEmpleados()<micro.getPasajerosQuePuedenIrSentados();
    }
}
