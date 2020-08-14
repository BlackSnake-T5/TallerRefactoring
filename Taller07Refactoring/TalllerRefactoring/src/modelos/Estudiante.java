package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    public String matricula;
    public String facultad;
    public ArrayList<Paralelo> paralelos;

    public Estudiante(String matricula, String facultad, ArrayList<Paralelo> paralelos, String nombre, String apellido, int edad, String direccion, String telefono) {
        super(nombre, apellido, edad, direccion, telefono);
        this.matricula = matricula;
        this.facultad = facultad;
        this.paralelos = paralelos;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public double getNotaTotal(Paralelo par){
        for(Paralelo p: paralelos){
            if(p.equals(par)){
                Materia mat= p.getMateria();
                return mat.getNotaTotal();
            }
        }
        return -1;
    }
}