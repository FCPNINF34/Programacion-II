import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Consultorio {

    private String consultas = "consultas.json";
    private String medicos = "medicos.json";

    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // =====================(a)===========================

    public void altaMedicos(List<Medico> lista) throws IOException {
        FileWriter writer = new FileWriter(medicos);
        writer.write(gson.toJson(lista));
        writer.close();
    }

    public void altaConsultas(List<Consulta> lista) throws IOException {
        FileWriter writer = new FileWriter(consultas);
        writer.write(gson.toJson(lista));
        writer.close();
    }

    // =============================(b)===========================

    public void bajaMedico(String nombre, String apellido) throws IOException {
        Reader r1 = Files.newBufferedReader(Paths.get(medicos));
        Medico[] arrMed = gson.fromJson(r1, Medico[].class);
        r1.close();

        Medico eliminado = null;
        for (Medico m : arrMed) {
            if (m.getNombreMed().equals(nombre) &&
                    m.getApellidoMed().equals(apellido)) {
                eliminado = m;
                break;
            }
        }
        if (eliminado == null) return;

        List<Medico> nuevaListaMed = new ArrayList<>();
        for (Medico m : arrMed) {
            if (m.getIdMed() != eliminado.getIdMed())
                nuevaListaMed.add(m);
        }

        FileWriter w1 = new FileWriter(medicos);
        w1.write(gson.toJson(nuevaListaMed));
        w1.close();

        Reader r2 = Files.newBufferedReader(Paths.get(consultas));
        Consulta[] arrCon = gson.fromJson(r2, Consulta[].class);
        r2.close();

        List<Consulta> nuevaListaCon = new ArrayList<>();
        for (Consulta c : arrCon) {
            if (c.getIdMed() != eliminado.getIdMed())
                nuevaListaCon.add(c);
        }

        FileWriter w2 = new FileWriter(consultas);
        w2.write(gson.toJson(nuevaListaCon));
        w2.close();
    }

    // ===========================(c)======================

    public void corregirConsultasFestivas() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(consultas));
        Consulta[] arr = gson.fromJson(reader, Consulta[].class);
        reader.close();


        for (Consulta c : arr) {
            boolean navidad = (c.getDia() == 25 && c.getMes().equals("Diciembre"));
            boolean añoNuevo = (c.getDia() == 1 && c.getMes().equals("Enero"));

            if (navidad || añoNuevo) {
                c.setDia(2);  // ejemplo: mover al día 2
            }
        }

        FileWriter writer = new FileWriter(consultas);
        writer.write(gson.toJson(arr));
        writer.close();
    }
}
