package practice;

public class ReverseString {
	
	public void reverse() {	
	String str="Welcome To Java",rev="";
	int lenth=str.length();
	for(int i=lenth-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString st= new ReverseString();
		st.reverse();
	}

}
