public class Main {
//    String x = "INI STR ";
//    x = x + "INI ST2";
//    tidak direkomendasikan karena boros memory

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Arfian");
        builder.append(" ");
        builder.append("pradana");
        String name = builder.toString();
        //lebih hemat memory
    }
}
