package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName(){
        return this.name;
    }

    public Date getBirthdate(){
        return this.birthdate;
    }

    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }

}
