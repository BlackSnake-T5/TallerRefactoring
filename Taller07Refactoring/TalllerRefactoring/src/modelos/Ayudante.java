package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    protected Estudiante est;
    public ArrayList<Paralelo> paralelosA;

    Ayudante(Estudiante e){
    	est = e;
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
