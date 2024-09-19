package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateExample {
    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();
        
        System.out.println("Current Date: " + currentDate);
                
        String currentDateStr = currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Current Date as String: " + currentDateStr);
        
        String currentDateAsString = getCurrentDateAsString();
        System.out.println("Returned Current Date as String: " + currentDateAsString);
    }
    
    
    public static String getCurrentDateAsString() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
