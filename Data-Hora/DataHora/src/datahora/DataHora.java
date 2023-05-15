
package datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
       
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDate d09 = LocalDate.parse("20/07/2022 01:30", fmt2);
                
        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);
        
        Duration t1 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
        System.out.println("d01 = "+d01);
        System.out.println("d02 = "+d02);
        System.out.println("d03 = "+d03);
        System.out.println("d04 = "+d04);
        System.out.println("d05 = "+d05);
        System.out.println("d06 = "+d06);
        System.out.println("d07 = "+d07);
        System.out.println("d08 = "+d08);
        System.out.println("d09 = "+d09);
        System.out.println("d04 = "+d04.format(fmt1));
        System.out.println("d06 = "+fmt3.format(d06));
        System.out.println("pastWeek = "+pastWeek);
        System.out.println("nextWeek = "+nextWeek);
        System.out.println("t1 dias = "+t1.toDays());
    }
    
}
