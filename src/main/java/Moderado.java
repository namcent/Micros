public class Moderado implements Empleado {
    private Integer x;
    public Boolean subir(Micro micro){
        return micro.tenesXLugaresLibres(x); //hago la cuenta en micros para pasarle la x de cada moderado
    }
}
