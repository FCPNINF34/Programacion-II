import java.util.*;

public class MiTeleferico {
    private List<Linea> lineas;
    private float cantidadIngresos;

    public MiTeleferico() {
        lineas = new ArrayList<>();
        lineas.add(new Linea("Rojo"));
        lineas.add(new Linea("Amarillo"));
        lineas.add(new Linea("Verde"));
    }

    public void agregarPersonaFila(Persona p, String linea) {

    }

    public void agregarCabina(String linea) {

    }
    //=================(b)==================
    public void verificarLineas() {
        for (Linea l : lineas) {
            if (!l.verificarCabinas()) {
                System.out.println("No se cumple las reglas");
            }
        }
        System.out.println("Se cumplen las reglas");
    }

    //=================(c)====================
    public void calcularIngresoTotal() {
        double total = 0;
        for (Linea l : lineas) {
            total += l.calcularIngresoLinea();
        }
        System.out.println("Total de Ingresos: " + total);
    }

}
