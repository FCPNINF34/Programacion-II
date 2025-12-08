public class Medico {
    private int idMed;
    private String nombreMed;
    private String apellidoMed;
    private int añosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int añosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.añosExperiencia = añosExperiencia;
    }

    // Getters
    public int getIdMed() { return idMed; }
    public String getNombreMed() { return nombreMed; }
    public String getApellidoMed() { return apellidoMed; }
    public int getAñosExperiencia() { return añosExperiencia; }
}
