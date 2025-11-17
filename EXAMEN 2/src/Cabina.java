import java.util.*;

public class Cabina {
    private int nroCabina;
    private List<Persona> personasAbordo;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        personasAbordo = new ArrayList<>();
    }

    public double PesoTotal() {
        double total = 0;
        for (Persona p : personasAbordo) {
            total += p.getPesoPersona();
        }
        return total;
    }

    //=============(a)===============
    public void agregarPersona(Persona p) {
        if (personasAbordo.size() >= 10 || PesoTotal() > 850) {
            System.out.println("Maximo 10 personas");
            System.out.println("Peso Maximo 850kg");
        } else {
            personasAbordo.add(p);
            System.out.println("Persona Agregada");
        }
    }

    //==============(b)==================
    public boolean cumpleReglas() {
        if (personasAbordo.size() > 10) {
            return false;
        }
        if (PesoTotal() > 850) {
            return false;
        }
        return true;
    }

    //===================(c)===============
    public double calcularIngreso() {
        double total = 0;
        for (Persona p : personasAbordo) {
            if (p.getEdad() < 25 || p.getEdad() > 60) {
                total += 1.5;
            } else {
                total += 3;
            }
        }
        return total;
    }
}
