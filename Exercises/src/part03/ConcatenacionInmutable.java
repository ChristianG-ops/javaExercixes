package part03;

public class ConcatenacionInmutable {
    public static void main(String[] args) {
        String valor01 = "Primera parte";
        String valor02 = "Segunda parte";

        String concatenar = valor01.concat(valor02); // concatenar valor01 y 02
        System.out.println("Valores concatenados = " + concatenar); //Imprimir resultado
        System.out.println( valor01 == concatenar); //Validar si son iguales
        
        //Expresiones Lambda       
        
        String transformacion = valor01.transform(c -> {
            return  c.concat( " con ".concat(valor02));
        });

        System.out.println("transformacion = " + transformacion);
        System.out.println("valor01 = " + valor01); // Valor01 Continua siendo inmutable
        concatenar.replace("a","A"); // no cambia nada si no esta asignada en una string
        System.out.println("concatenar sin String = " + concatenar);
        String concatenar02 = concatenar.replace("a","A"); //
        System.out.println("concatenar = " + concatenar02);














    }
}
