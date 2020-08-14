package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public String codigo;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido,int edad, String direccion, String telefono) {
        super(nombre, apellido, edad, direccion, telefono);
        this.codigo = codigo;
        paralelos= new ArrayList<>();
    }

    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= info.añosdeTrabajo*600 + info.BonoFijo;
        return sueldo;
    }
}