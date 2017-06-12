package Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
                System.out.println(cal.get(GregorianCalendar.WEEK_OF_YEAR));
                
                cal.add(GregorianCalendar.DATE, 49);
                 System.out.println(cal.get(GregorianCalendar.WEEK_OF_YEAR));
             SimpleDateFormat sf = new SimpleDateFormat();
             sf.applyPattern("K:mm a, z");
             String dateString  = sf.format(date);
             System.out.println(dateString);
             
    }
}