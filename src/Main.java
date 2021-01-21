import java.time.*;
import java.util.*;
import java.text.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanInput = new Scanner(System.in);
    List<String> listOfHolidays = new ArrayList<String>();
    listOfHolidays.add("2019-08-15");
    listOfHolidays.add("2019-10-24");
    listOfHolidays.add("2019-04-15");
    listOfHolidays.add("2019-04-14");
    String dateInput = scanInput.nextLine(); 
    String leadDateTimeCalculated = getLeadDateTime(dateInput,listOfHolidays);
    System.out.println(leadDateTimeCalculated);
    scanInput.close();
  }

 public static String getLeadDateTime(String dateInput, List<String> listOfHolidays){
   
   DateTimeFormatter formatingDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   LocalDateTime newDate = LocalDateTime.parse(dateInput, formatingDate);
  for(int i=0; i<listOfHolidays.size(); i++){
    if(newDate.toLocalDate().toString().contains(listOfHolidays.get(i))) {
    	newDate = newDate.plusDays(1);
    	i=0;
    }
  }
  if(newDate.getDayOfWeek().toString().equals("SATURDAY")) {
	  newDate = newDate.plusDays(1).withHour(0).withMinute(0).withSecond(0);
	  System.out.println("inside sat");
  }
  if(newDate.getDayOfWeek().toString().equals("SUNDAY")) {
	  newDate = newDate.plusDays(2).withHour(0).withMinute(0).withSecond(0);
	  System.out.println("inside sun");  
  }
  if(newDate.getHour() >= 16) {
	  newDate = newDate.plusDays(1).withHour(0).withMinute(0).withSecond(0);
  }
  
   return newDate.format(formatingDate).toString(); 
 }

}