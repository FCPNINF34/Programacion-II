public class Main {
    public static void main(String[] args) {
        MiTeleferico MiTeleferico = new MiTeleferico();

        //========(a)==========
        Persona P1 = new Persona("Pepe", 20, 60);
        Cabina C1 = new Cabina(1);
        Linea L1 = new Linea("Rojo");
        C1.agregarPersona(P1);
        L1.agregarCabina(1);
        //=============(b)====================
        MiTeleferico.verificarLineas();

        //==========================(c)==============
        MiTeleferico.calcularIngresoTotal();
    }
}