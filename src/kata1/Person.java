package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName(){
        return this.name;
    }

    public Calendar getBirthdate(){
        return this.birthdate;
    }

    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();

        return (int) (milliSecondsPerYear(today.getTimeInMillis() - this.birthdate.getTimeInMillis()));
    }

    private long milliSecondsPerYear(long milles){
        return milles / this.MILLISECONDS_PER_YEAR;
    }

}
