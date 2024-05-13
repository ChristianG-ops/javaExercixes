public class PrimitivosFloat {

    static float Flotante; //Para usar esta variable dentro del método "Static" (Mira en la línea de abajo la n4
    public static void main(String[] args) {
        float   realFloat = 1; // Representa un flotante sea un decimal, el va colocar el .0
        float   realFloat02 = 1.0f; // Para usar él . Tenemos que colocar la 'f' para que el sepa que quiero un Float
        float   realFloat03 = 2.23e3f; // Resultado: 2230.0 - Exponente es lo mismo que multiplicado por 10 elevado a la 3.
        float   realFloat04 = 2.1e4f; // Resultado: 21000.0 - A partir del punto se cuenta y donde no haya más numerous pone 0
        float   realFloat05 = 2.0e-10f; // Menos es a la izquierda 2.0 = 000000002
        float   realFloat06 = 0000000002.0f; // Resultado: 2.0e-10

        System.out.println("realFloat06 = " + realFloat06);
        System.out.println("realFloat05 = " + realFloat05);
        System.out.println("realFloat04 = " + realFloat04);
        System.out.println("realFloat03 = " + realFloat03);
        System.out.println("args = " + realFloat);
        System.out.println("args = " + realFloat02);
        //NOTAS: Lo que esta antes del 'e' exponent se le conoce como mantisa ex. 2.0E10 el 2.0 = mantisa
        // Estos numerous se conocen como Notation scientific
        System.out.println(" ____________________________________________ ");
        System.out.println(" El valor en bytes = " + Float.BYTES );
        System.out.println(" El valor en bites = " + Float.SIZE );
        System.out.println(" El MINIMO valor es = " + Float.MIN_VALUE );
        System.out.println(" El MAXIMO valor es = " + Float.MAX_VALUE );

        double doble = 3.4028235E39D;

        System.out.println(" ____________________________________________ ");
        System.out.println(" El valor en bytes = " + Double.BYTES );
        System.out.println(" El valor en bites = " + Double.SIZE );
        System.out.println(" El MINIMO valor es = " + Double.MIN_VALUE );
        System.out.println(" El MAXIMO valor es = " + Double.MAX_VALUE );


        // Ahora con la VAR

        var varFloat = 3.1423e12f; //para definir como float se tiene que colocar la letra F
        System.out.println("varFloat = " + varFloat);
        System.out.println("varFloat = " + Flotante); //Para ver el valor por defecto de la clase

        //



    }
}
