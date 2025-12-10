import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            Consultorio cons = new Consultorio();

            // ====================(a)======================

            List<Medico> medicos = Arrays.asList(
                    new Medico(1, "Carlos", "Lopez", 10),
                    new Medico(2, "Maria", "Perez", 7),
                    new Medico(3, "Jose", "Rios", 5)
            );

            List<Consulta> consultas = Arrays.asList(
                    new Consulta(101, "Ana", "Mendez", 1, 12, "Julio", 2024),
                    new Consulta(102, "Luis", "Suarez", 2, 25, "Diciembre", 2024), // Navidad
                    new Consulta(103, "Lucia", "Soto", 3, 1, "Enero", 2024),       // Año Nuevo
                    new Consulta(104, "Mario", "Zeballos", 1, 15, "Agosto", 2024),
                    new Consulta(105, "Elena", "Vargas", 2, 2, "Junio", 2024),
                    new Consulta(106, "Oscar", "Molina", 3, 22, "Febrero", 2024),
                    new Consulta(107, "Caro", "Loayza", 1, 3, "Marzo", 2024),
                    new Consulta(108, "Pedro", "Luis", 2, 10, "Abril", 2024),
                    new Consulta(109, "Milton", "Rico", 3, 7, "Mayo", 2024)
            );

            cons.altaMedicos(medicos);
            cons.altaConsultas(consultas);

            System.out.println("Altas realizadas.");

            // ============(b)============
            cons.bajaMedico("Maria", "Perez");
            System.out.println("Baja realizada: Maria Perez");

            // ============(c)============
            cons.corregirConsultasFestivas();
            System.out.println("Modificación de consultas festivas realizada.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
