public class Main {
    public static void main(String[] args) {
        Integer intvalue = 10;
        Long longvalue = intvalue.longValue();
        Double doublevalue = intvalue.doubleValue();
        Short shortvalue = intvalue.shortValue();

        System.out.println(longvalue);
        System.out.println(doublevalue);
        System.out.println(shortvalue);

        //konversi str to number
        String str = "1000";
        Integer INT =  Integer.valueOf(str);
        System.out.println(INT);

    }
}
