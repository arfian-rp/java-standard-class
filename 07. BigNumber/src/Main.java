import java.math.BigInteger;

public class Main {
    //ketika menggunakan value lebih tinggi dari long dan decimal
    //method di BigInteger & BigDecimal
    //add               +
    //substract         -
    //multiply          *
    //mod               %
    //dst...
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000");
        BigInteger b = new BigInteger("10000000000000");
        BigInteger result = a.add(b);
        System.out.println(result);
    }
}
