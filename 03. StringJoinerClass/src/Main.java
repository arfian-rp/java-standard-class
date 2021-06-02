import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(
                "$$","[","]"
        );
        joiner.add("Arfian");
        joiner.add("pradana");
        String val = joiner.toString();
        System.out.println(val);
    }
}
