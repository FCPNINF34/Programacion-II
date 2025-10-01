public class EmpleadoTiempoCompleto extends Empleado {
    public double salario_anual;

    public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
        super(nombre);
        this.salario_anual = salario_anual;
    }

    public double CalcularSalarioMensual() {
        return salario_anual / 12;
    }

    public String toString() {
        return "Nombre: " + nombre + ", \tSalario anual: " + salario_anual + ", \tSalario mensual: " + CalcularSalarioMensual();
    }


}
