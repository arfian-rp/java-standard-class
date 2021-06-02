import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String nama = "Arfian Rafi Pradana";
        StringTokenizer tokenizer = new StringTokenizer(nama, " ");

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
