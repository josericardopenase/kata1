package kata1;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(1949, 9, 24);
        Person person = new Person("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
