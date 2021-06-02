import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Arfian Rafi Pradana";
        String LoweCase = name.toLowerCase();
        String UpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(LoweCase);
        System.out.println(UpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Arfian"));
        System.out.println(name.endsWith("Pradana"));
        String[] names = name.split(" ");
        for(var n: names){
            System.out.println(n);
        }
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(4));
        char[] chars = name.toCharArray();
    }
}
