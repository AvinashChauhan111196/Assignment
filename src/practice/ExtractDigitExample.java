package practice;

public class ExtractDigitExample {
    public static void main(String[] args) {
        
        String input = "ABCDE12345";
        
        
        StringBuilder digits = new StringBuilder();
        
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            
            if (Character.isDigit(ch)) {
                digits.append(ch); 
            }
        }
        
        
        System.out.println("Digits extracted: " + digits.toString());
    }
}