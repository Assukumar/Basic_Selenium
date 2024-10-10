package practice;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Calendar {
       @Test
    	   public void date() {
    	// Fetch the current system date
           Date currentDate = new Date();
           System.out.println(currentDate);
           SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss");
           String formattedDate = dateFormatter.format(currentDate);

           // Print the current system date
           System.out.println("Current System Date: " + formattedDate);

    	   
       }
       @Test
       public void rDate() {
    	   
           SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-YYYY");
           java.util.Calendar calendar=dateFormatter.getCalendar();
           calendar.add(calendar.getFirstDayOfWeek(), 30);
           String formattedDate =dateFormatter.format(calendar.getTime());
           System.out.println(formattedDate);
	}
}
