package modelos;

public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private Notas notaInicial;
    private Notas notaFinal;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Notas getNotaInicial() {
        return notaInicial;
    }

    public void setNotaInicial(Notas notaInicial) {
        this.notaInicial = notaInicial;
    }

    public Notas getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Notas notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public double getNotaTotal(){
        return (notaInicial.CalcularNota()+notaFinal.CalcularNota())/2;
    }
    
}
