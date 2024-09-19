package practice;

public class EvenOddCheck {
	
	
	public void check() {
		int number = 17; 
        
        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
	}
    public static void main(String[] args) {
        
    	EvenOddCheck ec = new EvenOddCheck();
    	ec.check();
    }
}
