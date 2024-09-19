package practice;

public class PrintNumber {
	
	int i = 1;
	public void wholeLoop()
	{
		while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
	}

	public void forLoop()
	{
		for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
	}
	public static void main(String[] args) {
		
		PrintNumber p = new PrintNumber();
		//p.wholeLoop();
		p.forLoop();
	        

}
}
