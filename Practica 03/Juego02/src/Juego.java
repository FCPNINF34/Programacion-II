public class Juego {
    public int numeroDeVidas;
    public int recod;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public void reiniciaPartida() {
        System.out.println("Nueva Partida");
    }

    public void actualizaRecord() {
        recod = numeroDeVidas;
        System.out.println("Nuevo record: " + recod);
    }

    public boolean quitaVida() {
        numeroDeVidas = numeroDeVidas - 1;
        if (numeroDeVidas > 0) {
            return true;
        } else {
            return false;
        }
    }
}
