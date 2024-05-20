package part03;

public class ValidateString {
    public static void main(String[] args) {

        // Validar el contenido de las Strings

        String valo01 = "El curso de JAVA";
        String valo02 = new String("El curso de jAVA");

        boolean esIgual = valo02 == valo01 ;
        System.out.println("esIgual String - newString = " + esIgual); // va ser un false

        String valo03 = "El curso de JAVA";
        esIgual = valo01 == valo03;
        System.out.println("esIgual String to String = " + esIgual);

        esIgual = valo01.equals(valo02); // Es Uppercase sensitive
        System.out.println("esIgual equal Case sensitive= " + esIgual);

        esIgual = valo01.equalsIgnoreCase(valo02); // NO ES case sensitive
        System.out.println("esIgual equal NO Case sensitive = " + esIgual);



    }
}
