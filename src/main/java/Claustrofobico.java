public class Claustrofobico implements Empleado {
    public Boolean subir(Micro micro) {
        return micro.getVolumen() > 120;
    }

}

