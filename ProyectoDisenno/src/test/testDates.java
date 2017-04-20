package test;

import java.sql.Date;
import java.sql.Time;


public class testDates {
    
    public static void main(String args[])
    {        
        long milis = System.currentTimeMillis();
        System.out.println(milis);
        Date date = new Date(milis);        
        Time time = new Time(1,1,1);        
        System.out.println(date.toString());
        System.out.println(time.toString());
    }
    
}
