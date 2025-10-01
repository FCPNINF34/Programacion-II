import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int forma = random.nextInt(1, 3);
            if (forma == 1) {
                int l = random.nextInt(1, 11);
                figuras[i] = new Cuadrado(l, "Rojo");
            } else {
                int r = random.nextInt(1, 11);
                figuras[i] = new Circulo(r, "Celeste");
            }
        }

        for (Figura f : figuras) {
            System.out.println("=======================================");
            if (f instanceof Cuadrado) {
                System.out.println("Cuadrado");
                System.out.println("Área: " + f.area());
                System.out.println("Perímetro: " + f.perimetro());
                System.out.println(((Cuadrado) f).comoColorear());
            } else if (f instanceof Circulo) {
                System.out.println("Circulo");
                System.out.println("Área: " + f.area());
                System.out.println("Perímetro: " + f.perimetro());
            }
        }
    }
}