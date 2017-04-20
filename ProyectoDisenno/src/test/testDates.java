package test;


import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class testDates {
    
    public static void main(String args[])
    {        
        long milis = System.currentTimeMillis();
        System.out.println(milis);
        Date date = new Date(milis);        
        Time time = new Time(1,1,1);        
        System.out.println(date.getTime());
        System.out.println(time.toString());
        
        String startDateString = "06/27/2007";
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
    Date startDate;
    try {
        startDate = (Date) df.parse(startDateString);
        System.out.println(" --- ");
        System.out.println(startDate.getTime());
        
        String newDateString = df.format(startDate);
        System.out.println(newDateString);
    } catch (ParseException e) {
        e.printStackTrace();
    }
        
    String test = "06/27/2007 00:00:00";           
    System.out.println(test.split("\\s+")[0]);
    String text = "00:00:00";
    System.out.println(text.split(":")[0]);
    
    
    }
    
    public void test()
    {
      
    }
    
}
