public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int n) {
        if (n % 2 != 0 && n >= 0 && n <= 10) {
            return true;
        } else if (n % 2 == 0) {
            System.out.println("Error debe ser numero Impar");
            return false;
        } else {
            return true;
        }

    }
}
