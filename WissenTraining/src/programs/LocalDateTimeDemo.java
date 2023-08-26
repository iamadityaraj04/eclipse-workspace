package programs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		
		//date&time
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current Date and Time: "+currentTime);
		
		//date
		LocalDate localDate=currentTime.toLocalDate();
		System.out.println("Date: "+localDate);
		
		DateTimeFormatter FORMAT =DateTimeFormatter.ofPattern("MM/dd/yy");
		String strDate=localDate.format(FORMAT);
		System.out.println("Formatted date: "+strDate);
		
		LocalTime localTime=currentTime.toLocalTime();
		System.out.println("LocalTime: " +localTime);
		
		int month=localDate.getMonthValue();
		int day=localDate.getDayOfMonth();
		int year=localDate.getYear();
		
		System.out.println("Date is: "+day+"-"+month+"-"+year);
		
		int hr=currentTime.getHour();
		int min=currentTime.getMinute();
		int sec=currentTime.getSecond();
		
		System.out.println("Time: "+hr+":"+min+":"+sec);
		
		
		LocalTime lt1=LocalTime.now(ZoneId.of("Australia/Melbourne"));
		System.out.println("Current time in Melbourne: "+lt1);
		
		LocalTime lt2=LocalTime.now(ZoneId.of("Singapore"));
		System.out.println("Current time in Singapore: "+lt2);
		
		LocalTime lt3=LocalTime.now(ZoneId.of("Japan"));
		System.out.println("Current time in Japan: "+lt3);
		
		Set<String> list=ZoneId.getAvailableZoneIds();
		System.out.println("Zone List...");
		list.forEach(x->System.out.println(x));
	}
}
