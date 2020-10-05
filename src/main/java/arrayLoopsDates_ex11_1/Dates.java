package arrayLoopsDates_ex11_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dates {
    public static void main(String[] args) {
        LocalDateTime newDate = LocalDateTime.now();
        String orderDate = newDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        System.out.println(orderDate);
    }
}
