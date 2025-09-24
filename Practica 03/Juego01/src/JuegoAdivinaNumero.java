import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    public int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void Juega() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        reiniciaPartida();
        numeroAAdivinar = rand.nextInt(11);

        while (true) {
            System.out.print("Adivine un numero del 1 al 10: ");
            int n = sc.nextInt();
            if (n == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (n > numeroAAdivinar) {
                        System.out.println("El numero es MENOR te quedan " + numeroDeVidas + " vidas");
                    } else {
                        System.out.println("El numero es MAYOR te quedan " + numeroDeVidas + " vidas");
                    }
                } else {
                    System.out.println("Sin Vidas");
                    break;
                }
            }
        }
    }
}
