public class Aplicacion {
    public static void main(String[] args) {
        JuegoAdivinaNumero Juego01 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar JuegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar JuegoImpar = new JuegoAdivinaImpar(3);

        Juego01.Juega();
        JuegoPar.Juega();
        JuegoImpar.Juega();
    }
}