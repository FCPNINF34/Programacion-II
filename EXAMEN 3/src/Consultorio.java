import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Consultorio {

    private String consultas;   // archivo consultas.json
    private String medicos;     // archivo medicos.json

    public Consultorio(String consultas, String medicos) {
        this.consultas = consultas;
        this.medicos = medicos;
    }

    // -------------------------------------------------------------
    // MÉTODOS GENÉRICOS DE LECTURA Y ESCRITURA (estilo PDF)
    // -------------------------------------------------------------

    private List<Medico> leerMedicos() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(medicos));
            List<Medico> lista = gson.fromJson(reader, new TypeToken<List<Medico>>(){}.getType());
            reader.close();
            return (lista != null) ? lista : new ArrayList<>();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void grabarMedicos(List<Medico> lista) {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter(medicos);
            String jsonString = gson.toJson(lista);
            writer.write(jsonString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Consulta> leerConsultas() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(consultas));
            List<Consulta> lista = gson.fromJson(reader, new TypeToken<List<Consulta>>(){}.getType());
            reader.close();
            return (lista != null) ? lista : new ArrayList<>();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void grabarConsultas(List<Consulta> lista) {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter(consultas);
            String jsonString = gson.toJson(lista);
            writer.write(jsonString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------
    // A) ALTAS: 3 médicos y 9 consultas
    // -------------------------------------------------------------

    public void cargarMedicosIniciales() {
        List<Medico> lista = new ArrayList<>();

        lista.add(new Medico(1, "Juan", "Perez", 10));
        lista.add(new Medico(2, "Maria", "Lopez", 7));
        lista.add(new Medico(3, "Carlos", "Rojas", 12));

        grabarMedicos(lista);
    }

    public void cargarConsultasIniciales() {
        List<Consulta> lista = new ArrayList<>();

        lista.add(new Consulta(101, "Pedro", "Soto", 1, 25, "diciembre", 2024));
        lista.add(new Consulta(102, "Ana", "Mendez", 1, 31, "diciembre", 2024));
        lista.add(new Consulta(103, "Luis", "Roca", 1, 1, "enero", 2024));

        lista.add(new Consulta(104, "Sofi", "Rios", 2, 10, "marzo", 2024));
        lista.add(new Consulta(105, "Marco", "Cruz", 2, 5, "abril", 2024));
        lista.add(new Consulta(106, "Rocio", "Torrez", 2, 8, "junio", 2024));

        lista.add(new Consulta(107, "Elena", "Vega", 3, 14, "julio", 2024));
        lista.add(new Consulta(108, "Erick", "Roman", 3, 3, "agosto", 2024));
        lista.add(new Consulta(109, "Diego", "Quispe", 3, 10, "septiembre", 2024));

        grabarConsultas(lista);
    }

    // -------------------------------------------------------------
    // B) BAJA: eliminar médico y sus consultas
    // -------------------------------------------------------------

    public void bajaMedico(String nombre, String apellido) {

        List<Medico> med = leerMedicos();
        List<Consulta> con = leerConsultas();

        if (med.isEmpty()) {
            System.out.println("No hay médicos para eliminar.");
            return;
        }

        int idEliminar = -1;

        for (Medico m : med) {
            if (m.getNombreMed().equalsIgnoreCase(nombre)
                    && m.getApellidoMed().equalsIgnoreCase(apellido)) {

                idEliminar = m.getIdMed();
                break;
            }
        }

        if (idEliminar == -1) {
            System.out.println("Médico NO encontrado.");
            return;
        }

        // eliminar médico
        med.removeIf(m -> m.getIdMed() == idEliminar);

        // eliminar consultas del médico
        con.removeIf(c -> c.getIdMed() == idEliminar);

        // guardar cambios
        grabarMedicos(med);
        grabarConsultas(con);
    }

    // -------------------------------------------------------------
    // C) CAMBIAR día de consultas en Navidad y Año Nuevo
    // -------------------------------------------------------------

    public void corregirConsultasNavidadAñoNuevo() {

        List<Consulta> lista = leerConsultas();

        for (Consulta c : lista) {

            boolean navidad = (c.getDia() == 25 && c.getMes().equalsIgnoreCase("diciembre"));
            boolean añoNuevo1 = (c.getDia() == 31 && c.getMes().equalsIgnoreCase("diciembre"));
            boolean añoNuevo2 = (c.getDia() == 1 && c.getMes().equalsIgnoreCase("enero"));

            if (navidad || añoNuevo1 || añoNuevo2) {
                c.setDia(2);
            }
        }

        grabarConsultas(lista);
    }
}
