import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Micro{
    private Integer pasajerosQuePuedenIrSentados;
    private Integer pasajerosQuePuedenIrParados;
    private Integer volumen;
    private List<Empleado> empleados=new ArrayList<>();

    public Micro(Integer pasajerosQuePuedenIrSentados, Integer pasajerosQuePuedenIrParados, Integer volumen) {
        this.setPasajerosQuePuedenIrSentados(pasajerosQuePuedenIrSentados);
        this.setPasajerosQuePuedenIrParados(pasajerosQuePuedenIrParados);
        this.setVolumen(volumen);
    }

    public Integer capacidadMicro(){
        return pasajerosQuePuedenIrParados + pasajerosQuePuedenIrSentados;
    }

    public Integer cantidadEmpleados(){
        return empleados.size();
    }

    public Integer lugaresLibres(){
        return capacidadMicro()-cantidadEmpleados();
    }

    public Boolean tenesXLugaresLibres(Integer x){
        return lugaresLibres()>=x;
    }

    public Boolean tenesLugar(){
        return capacidadMicro()>cantidadEmpleados();
    }

    public Boolean sePuedeSubirA(Empleado persona){
        return tenesLugar()&&persona.subir(this);
    }

    public void subirA(Empleado pasajero){
        if(pasajero.subir(this)){
            empleados.add(pasajero);
        }else{
            throw new NoPuedeSubirException("El pasajero no se puede subir a este micro");
        }
    }

    public void bajarA(Empleado pasajero){
        if(empleados.isEmpty()){
            throw new NoPuedeSubirException("No hay pasajeros en el micro");
        }else {
            empleados.remove(pasajero);
        }
    }

    public Empleado quienSubioPrimero(){
        Empleado primerEmpleadoEnSubir = empleados.get(0);
        if (primerEmpleadoEnSubir==null){
            throw new NoPuedeSubirException("No haay pasajeros en el micro");
        }else {
            return primerEmpleadoEnSubir;
        }
    }

    /*** Getters & Setters ***/

    public Integer getPasajerosQuePuedenIrSentados() {
        return pasajerosQuePuedenIrSentados;
    }

    public void setPasajerosQuePuedenIrSentados(Integer pasajerosQuePuedenIrSentados) {
        this.pasajerosQuePuedenIrSentados = pasajerosQuePuedenIrSentados;
    }

    public Integer getPasajerosQuePuedenIrParados() {
        return pasajerosQuePuedenIrParados;
    }

    public void setPasajerosQuePuedenIrParados(Integer pasajerosQuePuedenIrParados) {
        this.pasajerosQuePuedenIrParados = pasajerosQuePuedenIrParados;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }
}
