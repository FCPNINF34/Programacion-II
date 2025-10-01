public class Cuadrado extends Figura implements Coloreado {
    public double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return lado * 4;
    }

    public String comoColorear() {
        return "Colorear los 4 lados";
    }

}
