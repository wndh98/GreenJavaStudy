package api05_data_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		StringBuilder dateTime = new StringBuilder();
		dateTime.append(now.getYear()+"-");
		
		
		
		//ZonedDateTime
	      ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
	      System.out.println("협정 세계시: "+ utc);
	      ZonedDateTime stz = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
	      System.out.println("서울 타임존: "+ stz);
	      ZoneOffset szo = stz.getOffset();
	      System.out.println("서울 시차: "+ szo);
	      ZoneId szi = stz.getZone();
	      System.out.println("서울 타임존 ID: "+ szi);
	      
	      Instant instant1 = Instant.now();
	      Thread.sleep(1000);
	      Instant instant2 = Instant.now();
	      if(instant1.isBefore(instant2)) System.out.println("instant1이 빠릅니다.");
	      else if(instant1.isAfter(instant2)) System.out.println("instant2가 빠릅니다.");
	      else System.out.println("동일한 시간입니다.");
	      
	      System.out.println("차이(nanos): "+ instant1.until(instant2, ChronoUnit.NANOS));
		
	}
}
