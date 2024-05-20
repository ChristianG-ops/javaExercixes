package part03;

public class Concatenacion {
    public static void main(String[] args) {
        String valor01 = "Primera parte";
        String valor02 = "Segunda parte";

        String concatenar = valor01 + valor02;
        System.out.println("concatenar = " + concatenar);

        // concatenar con numeros
        int num1 = 1;
        int num2 = 100;

        System.out.println( "Opcion 1 " + concatenar + num1 + num2); // se concatenam los numeros
        System.out.println( "Opcion 2 " + concatenar + (num1 + num2)); // se suman
        System.out.println(  num1 + num2 + " " + concatenar ); // se suman primero, porque arranca con int

        //Otros metodos de concatenar
        String concatMetodo2 = valor01.concat(valor02);
        System.out.println("concatMetodo2 = " + concatMetodo2); // Concant Metodo 1 
        String concatMetodo3 = valor01.concat(" ").concat(valor02);  
        System.out.println("concatMetodo3 = " + concatMetodo3);// concat metodo 2
        String concatMetodo4 = valor01.concat(" ".concat(valor02));
        System.out.println("concatMetodo4 = " + concatMetodo4);
        
        






    }
}
