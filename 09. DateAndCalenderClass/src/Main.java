import java.lang.ref.Cleaner;
import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.YEAR, 2007);
        calender.set(Calendar.MONTH, 0);
        calender.set(Calendar.HOUR_OF_DAY, 18);
        Date result = calender.getTime();
        System.out.println(result);
    }
}
