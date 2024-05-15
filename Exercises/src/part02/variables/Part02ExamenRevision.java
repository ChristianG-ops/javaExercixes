package part02.variables;
import java.util.Scanner;
public class Part02ExamenRevision {
    public static void main(String[] args) {

            Scanner Scanner = new Scanner(System.in);
            System.out.println("proporcione el nombre de la factura");
            String nombreFactura1 = Scanner.nextLine();
            System.out.println("proporcione el valor 1 de la factura");
            double valorFactura1 = Scanner.nextDouble();
            System.out.println("proporcione el valor de la factura 2");
            double valorFactura2 = Scanner.nextDouble();


            double sumaFacturas = (valorFactura1+valorFactura2);
            double porcentaje = sumaFacturas*0.19;
            double sumaFacturasPorcentaje = porcentaje+sumaFacturas;
            System.out.println("el suma de las facturas de "+nombreFactura1+ " es "+ sumaFacturas+" y su monto después del impuesto es "+sumaFacturasPorcentaje);
}}

