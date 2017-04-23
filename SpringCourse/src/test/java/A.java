import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sahar on 2017-04-05.
 */
class A{
    static int total = 10;
    public void call() {
        int total = 5;
        System.out.println(this.total);
    }
    public static void main (String args []) {
       A a = new A();
        System.out.println(a.isLeapYear(2004));
    }

    public boolean isLeapYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(year, 1, 1);
        int days = cal.getMaximum(Calendar.DAY_OF_MONTH);
        return (days == 29);
    }
}