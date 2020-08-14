package modelos;

import java.util.ArrayList;

public class Notas{
    private double nexamen;
    private double ndeberes; 
    private double nlecciones; 
    private double ntalleres;
    public ArrayList<Paralelo> paralelos;
    
    public double CalcularNota(){
        
        double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
        double notaPractico=(ntalleres)*0.20;
        double nota=notaTeorico+notaPractico;
        
        return nota;
    }
   
    
}
