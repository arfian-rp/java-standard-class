import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String name = "Arfian Rafi Pradana";
        Pattern patern = Pattern.compile("[aA-zZ]");
        Matcher matcher = patern.matcher(name);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
