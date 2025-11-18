abstract class Empleado {
    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double CalcularSalarioMensual();

    public String toString() {
        return "Empleado: " + nombre;
    }
}


