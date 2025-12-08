public class Consulta {
    private int ci;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int idMed;
    private int dia;
    private String mes;
    private int año;

    public Consulta(int ci, String nombrePaciente, String apellidoPaciente, int idMed,
                    int dia, String mes, int año) {
        this.ci = ci;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.idMed = idMed;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Getters y setters obligatorios
    public int getCi() { return ci; }
    public String getNombrePaciente() { return nombrePaciente; }
    public String getApellidoPaciente() { return apellidoPaciente; }
    public int getIdMed() { return idMed; }
    public int getDia() { return dia; }
    public String getMes() { return mes; }
    public int getAño() { return año; }

    public void setDia(int d) { this.dia = d; }
}
