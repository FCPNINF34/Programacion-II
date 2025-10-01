public class EmpleadoTiempoHorario extends Empleado {
    public double horas_trabajadas;
    public double tarifa_por_hora;

    public EmpleadoTiempoHorario(String nombre, double horas_trabajadas, double tarifa_por_hora) {
        super(nombre);
        this.horas_trabajadas = horas_trabajadas;
        this.tarifa_por_hora = tarifa_por_hora;
    }

    public double CalcularSalarioMensual() {
        return horas_trabajadas * tarifa_por_hora;
    }

    public String toString() {
        return "Nombre: " + nombre + ", \tHoras trabajadas: " + horas_trabajadas + ", \tTarifa por hora: " + tarifa_por_hora + ", \tSalario Mensual: " + CalcularSalarioMensual();
    }
}
