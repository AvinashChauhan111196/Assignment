package practice;

import java.util.Random;

public class RandomAlphaNumericGenerator {
    public static void main(String[] args) {
        // Generate random alphanumeric string
        String randomAlphaNumeric = generateRandomAlphaNumeric(8); // Change the number to specify desired length
        
        // Print generated random alphanumeric string
        System.out.println("Generated Random AlphaNumeric: " + randomAlphaNumeric);
    }
    
    // Method to generate random alphanumeric string of given length
    public static String generateRandomAlphaNumeric(int length) {
        // Characters to be included in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // StringBuilder to store the random string
        StringBuilder sb = new StringBuilder();
        
        // Random object to generate random indices
        Random random = new Random();
        
        // Build the random string of given length
        for (int i = 0; i < length; i++) {
            // Generate a random index within the range of characters
            int index = random.nextInt(characters.length());
            
            // Append character at the generated index to StringBuilder
            sb.append(characters.charAt(index));
        }
        
        // Convert StringBuilder to String and return
        return sb.toString();
    }
}