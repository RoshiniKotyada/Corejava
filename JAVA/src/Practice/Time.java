package Practice;
import java.util.Calendar;
public class Time {
	public static void main(String Args[])
	{
		Calendar now = Calendar.getInstance();
	    System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY)+ ":"+ now.get(Calendar.MINUTE)+ ":"+ now.get(Calendar.SECOND));
	    now.add(Calendar.MINUTE,100);
	    System.out.println("New time  : "+ now.get(Calendar.HOUR_OF_DAY)+ ":"+ now.get(Calendar.MINUTE)+ ":"+ now.get(Calendar.SECOND));

	    
	    
	   
	  
	}

}
