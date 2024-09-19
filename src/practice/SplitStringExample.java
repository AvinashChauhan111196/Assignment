package practice;

public class SplitStringExample {
    public static void main(String[] args) {
        
        String a = "Welcome To Java";
        
        
        int spaceCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        
        String[] words = a.split(" ");
        
        
        System.out.println("Number of spaces in the string: " + spaceCount);
        
        
        if (words.length > 0) {
            System.out.println("First word: " + words[0]);
        } else {
            System.out.println("No words found");
        }
    }
}