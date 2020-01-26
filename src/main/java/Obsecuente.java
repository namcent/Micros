public class Obsecuente implements Empleado {
    public Empleado jefe;
    public Boolean subir(Micro micro){
        return jefe.subir(micro);
    }
}
