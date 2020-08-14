package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    protected Estudiante est;
    public ArrayList<Paralelo> paralelosA;

    Ayudante(String matricula, String facultad, String nombre, String apellido, int edad, String direccion, String telefono) {
        super( matricula, facultad, nombre, apellido,  edad, direccion,telefono);

    }
        
    public void agregarParalelo(Paralelo p){
        paralelosA.add(p);
    }


    public void MostrarParalelos(){
        for(Paralelo par:paralelosA){
            //Muestra la info general de cada paralelo
        }
    }
}
