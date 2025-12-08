public class Main {
    public static void main(String[] args) {

        Consultorio c = new Consultorio("consultas.json", "medicos.json");

        c.cargarMedicosIniciales();
        c.cargarConsultasIniciales();

        c.bajaMedico("Juan", "Perez");

        c.corregirConsultasNavidadAñoNuevo();
    }
}
