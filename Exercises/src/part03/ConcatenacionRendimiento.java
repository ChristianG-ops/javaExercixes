package part03;

public class ConcatenacionRendimiento {
    public static void main(String[] args) {

      String valo01 = "a";
      String valo02 = "b";
      String valo03 = valo01; // Es igual a "a"

        // we're going to validate the performance in milliseconds
        StringBuilder sb = new StringBuilder(valo01);
        long start = System.currentTimeMillis();
        // inicializa   /se evalua /Incrementa i++ es I igual a:   1 = 1+1
        for ( int i = 0;i < 500;i ++){
            //System.out.println(i + (valo01.concat(valo02).concat("\n"))); // Imprimir junto con el Counter
            //valo03 = valo03.concat(valo01).concat(valo02).concat("\n"); // 500 => 2ms
            //valo03 += valo01+valo02+"\n"; // 500 => 12ms
            sb.append(valo01).append(valo02).append("\n");


        }

        long end = System.currentTimeMillis();
        System.out.println( "demoro:" + (end - start));
        System.out.println( "StringBuilder:" + sb.toString());












    }
}
