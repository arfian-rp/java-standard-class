import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<10;i++){
            int val = random.nextInt(1000);
            System.out.println(val);
        }
    }
}
