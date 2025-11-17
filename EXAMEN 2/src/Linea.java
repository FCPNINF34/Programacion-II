import java.util.*;

public class Linea {
    private String color;
    private List<Persona> filaPersonas;
    private List<Cabina> cabinas;
    private int cantidadCabinas;

    public Linea(String color) {
        this.color = color;
        cabinas = new ArrayList<>();
        filaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        filaPersonas.add(p);
    }

    public void agregarCabina(int nroCab) {
        cabinas.add(new Cabina(nroCab));
    }

    //============(b)==============
    public boolean verificarCabinas() {
        for (Cabina c : cabinas) {
            if (!c.cumpleReglas()) {
                return false;
            }
        }
        return true;
    }

    //===================(c)============
    public double calcularIngresoLinea() {
        double total = 0;
        for (Cabina c : cabinas) {
            total += c.calcularIngreso();
        }
        return total;
    }

    public String getColor() {
        return color;
    }
}
