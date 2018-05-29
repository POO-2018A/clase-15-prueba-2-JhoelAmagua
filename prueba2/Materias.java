
package prueba2;

public class Materias {
    private String nombremateria;
    private int nivel;

    public Materias(String nombremateria, int nivel) {
        this.nombremateria = nombremateria;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Materias: " + nombremateria +" - "+ nivel + " Nivel";
    }
    
    public String getNombremateria() {
        return nombremateria;
    }

    public void setNombremateria(String nombremateria) {
        this.nombremateria = nombremateria;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    
}
