package datesExamples;

// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.time.chrono.JapaneseDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dates {
    
    public static void main(String[] args) {
        // LocalDate myDate = LocalDate.now();
        LocalDateTime today = LocalDateTime.now();
        // JapaneseDate jDate = JapaneseDate.from(myDate);

        System.out.println("Today's date time (no formatting) : " + today);

        String sDate = today.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO Date time : " + sDate);

        String fDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Formatted with medium formatstyle : " + fDate);

        // a method that you can try with dates etc
        // myDate = myDate.minusMonths(4);


    }
}
