package part02.variables;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Part02Examen {
    public static void main(String[] args) {
        System.out.println(" ===== Ingrese los datos ==== ");

        Scanner scanner = new Scanner(System.in); //scanner Pattern

        System.out.println(" Ingrese nombre de la factura o descripción: ");
        String name = scanner.next(); // nombre


        System.out.println(" Ingrese el valor: ");
        double valor01 =0;

        try {

            valor01 = scanner.nextDouble();

        } catch (InputMismatchException e){
            System.out.println( " Usar solo numero");
            main(args);
            System.exit(0);
        }
        System.out.println(" Ingrese el valor 02: ");
        double valor02 =0;

        try {

            valor02 = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println( " Usar solo numero");
            main(args);
            System.exit(0);

        }

        System.out.println(" Ingrese el porcentaje: ");
        double por =0;

        try {

            por = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println( " Solo numeros");
            main(args);
            System.exit(0);
        }

        System.out.println(" ======== Datos Ingresados ======= ");
        System.out.println(" nombre de la factura o descripción:" + name);
        System.out.println(" 1. $" + valor01);
        System.out.println(" 2. $" + valor02);
        System.out.println(" Porcentaje: " + por +"%");
        double  suma = valor01 + valor02;
        double  porcentaje = suma * (por/100);
        System.out.println(" ======== Resultado ======= ");

        System.out.println(name + " tiene un total bruto de $"+ suma+" con un impuesto del " +por + "% Es igual a $" +
                porcentaje + " y el monto después de impuestos es de $" +(suma+porcentaje));

        scanner.close();


    }
}
