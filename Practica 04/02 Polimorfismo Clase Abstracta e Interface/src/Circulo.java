public class Circulo extends Figura {
    public double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

}
