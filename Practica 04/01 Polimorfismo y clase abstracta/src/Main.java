import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];


        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese Nombre del empleado de Tiempo Completo: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese Salario Anual del empleado de Tiempo Completo: ");
            double SalarioAnual = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoCompleto(nombre, SalarioAnual);
        }
        for (int i = 3; i < 5; i++) {
            System.out.print("Ingrese Nombre del empleado de Tiempo Horario: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese Horas Trabajadas del empleado de Tiempo Horario: ");
            double SalarioAnual = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese Tarifas por Horas del empleado de Tiempo Horario: ");
            double Tarifas = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoHorario(nombre, SalarioAnual, Tarifas);
        }

        System.out.println("===========================EMPLEADOS=============================");
        for (int i = 0; i < 5; i++) {
            System.out.println(empleados[i]);
        }
    }
}